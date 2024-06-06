package unifacef.edu.netflix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import unifacef.edu.netflix.model.dto.FilmeDTO;
import unifacef.edu.netflix.model.entity.DiretorEntity;
import unifacef.edu.netflix.model.entity.FilmeEntity;
import unifacef.edu.netflix.model.repository.DiretorRepository;
import unifacef.edu.netflix.model.repository.FilmeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FilmeService {

    @Autowired // injeção de dependência
    FilmeRepository injecaoFilme;
    @Autowired
    DiretorRepository injecaoDiretor;
    @Autowired
    ConversorService converser;
    public FilmeDTO insere(FilmeDTO filmeDTO){

        // convert DiretorDTO to DiretorEntity and save it
        DiretorEntity diretorEntity = converser.converteDiretorDTO(filmeDTO.getDiretor());
        diretorEntity = injecaoDiretor.save(diretorEntity);

        // convert FilmeDTO to FilmeEntity
        FilmeEntity auxEntity = converser.converteFilmeDTO(filmeDTO);
        // set the saved DiretorEntity to the FilmeEntity
        auxEntity.setDiretor(diretorEntity);
        System.out.println(auxEntity.toString());
        // save the FilmeEntity
        FilmeEntity novoEntity = injecaoFilme.save(auxEntity);

        // convert to DTO and return
        return converser.converteFilmeEntity(novoEntity);
    }



    // recupera todos os filmes
    public List<FilmeDTO> consultaTodos(){
        // faz a consulta e recebo uma lista de FilmeEntity
        List<FilmeEntity> todos = injecaoFilme.findAll();
        return todos.stream().map(converser::converteFilmeEntity).collect(Collectors.toList());
    }


    // método para recuperar um filme em específico
    public FilmeDTO consultaPorId(Long id){
        // retorna um filme
        Optional<FilmeEntity> optional = injecaoFilme.findById(id);
        if (optional.isPresent()) { // tem um filme com este id
            return converser.converteFilmeEntity(optional.get());
        }
        return null; // filme não encontrado
    }
    // método para remover um filme
    public String remove(Long id){
        // retorna se removeu ou não
        if (injecaoFilme.existsById(id)){ // verifica se o filme existe
            injecaoFilme.deleteById(id);
            return "Remoção realizada com sucesso";
        }
        return "Nenhum filme foi removido";
    }
    public List<FilmeDTO> aumentaNotas(){
        List<FilmeEntity> filmes = injecaoFilme.findAll();
        for(FilmeEntity filme: filmes){
            if (filme.getNota() + 0.5 <= 10) {
                filme.setNota(filme.getNota() + 0.50f); // altera a nota
            }
        }
        // salva no banco o vetor alterado
        List<FilmeEntity> filmesEntity = injecaoFilme.saveAll(filmes);
        return filmesEntity.stream().map(converser::converteFilmeEntity).collect(Collectors.toList()); // converte para DTO e retorna
    }

    public FilmeDTO atualizaPorId(Long id, FilmeDTO filme){
        if (injecaoFilme.existsById(id)){
            filme.setId(id); // adiciona o id no filme que será atualizado
            // converte DTO em Entity
            FilmeEntity filmeEntity = converser.converteFilmeDTO(filme);
            // vai atualizar, pois tem um id que existe no BD
            return converser.converteFilmeEntity(injecaoFilme.save(filmeEntity));
        }
        else return null;
    }

}
