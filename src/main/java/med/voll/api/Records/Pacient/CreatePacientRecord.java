package med.voll.api.Records.Pacient;

import med.voll.api.Records.Address.AddressRecord;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.Valid;

public record CreatePacientRecord(
        @NotBlank
        String name,

        @NotBlank
        String email,

        @NotBlank
        String cellphone,

        @NotNull
        @Valid
        AddressRecord address
) { }
