package tech.xoslu.demo_spring_boot.controllers;

import org.springframework.web.bind.annotation.*;
import tech.xoslu.demo_spring_boot.entities.Medecin;
import tech.xoslu.demo_spring_boot.entities.Specialite;
import tech.xoslu.demo_spring_boot.services.MedecinService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/medecins")
public class MedecinController {

    private MedecinService medecinService;

    public MedecinController(MedecinService medecinService) {
        this.medecinService = medecinService;
    }

    @GetMapping
    public List<Medecin> getAllMedecins() {
        return medecinService.allMedecins();
    }

    @PostMapping
    public Medecin createMedecin(@RequestBody Medecin medecin) {
        medecin.setSpecialite(Specialite.PEDIATRE);
        return medecinService.create(medecin);
    }

    @GetMapping("/{id}")
    public Medecin getMedecinById(@PathVariable Long id) {
        return medecinService.getMedecin(id);
    }

    @GetMapping("/get-medecin-by-phone")
    public Medecin getMedecinByPhone(@RequestParam String phone) {
        return medecinService.getMedecinByPhone(phone);
    }

    @PutMapping
    public Medecin updateMedecin(@RequestBody Medecin medecin) {
        return medecinService.update(medecin);
    }

    @DeleteMapping("/{id}")
    public void deleteMedecin(@PathVariable Long id) {
        medecinService.delete(id);
    }
}
