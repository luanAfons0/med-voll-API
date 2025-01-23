package med.voll.api.Controllers;

import med.voll.api.Models.PatientModel;
import med.voll.api.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import med.voll.api.Records.Pacient.CreatePacientRecord;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/pacient")
public class PacientController {

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping
    public void createPacient(@RequestBody @Valid CreatePacientRecord newPatient){
        patientRepository.save(new PatientModel(newPatient));
    }
}
