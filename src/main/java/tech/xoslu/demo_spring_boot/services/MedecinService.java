package tech.xoslu.demo_spring_boot.services;

import tech.xoslu.demo_spring_boot.entities.Medecin;

import java.util.List;

public interface MedecinService {
    public Medecin create(Medecin medecin);
    public List<Medecin> allMedecins();
    public Medecin getMedecin(Long id);
    public Medecin update(Medecin medecin);
    public void delete(Long id);
    public Medecin getMedecinByPhone(String telephone);
}
