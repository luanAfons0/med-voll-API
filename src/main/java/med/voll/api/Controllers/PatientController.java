package med.voll.api.Controllers;

import med.voll.api.Models.PatientModel;
import med.voll.api.Records.Pacient.GetPatientRecord;
import med.voll.api.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import med.voll.api.Records.Pacient.CreatePacientRecord;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping
    public void createPacient(@RequestBody @Valid CreatePacientRecord newPatient){
        patientRepository.save(new PatientModel(newPatient));
    }

    @GetMapping
    public Page<GetPatientRecord> getPatients(@PageableDefault(size = 5, sort = {"name"}) Pageable pagination){
        return patientRepository.findAll(pagination).map(GetPatientRecord::new);
    }
}
