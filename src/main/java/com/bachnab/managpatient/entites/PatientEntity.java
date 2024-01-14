package com.bachnab.managpatient.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matricule_pat")
    private String matriculePat;

    private String nom;

    private String prenom;

    private String genre;

    @Column(name = "dateNaissance")
    private LocalDate date_naissance;

    private String email;

    private String telephone;

    private String adresse;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "patient_id")
    private List<RendezvousEntity> rendezvousEntityList;

}
