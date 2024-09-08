package tech.xoslu.demo_spring_boot.services;

import org.springframework.stereotype.Service;
import tech.xoslu.demo_spring_boot.entities.Medecin;
import tech.xoslu.demo_spring_boot.repositories.MedecinRepository;

import java.util.List;

@Service
public class MedeceinServiceImpl implements MedecinService{

    private MedecinRepository medecinRepository;

    public MedeceinServiceImpl(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    @Override
    public Medecin create(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public List<Medecin> allMedecins() {
        return medecinRepository.findAll();
    }

    @Override
    public Medecin getMedecin(Long id) {
        return medecinRepository.findById(id).get();
    }

    @Override
    public Medecin update(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public void delete(Long id) {
        medecinRepository.deleteById(id);
    }

    @Override
    public Medecin getMedecinByPhone(String telephone) {
        return medecinRepository.findByTelephone(telephone);
    }
}
