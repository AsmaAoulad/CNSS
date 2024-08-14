package ma.enset.projetcnss.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.enset.projetcnss.entities.Utilisateur;
@Repository

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	
	}
	


