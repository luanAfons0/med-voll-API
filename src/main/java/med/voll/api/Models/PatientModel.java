package med.voll.api.Models;

import med.voll.api.DTOs.Pacient.CreatePacientRecord;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import jakarta.persistence.*;

@Table(name = "patients")
@Entity(name = "patient")
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PatientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String cellphone;

    @Embedded
    private Address address;

    public PatientModel(CreatePacientRecord newPatient) {
        this.name = newPatient.name();
        this.email = newPatient.email();
        this.cellphone = newPatient.cellphone();
        this.address = new Address(newPatient.address());
    }

    public PatientModel() { }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }
}
