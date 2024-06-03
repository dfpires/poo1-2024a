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

    @GetMapping("/{id}")
    public FilmeDTO consultaPorId(@PathVariable Long id){
        return injecao.consultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable Long id){
        return injecao.remove(id);
    }

    @PutMapping
    public List<FilmeDTO> aumentaNota(){
        return injecao.aumentaNotas();
    }

    @PatchMapping("/{id}")
    public FilmeDTO atualizaPorId(@PathVariable Long id, @RequestBody FilmeDTO filme){
        return injecao.atualizaPorId(id, filme);
    }
}
