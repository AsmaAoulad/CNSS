package ma.enset.projetcnss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class ProjetCnssApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetCnssApplication.class, args);
	}

}
