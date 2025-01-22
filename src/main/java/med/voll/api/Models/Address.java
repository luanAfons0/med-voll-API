package med.voll.api.Models;

import med.voll.api.Records.Address.AddressRecord;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Embeddable
@Getter
@AllArgsConstructor
public class Address {
    private String street;
    private String neighborhood;
    private String cep;
    private String city;
    private String uf;
    private String complement;
    private String number;

    public Address(){
        this.cep = "";
        this.city = "";
        this.complement = "";
        this.number = "";
        this.uf = "";
        this.neighborhood = "";
        this.street = "";
    }

    public Address(AddressRecord newAddress) {
        this.cep = newAddress.cep();
        this.city = newAddress.city();
        this.complement = newAddress.city();
        this.number = newAddress.number();
        this.neighborhood = newAddress.neighborhood();
        this.street = newAddress.street();
        this.uf = newAddress.uf();
    }
}
