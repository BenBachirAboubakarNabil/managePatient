package com.bachnab.managpatient.entites.domaine;

import lombok.Data;

import java.util.List;

@Data
public class MedecinDomaine {

    private Long id;

    private String matriculeMed;

    private String nom;

    private String prenom;

    private String email;

    private List<RendezvousDomaine> rendezvousDomaineList;
}
