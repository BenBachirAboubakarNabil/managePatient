package com.bachnab.managpatient.controller;

import com.bachnab.managpatient.entites.*;
import com.bachnab.managpatient.entites.domaine.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ManagePatientMapper {


    @Mapping(target = "rendezvousDomaineList", source = "rendezvousEntityList")
    PatientDomaine patientToDomaine(PatientEntity patientEntity);
    @Mapping(target = "rendezvousEntityList", source = "rendezvousDomaineList")
    PatientEntity patientToEntity(PatientDomaine patientDomaine);

    @Mapping(target = "rendezvousDomaineList", source = "rendezvousEntityList")
    MedecinDomaine medecinToDomaine(MedecinEntity medecinEntity);
    @Mapping(target = "rendezvousEntityList", source = "rendezvousDomaineList")
    MedecinEntity medecinToEntity(MedecinDomaine medecinDomaine);

    MedicamentDomaine medicamentToDomaine(MedicamentEntity medicamentEntity);
    MedicamentEntity medicamentToEntity(MedicamentDomaine medicamentDomaine);

    RendezvousDomaine rdvToDomaine(RendezvousEntity rendezvousEntity);
    RendezvousEntity rdvToEntity(RendezvousDomaine rendezvousDomaine);

    @Mapping( target = "medecinDomaine", source = "medecinEntity")
    @Mapping( target = "patientDomaine", source = "patientEntity")
    @Mapping( target = "medicamentDomaineList", source = "medicamentEntityList")
    OrdonnanceDomaine ordonnanceToDomaine(OrdonnanceEntity ordonnanceEntity);
    @Mapping( target = "medecinEntity", source = "medecinDomaine")
    @Mapping( target = "patientEntity", source = "patientDomaine")
    @Mapping( target = "medicamentEntityList", source = "medicamentDomaineList")
    OrdonnanceEntity ordonnanceToEntity(OrdonnanceDomaine ordonnanceDomaine);
}
