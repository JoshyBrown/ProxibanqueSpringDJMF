package org.formation.proxibanqueSpringDJMF.controller;

import org.formation.proxibanqueSpringDJMF.dao.CrudEmployeDAO;
import org.formation.proxibanqueSpringDJMF.entity.Conseiller;
import org.formation.proxibanqueSpringDJMF.entity.Employe;
import org.formation.proxibanqueSpringDJMF.service.ProxibanqueConseillerServiceImplCrud;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(ProxibanqueConseillerServiceImplCrud.class);
	@Autowired
	CrudEmployeDAO crudEmployeeDAO;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginAction(@RequestParam("login") String login, @RequestParam("password") String password, ModelMap model) {
		Employe employe = crudEmployeeDAO.findByLoginAndPassword(login, password);
		if(null!=employe) {
			if (Conseiller.class.isAssignableFrom(employe.getClass())) {
				LOGGER.debug("Identification Conseiller " + employe.getNom() +" "+ employe.getId());
				model.addAttribute("conseiller", employe);
				return "redirect:/conseiller";
			}else {
				LOGGER.debug("Identification Gerant" + employe.getNom() +" "+ employe.getPrenom());
				model.addAttribute("gerant", employe);
				return "redirect:/gerant";
			}
						
		}else {
			return "redirect:/incorrectConnexion";
		}
	}
}
