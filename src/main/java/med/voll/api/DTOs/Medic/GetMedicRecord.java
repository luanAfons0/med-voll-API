package med.voll.api.DTOs.Medic;

import med.voll.api.Models.MedicModel;

public record GetMedicRecord(
        Long id,
        String name,
        String email,
        String crm,
        Specialization specialization
) {

    public GetMedicRecord(MedicModel medicModel){
        this(medicModel.getId(), medicModel.getName(), medicModel.getEmail(), medicModel.getCrm(), medicModel.getSpecialization());
    }
}
