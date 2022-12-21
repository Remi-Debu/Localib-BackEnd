package com.localib.locataire;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocataireService {
    List<Locataire> findAll();
    Locataire findById(String id);
    Locataire save(Locataire entity);
    Locataire update(String id, Locataire locataire);
    void deleteById(String id);
    List<Locataire> findByNom(String nom);
    List<Locataire> findByPrenom(String prenom);
    List<Locataire> findByEmail(String email);
    List<Locataire> findByTelephone(String telephone);
}
