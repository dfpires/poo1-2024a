package unifacef.edu.netflix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unifacef.edu.netflix.model.entity.FilmeEntity;
import unifacef.edu.netflix.service.FilmeService;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    FilmeService injecao;

    @PostMapping
    public FilmeEntity insere(@RequestBody FilmeEntity filmeEntity){
        return injecao.insere(filmeEntity);
    }
}
