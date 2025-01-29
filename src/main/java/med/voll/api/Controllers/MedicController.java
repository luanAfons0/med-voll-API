package med.voll.api.Controllers;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import med.voll.api.DTOs.Medic.UpdateMedicRecord;
import med.voll.api.DTOs.Medic.CreateMedicRecord;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import med.voll.api.Repository.MedicRepository;
import med.voll.api.DTOs.Medic.GetMedicRecord;
import org.springframework.data.domain.Page;
import med.voll.api.Models.MedicModel;
import jakarta.validation.Valid;

@RestController
@RequestMapping("medic")
public class MedicController {

    @Autowired
    private MedicRepository medicRepository;

    @PostMapping
    @Transactional
    public void createMedic(@RequestBody @Valid CreateMedicRecord newMedicInfos){
        medicRepository.save(new MedicModel(newMedicInfos));
    }

    @GetMapping
    public Page<GetMedicRecord> getPaginatedMedics(@PageableDefault(size = 5, sort = {"name"}) Pageable pagination){
        return medicRepository.findAllByDeletedFalse(pagination).map(GetMedicRecord::new);
    }

    @PutMapping
    @Transactional
    public void updateMedic(@RequestBody @Valid UpdateMedicRecord requestBody){
        MedicModel medic = medicRepository.getReferenceById(requestBody.id());
        medic.updateInfos(requestBody);
        medicRepository.save(medic);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteMedic(@PathVariable Long id){
        medicRepository.deleteById(id);
    }

    @DeleteMapping("/logical/{id}")
    @Transactional
    public void deleteMedicLogicaly(@PathVariable Long id){
        MedicModel medic = medicRepository.getReferenceById(id);
        medic.excludeLogically();
        medicRepository.save(medic);
    }
}