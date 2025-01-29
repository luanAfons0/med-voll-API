package med.voll.api.Repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import med.voll.api.Models.MedicModel;

public interface MedicRepository extends JpaRepository<MedicModel, Long> {
    Page<MedicModel> findAllByDeletedFalse(Pageable pagination);
}
