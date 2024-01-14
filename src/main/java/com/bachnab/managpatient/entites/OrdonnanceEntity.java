package com.bachnab.managpatient.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdonnanceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference_ord")
    private String referenceOrd;

    @Column(name = "observation_ord")
    private String observationOrd;

    @ManyToOne
    private MedecinEntity medecinEntity;

    @ManyToOne
    private PatientEntity patientEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "ordonnance_id")
    private List<MedicamentEntity> medicamentEntityList;

}
