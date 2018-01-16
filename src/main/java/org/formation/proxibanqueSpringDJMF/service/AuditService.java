package org.formation.proxibanqueSpringDJMF.service;


import org.formation.proxibanqueSpringDJMF.entity.Client;
import org.springframework.stereotype.Service;

;


// TODO: Auto-generated Javadoc
/**
 *  @author DJMF
 * The Class AuditService.
 * le service d'audit permettra a la page jsp du gerant d'effectuer 
 * un audit des comptes entreprise et particulier
 */
@Service("audit")
public class AuditService {
	
	public String auditService(Client client) {
		if (client.getRaisonSociale().equals(null)) {
			
			
			String resultatParticulier = " ";

			if (client.getCpteC().getSoldeCompte() < -5000.00) {

				resultatParticulier = "ALERTE!!! Le compte de: " + client.getNom() + " " + client.getPrenom() + " est dans le ROUGE: "
						+ client.getCpteC().getSoldeCompte();
			} else {
				resultatParticulier = "Le compte de: " + client.getNom() + " " + client.getPrenom()
						+ " presente un solde correspondant a nos conditions generales: "
						+ client.getCpteC().getSoldeCompte();
			}
			return resultatParticulier;
			
			}else {
			String resultatEntreprise = " ";

			if (client.getCpteC().getSoldeCompte() < -50000.00) {

				resultatEntreprise = "ALERTE!!! Le compte de: " + client.getRaisonSociale() +  " est dans le ROUGE: "
						+ client.getCpteC().getSoldeCompte();
			} else {
				resultatEntreprise = "Le compte de: " + client.getRaisonSociale()
						+ " presente un solde correspondant a nos conditions generales: "
						+ client.getCpteC().getSoldeCompte();
			}
			return resultatEntreprise;
		}
	}
	

}
