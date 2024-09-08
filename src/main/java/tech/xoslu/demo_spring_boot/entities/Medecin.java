package tech.xoslu.demo_spring_boot.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medecins_tb")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75)
    private String nom;
    @Column(length = 100)
    private String prenom;
    @Column(name = "phone", length = 10, unique=true)
    private String telephone;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
}
