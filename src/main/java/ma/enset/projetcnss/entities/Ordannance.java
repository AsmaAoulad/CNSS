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
@Table(name="ordannances")
@AllArgsConstructor @NoArgsConstructor @Data
public class Ordannance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String cheminPieceOrdannance;
private float montant;
private Date date;

}
