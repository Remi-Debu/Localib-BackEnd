package com.localib.vehicule;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehiculeService {
    List<Vehicule> findAll();

    Vehicule findById(String id);

    Vehicule save(Vehicule vehicule);

    Vehicule update(String id, Vehicule vehicule);

    void deleteById(String id);

    List<Vehicule> findByMarque(String marque);

    List<Vehicule> findByModele(String modele);

    List<Vehicule> findByImmatriculation(String immatriculation);

    List<Vehicule> findByEtat(EtatVehicule etat);

    List<Vehicule> findByDisponibilite(Boolean disponibilite);

    List<Vehicule> findByType(TypeVehicule type);

    List<Vehicule> findAllVehiculePrixSuperieur(Double prix);

    List<Vehicule> findAllVehiculePrixInferieur(Double prix);
}
