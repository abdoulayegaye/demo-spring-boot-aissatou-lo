package tech.xoslu.demo_spring_boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tech.xoslu.demo_spring_boot.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    @Query(name = "SELECT * FROM medecins_tb WHERE phone = ?1", nativeQuery = true)
    public Medecin findByTelephone(@Param("phone") String phone);
}
