package unifacef.edu.netflix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.netflix.model.dto.FilmeDTO;
import unifacef.edu.netflix.model.entity.FilmeEntity;
import unifacef.edu.netflix.model.repository.FilmeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired // injeção de dependência
    FilmeRepository injecao;
    public FilmeDTO insere(FilmeDTO filmeDTO){
        // converte para Entity
        FilmeEntity auxEntity = converteDTO(filmeDTO);
        // executamos um método sem instanciar um objeto
        FilmeEntity novoEntity = injecao.save(auxEntity);
        // converte para DTO e retorna
        return converteEntity(novoEntity);
    }

    // converte FilmeEntity em FilmeDTO
    public FilmeDTO converteEntity(FilmeEntity filmeEntity){
        return new FilmeDTO(filmeEntity.getId(), filmeEntity.getNome(),
                filmeEntity.getNota(), filmeEntity.getAnoLancamento());
    }

    // converte FilmeDTO em FilmeEntity
    public FilmeEntity converteDTO(FilmeDTO filmeDTO){
        return new FilmeEntity(filmeDTO.getId(), filmeDTO.getNome(),
                filmeDTO.getNota(), filmeDTO.getAnoLancamento());
    }

    // recupera todos os filmes
    public List<FilmeDTO> consultaTodos(){
        // faz a consulta e recebo uma lista de FilmeEntity
        List<FilmeEntity> todos = injecao.findAll();
        return converteEntities(todos);
    }

    // converte lista de FilmeEntity em uma lista de FilmeDTO
    public List<FilmeDTO> converteEntities(List<FilmeEntity> listaEntity){
        // nova lista de FilmeDTOs
        ArrayList<FilmeDTO> listaDTO = new ArrayList<FilmeDTO>();
        // para cada elemento da lista de FilmeEntity
        for(FilmeEntity objEntity: listaEntity){
            // converte um FilmeEntity em FilmeDTO, e adiciona na nova lista
            listaDTO.add(converteEntity(objEntity));
        }
        return listaDTO;
    }
    // método para recuperar um filme em específico
    public FilmeDTO consultaPorId(Long id){
        // retorna um filme
        Optional<FilmeEntity> optional = injecao.findById(id);
        if (optional.isPresent()) { // tem um filme com este id
            return converteEntity(optional.get());
        }
        return null; // filme não encontrado
    }
    // método para remover um filme
    public String remove(Long id){
        // retorna se removeu ou não
        if (injecao.existsById(id)){ // verifica se o filme existe
            injecao.deleteById(id);
            return "Remoção realizada com sucesso";
        }
        return "Nenhum filme foi removido";
    }
    public List<FilmeDTO> aumentaNotas(){
        List<FilmeEntity> filmes = injecao.findAll();
        for(FilmeEntity filme: filmes){
            filme.setNota(filme.getNota() + 0.50f); // altera a nota
        }
        // salva no banco o vetor alterado
        List<FilmeEntity> filmesEntity = injecao.saveAll(filmes);
        return converteEntities(filmesEntity); // converte para DTO e retorna
    }
}
