package med.voll.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import med.voll.api.Models.MedicModel;

public interface MedicRepository extends JpaRepository<MedicModel, Long> { }
