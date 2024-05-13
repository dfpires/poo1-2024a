package unifacef.edu.netflix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.netflix.model.entity.FilmeEntity;
import unifacef.edu.netflix.model.repository.FilmeRepository;

@Service
public class FilmeService {

    @Autowired // injeção de dependência
    FilmeRepository injecao;
    public void insere(FilmeEntity filme){
        // executamos um método sem instanciar um objeto
        injecao.save(filme);
    }
}
