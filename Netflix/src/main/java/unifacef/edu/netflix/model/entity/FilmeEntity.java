package unifacef.edu.netflix.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // classe que é uma entidade de banco de dados
@Table(name="filme") // classe é uma tabela do banco de dados
public class FilmeEntity {
    @Id // chave primário
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="nota")
    private float nota;
    @Column(name="anoLancamento")
    private int anoLancamento;
}
