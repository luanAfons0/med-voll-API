package med.voll.api.Controllers;

import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import med.voll.api.Records.Medic.CreateMedicRecord;
import med.voll.api.Repository.MedicRepository;
import med.voll.api.Models.MedicModel;

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
}
