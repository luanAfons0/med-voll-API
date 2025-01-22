package med.voll.api.Records.Address;

public record AddressRecord(
        String street,
        String neighborhood,
        String cep,
        String city,
        String uf,
        String complement,
        String number
) { }
