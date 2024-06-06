package unifacef.edu.netflix.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="gerente")
public class GerenteEntity extends FuncionarioEntity {

    private String departamento;

    // Getters e Setters
}
