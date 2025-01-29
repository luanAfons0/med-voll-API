package med.voll.api.Models;

import med.voll.api.DTOs.Pacient.CreatePacientRecord;
import med.voll.api.DTOs.Pacient.UpdatePatientRecord;
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
    private boolean deleted;

    @Embedded
    private Address address;

    public PatientModel(CreatePacientRecord newPatient) {
        this.name = newPatient.name();
        this.email = newPatient.email();
        this.cellphone = newPatient.cellphone();
        this.address = new Address(newPatient.address());
    }

    public PatientModel() { }

    public PatientModel updateInfos(UpdatePatientRecord newInfos){
        if(newInfos.name() != null) this.name = newInfos.name();
        if(newInfos.cellphone() != null) this.cellphone = newInfos.cellphone();
        if(newInfos.address() != null) this.address.updateInfos(newInfos.address());
        return this;
    }

    public void excludeLogically() { deleted = true; }

    public long getId() { return id; }

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
