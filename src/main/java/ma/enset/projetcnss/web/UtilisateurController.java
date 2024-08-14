package ma.enset.projetcnss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ma.enset.projetcnss.entities.Utilisateur;
import ma.enset.projetcnss.repositories.UtilisateurRepository;

@Controller
public class UtilisateurController {
	

	    @Autowired
	    private UtilisateurRepository utilisateurRepository;

	    @Autowired
	    

	   
	    @GetMapping("/inscription")
	    public String inscriptionForm(Model model) {
	        model.addAttribute("utilisateur", new Utilisateur());
	        return "inscription";
	    }

	    @PostMapping("/inscription")
	    public String inscriptionSubmit(@ModelAttribute Utilisateur utilisateur) {
	        utilisateurRepository.save(utilisateur);
	        return "redirect:/connexion";
	    }
	    
	}
