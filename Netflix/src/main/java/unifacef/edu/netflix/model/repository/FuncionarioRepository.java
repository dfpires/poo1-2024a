package unifacef.edu.netflix.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edu.netflix.model.entity.FuncionarioEntity;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {


}
