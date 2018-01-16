package org.formation.proxibanqueSpringDJMF.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value= {"/","/index"},method=RequestMethod.GET)
	public String pageAccueil(Model model) {
		return "index";
	}
	
	@RequestMapping(value="/comptes",method=RequestMethod.GET)
	public String pageComptes(Model model) {
		return "comptes";
	}
	
	@RequestMapping(value="/credits",method=RequestMethod.GET)
	public String pageCredits(Model model) {
		return "credits";
	}
	
	@RequestMapping(value="/demandeouverturecompte",method=RequestMethod.GET)
	public String pageDemande(Model model) {
		return "demandeouverturecompte";
	}
	
	@RequestMapping(value="/incorrectConnexion",method=RequestMethod.GET)
	public String incorrectConnexion(Model model) {
		return "incorrectConnexion";
	}
}
