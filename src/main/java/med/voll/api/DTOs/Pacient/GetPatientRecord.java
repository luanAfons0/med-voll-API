package med.voll.api.DTOs.Pacient;

import med.voll.api.Models.PatientModel;

public record GetPatientRecord(
        Long id,
        String name,
        String email,
        String cellphone
) {

    public GetPatientRecord(PatientModel patientModel){
        this(patientModel.getId(), patientModel.getName(), patientModel.getEmail(), patientModel.getCellphone());
    }
}
