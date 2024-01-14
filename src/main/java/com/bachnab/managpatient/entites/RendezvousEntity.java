package com.bachnab.managpatient.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RendezvousEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titre_Rdv")
    private String titreRdv;

    @Column(name = "date_rdv")
    private LocalDate dateRdv;

    @Column(name = "debut_rdv")
    private String debutRdv;

    @Column(name = "fin_rdv")
    private String finRdv;

    @Column(name = "observation_rdv")
    private String observationRdv;

}
