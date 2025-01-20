package med.voll.api.Records.Pacient;

import med.voll.api.Records.Address.AddressRecord;

public record CreatePacientRecord(
        String name,
        String email,
        AddressRecord address
) { }
