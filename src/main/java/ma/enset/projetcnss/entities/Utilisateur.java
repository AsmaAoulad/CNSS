package ma.enset.projetcnss.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="utilisateurs")
@AllArgsConstructor @NoArgsConstructor @Data
public class Utilisateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private	long id;
private String nom;
private String prenom;
private String adresse;

private String login;
private String motDePass;

@Enumerated(EnumType.STRING)
private Role role;

public enum Role {
    PHARMACIE,
    MEDECINS,
    PATIENT,
    AGENT_CNSS
}

}
