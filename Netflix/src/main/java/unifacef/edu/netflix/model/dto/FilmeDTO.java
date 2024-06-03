package unifacef.edu.netflix.model.dto;

public class FilmeDTO {
    private Long id;
    private String nome;
    private float nota;
    private int anoLancamento;


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

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    // lição de casa
    // crie um método que receba FilmeDTO e converta em FilmeEntity
    // crie um método que receba FilmeEntity e converta em FilmeDTO
}
