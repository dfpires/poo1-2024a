package unifacef.edu.netflix.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="diretor")
public class DiretorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome")
    private String nome;
    // composição, remoção em cascata, remove um diretor, remove seus filmes
    @OneToMany(mappedBy = "diretor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FilmeEntity> filmes = new ArrayList<>();

}
