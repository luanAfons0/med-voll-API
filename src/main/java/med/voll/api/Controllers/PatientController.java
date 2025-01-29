package med.voll.api.Controllers;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import med.voll.api.DTOs.Pacient.UpdatePatientRecord;
import med.voll.api.DTOs.Pacient.CreatePacientRecord;
import org.springframework.data.web.PageableDefault;
import med.voll.api.DTOs.Pacient.GetPatientRecord;
import med.voll.api.Repository.PatientRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import med.voll.api.Models.PatientModel;
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

    @PutMapping
    @Transactional
    public void updatePatient(@RequestBody @Valid UpdatePatientRecord requestBody){
        PatientModel patient = patientRepository.getReferenceById(requestBody.id());
        patient.updateInfos(requestBody);
        patientRepository.save(patient);
    }


    @GetMapping
    public Page<GetPatientRecord> getPatients(@PageableDefault(size = 5, sort = {"name"}) Pageable pagination){
        return patientRepository.findAllByDeletedFalse(pagination).map(GetPatientRecord::new);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletePatient(@PathVariable Long id){
        patientRepository.deleteById(id);
    }

    @DeleteMapping("/logical/{id}")
    @Transactional
    public void deletePatientLogically(@PathVariable Long id){
        PatientModel patient = patientRepository.getReferenceById(id);
        patient.excludeLogically();
        patientRepository.save(patient);
    }
}
