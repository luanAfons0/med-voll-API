package med.voll.api.DTOs.Pacient;

import med.voll.api.DTOs.Address.AddressRecord;
import jakarta.validation.constraints.NotNull;

public record UpdatePatientRecord(
        @NotNull
        Long id,
        String name,
        String cellphone,
        AddressRecord address
) { }
