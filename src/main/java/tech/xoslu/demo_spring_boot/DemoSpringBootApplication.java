package tech.xoslu.demo_spring_boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tech.xoslu.demo_spring_boot.entities.Medecin;
import tech.xoslu.demo_spring_boot.entities.Specialite;
import tech.xoslu.demo_spring_boot.repositories.MedecinRepository;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner(MedecinRepository medecinRepository){
		return args -> {
			medecinRepository.save(Medecin.builder()
					.nom("LO")
					.prenom("Aissatou")
					.telephone("771678900")
					.specialite(Specialite.CARDIALOGUE)
					.build());
			medecinRepository.save(Medecin.builder()
					.nom("FALL")
					.prenom("Moussa")
					.telephone("775649089")
					.specialite(Specialite.PEDIATRE)
					.build());
			medecinRepository.save(Medecin.builder()
					.nom("GAYE")
					.prenom("Abdoulaye")
					.telephone("771800510")
					.specialite(Specialite.OHPTALMOLOGUE)
					.build());
			medecinRepository.save(Medecin.builder()
					.nom("SECK")
					.prenom("Fatou")
					.telephone("781678900")
					.specialite(Specialite.DERMATOLGUE)
					.build());
		};
	}*/
}
