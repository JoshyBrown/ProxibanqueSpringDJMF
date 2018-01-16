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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("client")
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
	public ModelAndView saveClient(@ModelAttribute("clientBean") ClientBean clientBean) {	
		Client client = new Client();
		Adresse adresse = new Adresse();
		CompteCourant compteCourant= new CompteCourant();
		
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
		ClientBean clientBean = new ClientBean();
		
		clientBean.setId(client.getId());
		clientBean.setNom(client.getNom());
		clientBean.setPrenom(client.getPrenom());
		clientBean.setEmail(client.getEmail());
		clientBean.setTelephone(client.getNumTel());
		clientBean.setAdresse(client.getAdresse().getRue());
		clientBean.setCodePostal(client.getAdresse().getCodePostal());
		clientBean.setVille(client.getAdresse().getVille());
		
		
		return new ModelAndView("clientupdate", "client", clientBean);
	}

	@RequestMapping(value="/editsave", method = RequestMethod.POST)
	public ModelAndView editsaveClient(@ModelAttribute("client") ClientBean clientBean) {
		Client client = conseillerService.edit(Integer.parseInt(clientBean.getId()));
				System.out.println(client.toString());
			Adresse adresse = new Adresse();
			
			client.setNom(clientBean.getNom());
			client.setPrenom(clientBean.getPrenom());
			client.setEmail(clientBean.getEmail());
			client.setNumTel(clientBean.getTelephone());
			
			adresse.setRue(clientBean.getAdresse());
			adresse.setVille(clientBean.getVille());
			adresse.setCodePostal(Long.parseLong(clientBean.getCodePostal()));
			client.setAdresse(adresse);
			
			conseillerService.update(client);
		
		
		return new ModelAndView("redirect:/conseiller");
		}

	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteClient(@PathVariable int id) {
		conseillerService.delete(id);
		return new ModelAndView("redirect:/conseiller");
	}
	
	@RequestMapping(value="/virementidclient/{id}", method = RequestMethod.GET)
	public ModelAndView virementClient(@PathVariable int id, Model model) {
		Client client = conseillerService.edit(id);
		List<Client> listeClients = conseillerService.list();
		model.addAttribute("listeclients", listeClients);
		return new ModelAndView("virement", "client", client);
	}
	@RequestMapping(value="/actionvirement", method = RequestMethod.POST)
	public ModelAndView virementAction(@ModelAttribute("client") Client clientDebit, @ModelAttribute("client") Client clientCredit, double montant) {
		String msg = null;
		try {
			virementEvent.setMontant(montant);
		} catch (InvalidVirementException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
