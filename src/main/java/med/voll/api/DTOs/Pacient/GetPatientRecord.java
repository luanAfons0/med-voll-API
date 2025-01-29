package med.voll.api.DTOs.Pacient;

import med.voll.api.Models.PatientModel;

public record GetPatientRecord(
        String name,
        String email,
        String cellphone
) {

    public GetPatientRecord(PatientModel patientModel){
        this(patientModel.getName(), patientModel.getEmail(), patientModel.getCellphone());
    }
}
