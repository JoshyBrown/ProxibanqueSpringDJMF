package org.formation.proxibanqueSpringDJMF.controller;

import java.util.List;

import org.formation.proxibanqueSpringDJMF.bean.ClientBean;
import org.formation.proxibanqueSpringDJMF.bean.VirementEvent;
import org.formation.proxibanqueSpringDJMF.entity.Adresse;
import org.formation.proxibanqueSpringDJMF.entity.CarteVisaPremier;
import org.formation.proxibanqueSpringDJMF.entity.Client;
import org.formation.proxibanqueSpringDJMF.entity.CompteCourant;
import org.formation.proxibanqueSpringDJMF.entity.CompteEpargne;
import org.formation.proxibanqueSpringDJMF.service.ProxibanqueConseillerServiceImplCrud;
import org.formation.proxibanqueSpringDJMF.service.VirementService;
import org.formation.proxibanqueSpringDJMF.util.InvalidVirementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConseillerController {
	
	@Autowired
	ProxibanqueConseillerServiceImplCrud conseillerService;
	@Autowired
	VirementService virementService;
	@Autowired
	VirementEvent virementEvent;

	
//	@RequestMapping("/nouveaucompteclient" )
//    public ModelAndView showform(){  
//        return new ModelAndView("empform","command",new Client());  
//    } 
	
	@RequestMapping(value="/conseiller", method = RequestMethod.GET)
	public ModelAndView listClients() {		
		List<Client> clients = conseillerService.list();
		return new ModelAndView("conseiller","clients", clients);		
	}
	
	@RequestMapping(value="/nouveaucompteclient", method = RequestMethod.GET)
	public ModelAndView initNvCptePage(Model model) {	
				ClientBean client = new ClientBean();
		return new ModelAndView("nouveaucompteclient","client", client);			
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView saveClient(@ModelAttribute("client") ClientBean clientBean) {	
		Client client = new Client();
		Adresse adresse = new Adresse();
		CompteCourant compteCourant= new CompteCourant();
		CompteEpargne compteEpargne = new CompteEpargne();
		CarteVisaPremier visaPremier = new CarteVisaPremier();
		client.setNom(clientBean.getNom());
		client.setPrenom(clientBean.getPrenom());
		client.setEmail(clientBean.getEmail());
		client.setNumTel(clientBean.getTelephone());
		
		adresse.setRue(clientBean.getAdresse());
		adresse.setVille(clientBean.getVille());
		adresse.setCodePostal(Long.parseLong(clientBean.getCodePostal()));
		client.setAdresse(adresse);
		compteCourant.setNumCompte(Long.parseLong(clientBean.getNumCompteCourant()));
		compteCourant.setSoldeCompte(Double.parseDouble(clientBean.getSoldeCompteCourant()));
		compteCourant.setDate(clientBean.getDateCreationCC());
		visaPremier.setNumCarte(Long.parseLong(clientBean.getNumCarteVisaPremier()));
		compteCourant.setVisaP(visaPremier);
		client.setCpteC(compteCourant);
		
				
		conseillerService.add(client);
		return new ModelAndView("redirect:/conseiller");		
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editClient(@PathVariable int id) {
		Client client = conseillerService.edit(id);
		return new ModelAndView("clientupdate", "client", client);
	}

	@RequestMapping(value="/editsave", method = RequestMethod.POST)
	public ModelAndView editsaveClient(@ModelAttribute("client") Client client) {
		conseillerService.update(client);
		return new ModelAndView("redirect:/conseiller");
		}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public ModelAndView deleteClient(@PathVariable int id) {
		conseillerService.delete(id);
		return new ModelAndView("redirect:/conseiller");
	}
	
	@RequestMapping(value="/virementidclient/{id}", method = RequestMethod.GET)
	public ModelAndView virementClient(@PathVariable int id) {
		Client client = conseillerService.edit(id);
		return new ModelAndView("virement", "client", client);
	}
	@RequestMapping(value="/actionvirement", method = RequestMethod.POST)
	public ModelAndView virementAction(@ModelAttribute("clientdebit") Client clientDebit, @ModelAttribute("clientcredit") Client clientCredit) {
		String msg = null;
		virementEvent.setIdCompteDepart(clientDebit.getCpteC().getNumCompte());
		virementEvent.setIdCompteCible(clientCredit.getCpteC().getNumCompte());
		try {
			virementService.effectuerVirement(virementEvent);
			msg = "Virement Effectue!";
		} catch (InvalidVirementException e) {
			// TODO Auto-generated catch block
			msg = "Echec du virement!";
			e.printStackTrace();
		}
		return new ModelAndView("virement", "MsgJSPVirement", msg);
	}
}
