package unifacef.edu.netflix.model.dto;

import unifacef.edu.netflix.model.entity.FilmeEntity;

import java.util.ArrayList;
import java.util.List;

public class DiretorDTO {
    private Long id;
    private String nome;
    private List<FilmeDTO> filmes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<FilmeDTO> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<FilmeDTO> filmes) {
        this.filmes = filmes;
    }

    @Override
    public String toString() {
        return "DiretorDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", filmes=" + filmes +
                '}';
    }
}

