package med.voll.api.Models;

import med.voll.api.Records.Pacient.CreatePacientRecord;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.Getter;

@Table(name = "patients")
@Entity(name = "patient")
@Getter
@NoArgsConstructor
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
}
