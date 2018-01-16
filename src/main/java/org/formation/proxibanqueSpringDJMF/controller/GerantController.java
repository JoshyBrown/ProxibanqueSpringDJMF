package org.formation.proxibanqueSpringDJMF.controller;

import java.util.List;

import org.formation.proxibanqueSpringDJMF.entity.Conseiller;
import org.formation.proxibanqueSpringDJMF.service.ProxibanqueGerantServiceImplCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GerantController {

	@Autowired
	private ProxibanqueGerantServiceImplCrud gerantService;
	
	@RequestMapping(value="/gerant", method = RequestMethod.GET)
	public ModelAndView listConseillers() {		
		List<Conseiller> conseiller = gerantService.list();
		return new ModelAndView("gerant","conseillers", conseiller);		
	}
	
	@RequestMapping(value="/saveconseiller", method = RequestMethod.POST)
	public ModelAndView saveConseiller(@ModelAttribute("conseiller") Conseiller conseiller) {		
		gerantService.add(conseiller);;
		return new ModelAndView("redirect:/gerant");		
	}
	
	@RequestMapping(value="/editconseiller/{id}", method = RequestMethod.GET)
	public ModelAndView editConseiller(@PathVariable int id) {
		Conseiller conseiller = gerantService.edit(id);
		return new ModelAndView("conseillerupdate", "conseiller", conseiller);
	}

	@RequestMapping(value="/editsaveconseiller", method = RequestMethod.POST)
	public ModelAndView editsaveConseiller(@ModelAttribute("conseiller") Conseiller conseiller) {
		gerantService.update(conseiller);
		return new ModelAndView("redirect:/gerant");
		}
	
	@RequestMapping(value="/deleteconseiller", method = RequestMethod.GET)
	public ModelAndView deleteConseiller(@PathVariable int id) {
		gerantService.delete(id);
		return new ModelAndView("redirect:/gerant");
	}
	
}
