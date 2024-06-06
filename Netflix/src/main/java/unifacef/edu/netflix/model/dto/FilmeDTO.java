package unifacef.edu.netflix.model.dto;

public class FilmeDTO {
    private Long id;
    private String nome;
    private float nota;
    private int anoLancamento;
    private DiretorDTO diretor;

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

    public DiretorDTO getDiretor() {
        return diretor;
    }

    public void setDiretor(DiretorDTO diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "FilmeDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                ", anoLancamento=" + anoLancamento +
                ", diretor=" + diretor +
                '}';
    }
}
