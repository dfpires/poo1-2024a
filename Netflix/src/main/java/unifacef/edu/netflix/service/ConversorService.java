package unifacef.edu.netflix.service;

import org.springframework.stereotype.Service;
import unifacef.edu.netflix.model.dto.DiretorDTO;
import unifacef.edu.netflix.model.dto.FilmeDTO;
import unifacef.edu.netflix.model.entity.DiretorEntity;
import unifacef.edu.netflix.model.entity.FilmeEntity;

@Service
public class ConversorService {
    // converte FilmeEntity em FilmeDTO
    public FilmeDTO converteFilmeEntity(FilmeEntity filmeEntity){
        if (filmeEntity == null){
            return null;
        }
        // cria um objeto FilmeDTO
        FilmeDTO aux = new FilmeDTO();
        aux.setId(filmeEntity.getId());
        aux.setNome(filmeEntity.getNome());
        aux.setNota(filmeEntity.getNota());
        aux.setAnoLancamento(filmeEntity.getAnoLancamento());
        aux.setDiretor(converteDiretorEntity(filmeEntity.getDiretor()));
        return aux;
    }

    // converte FilmeDTO em FilmeEntity
    public FilmeEntity converteFilmeDTO(FilmeDTO filmeDTO){
        if (filmeDTO == null){
            return null;
        }
        FilmeEntity aux = new FilmeEntity();
        aux.setId(filmeDTO.getId());
        aux.setNome(filmeDTO.getNome());
        aux.setNota(filmeDTO.getNota());
        aux.setAnoLancamento(filmeDTO.getAnoLancamento());
        aux.setDiretor(converteDiretorDTO(filmeDTO.getDiretor()));
        return aux;
    }
    public DiretorDTO converteDiretorEntity(DiretorEntity diretor){
        if (diretor == null){
            return null;
        }
        DiretorDTO aux = new DiretorDTO();
        aux.setId(diretor.getId());
        aux.setNome(diretor.getNome());
        return aux;
    }
    public DiretorEntity converteDiretorDTO(DiretorDTO diretor){
        if (diretor == null){
            return null;
        }
        DiretorEntity aux = new DiretorEntity();
        aux.setId(diretor.getId());
        aux.setNome(diretor.getNome());
        return aux;
    }
}
