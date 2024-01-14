package com.bachnab.managpatient.entites.domaine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RendezvousDomaine {

    private Long id;

    private String titreRdv;

    private LocalDate dateRdv;

    private String debutRdv;

    private String finRdv;

    private String observationRdv;
}
