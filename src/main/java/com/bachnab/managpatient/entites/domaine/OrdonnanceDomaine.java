package com.bachnab.managpatient.entites.domaine;

import lombok.Data;

import java.util.List;

@Data
public class OrdonnanceDomaine {

    private Long id;

    private String referenceOrd;

    private String observationOrd;

    private MedecinDomaine medecinDomaine;

    private PatientDomaine patientDomaine;

    private List<MedicamentDomaine> medicamentDomaineList;
}
