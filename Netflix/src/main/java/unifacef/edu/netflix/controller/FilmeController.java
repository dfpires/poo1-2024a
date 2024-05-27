package unifacef.edu.netflix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edu.netflix.model.dto.FilmeDTO;
import unifacef.edu.netflix.model.entity.FilmeEntity;
import unifacef.edu.netflix.service.FilmeService;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    FilmeService injecao;

    // recebe e retorna um FilmeDTO
    @PostMapping
    public FilmeDTO insere(@RequestBody FilmeDTO filmeDTO){

        return injecao.insere(filmeDTO);
    }
    // lista todos os filme
    @GetMapping
    public List<FilmeDTO> consultaTodos(){

        return injecao.consultaTodos();
    }
}
