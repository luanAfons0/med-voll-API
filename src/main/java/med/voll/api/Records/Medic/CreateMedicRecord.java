package med.voll.api.Records.Medic;

import med.voll.api.Records.Address.AddressRecord;

public record CreateMedicRecord(
        String name,
        String email,
        String crm,
        String uf,
        Specialization specialization,
        AddressRecord address
) { }
