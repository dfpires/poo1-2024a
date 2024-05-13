package unifacef.edu.netflix.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edu.netflix.model.entity.FilmeEntity;

public interface FilmeRepository extends JpaRepository<FilmeEntity, Long> {

    // esta interface vai conter todos os métodos de CRUD
    // relacionado ao FilmeEntity
    // Create, Retrieve/Read, Update e Delete
}
