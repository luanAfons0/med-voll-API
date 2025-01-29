package med.voll.api.DTOs.Medic;

import med.voll.api.DTOs.Address.AddressRecord;
import jakarta.validation.constraints.NotNull;

public record UpdateMedicRecord(
    @NotNull
    Long id,
    String name,
    String cellphone,
    AddressRecord address
) { }
