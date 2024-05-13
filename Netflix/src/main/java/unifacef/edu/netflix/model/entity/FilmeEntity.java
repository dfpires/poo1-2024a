package unifacef.edu.netflix.model.entity;

import jakarta.persistence.*;

@Entity // classe que é uma entidade de banco de dados
@Table(name="filme") // classe é uma tabela do banco de dados
public class FilmeEntity {
    @Id // chave primário
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="nota")
    private float nota;
    @Column(name="anoLancamento")
    private int anoLancamento;

    public FilmeEntity() {
    }

    public FilmeEntity(Long id, String nome, float nota, int anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
        this.anoLancamento = anoLancamento;
    }

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
}
