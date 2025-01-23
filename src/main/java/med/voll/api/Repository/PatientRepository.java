package med.voll.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import med.voll.api.Models.PatientModel;

public interface PatientRepository extends JpaRepository<PatientModel, Long> {
}
