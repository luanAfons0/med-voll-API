package med.voll.api.DTOs.Medic;

import med.voll.api.DTOs.Address.AddressRecord;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

public record CreateMedicRecord(
        @NotBlank
        String name,

        @NotBlank
        String cellphone,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern( regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Specialization specialization,

        @NotNull
        @Valid
        AddressRecord address
) { }
