package med.voll.api.Records.Medic;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.Records.Address.AddressRecord;

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
