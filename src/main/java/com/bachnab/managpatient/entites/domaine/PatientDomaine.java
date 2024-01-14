package com.bachnab.managpatient.entites.domaine;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PatientDomaine {

    private Long id;

    private String matriculePat;

    private String nom;

    private String prenom;

    private String genre;

    private LocalDate date_naissance;

    private String email;

    private String telephone;

    private String adresse;

    private List<RendezvousDomaine> rendezvousDomaineList;

}
