package med.voll.api.Models;

import med.voll.api.DTOs.Medic.UpdateMedicRecord;
import med.voll.api.DTOs.Medic.CreateMedicRecord;
import med.voll.api.DTOs.Medic.Specialization;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import jakarta.persistence.*;

@Table(name = "medics")
@Entity(name = "medic")
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MedicModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String crm;
    private String cellphone;
    private boolean deleted;

    @Enumerated(EnumType.STRING)
    private Specialization specialization;

    @Embedded
    private Address address;

    public MedicModel(CreateMedicRecord newMedicInfos) {
        this.name = newMedicInfos.name();
        this.email = newMedicInfos.email();
        this.crm = newMedicInfos.crm();
        this.cellphone = newMedicInfos.cellphone();
        this.address = new Address(newMedicInfos.address());
        this.specialization = newMedicInfos.specialization();
    }

    public MedicModel() { }


    public MedicModel updateInfos(UpdateMedicRecord newInfos){
        if(newInfos.name() != null) this.name = newInfos.name();
        if(newInfos.cellphone() != null) this.cellphone = newInfos.cellphone();
        if(newInfos.address() != null) this.address.updateInfos(newInfos.address());
        return this;
    }

    public void excludeLogically(){
        this.deleted = true;
    }

    public long getId() {
        return id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCrm() {
        return this.crm;
    }

    public Specialization getSpecialization() {
        return this.specialization;
    }
}
