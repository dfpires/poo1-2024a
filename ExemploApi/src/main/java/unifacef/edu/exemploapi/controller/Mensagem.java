package unifacef.edu.exemploapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mensagem {

    @GetMapping("/noite")
    public String boaNoite(){
        return "Boa noite";
    }

    @GetMapping("/tarde/{nome}")
    public String boaTarde(@PathVariable String nome){
        return "Boa tarde, " + nome;
    }

    @GetMapping("/manha")
    public String bomDia(){
        return "Bom dia";
    }

}
