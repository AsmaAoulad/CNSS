package ma.enset.projetcnss.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="patients")
@AllArgsConstructor @NoArgsConstructor @Data
public class Patient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cin;

}
