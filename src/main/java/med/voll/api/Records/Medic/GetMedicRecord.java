package med.voll.api.Records.Medic;

import med.voll.api.Models.MedicModel;

public record GetMedicRecord(
        String name,
        String email,
        String crm,
        Specialization specialization
) {

    public GetMedicRecord(MedicModel medicModel){
        this(medicModel.getName(), medicModel.getEmail(), medicModel.getCrm(), medicModel.getSpecialization());
    }
}
