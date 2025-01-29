package med.voll.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import med.voll.api.Models.PatientModel;

public interface PatientRepository extends JpaRepository<PatientModel, Long> {
    Page<PatientModel> findAllByDeletedFalse(Pageable pagination);
}
