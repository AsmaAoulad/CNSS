package ma.enset.projetcnss.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Table(name="consultations")
@AllArgsConstructor @NoArgsConstructor @Data
public class Consultation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cheminDocument;
	private float montant;
	private String description;
	private Date date;

}
