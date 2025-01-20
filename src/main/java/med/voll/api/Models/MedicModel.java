package med.voll.api.Models;

import med.voll.api.Records.Medic.Specialization;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.Getter;

@Table(name = "medics")
@Entity(name = "medic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MedicModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialization specialization;

    @Embedded
    private Address address;
}
