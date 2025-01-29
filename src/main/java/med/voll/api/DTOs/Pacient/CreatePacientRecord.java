package med.voll.api.DTOs.Pacient;

import med.voll.api.DTOs.Address.AddressRecord;
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
