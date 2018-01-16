package org.formation.proxibanqueSpringDJMF.bean;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class ClientBean.
 */
@Component
public class ClientBean {
	private String id;
	/** The nom. */
	private String nom;
	
	/** The prenom. */
	private String prenom;
	
	/** The rue. */
	private String adresse;
	
	/** The code postal. */
	private String codePostal;
	
	/** The ville. */
	private String ville;
	
	/** The telephone. */
	private String telephone;
	
	/** The email. */
	private String email;
	
	/** The num compte courant. */
	private String numCompteCourant;
	
	/** The solde compte courant. */
	private String soldeCompteCourant;
	
	/** The date creation CC. */
	private String dateCreationCC;
	
	/** The num compte epargne. */
	private String numCompteEpargne;
	
	/** The solde compte epargne. */
	private String soldeCompteEpargne;
	
	/** The date creation CE. */
	private String dateCreationCE;
	
	/** The num carte visa premier. */
	private String numCarteVisaPremier;
	
	/** The date valid visa P. */
	private String dateValidVisaP;
	
	/** The num carte visa electron. */
	private String numCarteVisaElectron;
	
	/** The date valid visa E. */
	private String dateValidVisaE;
	
	/** The id conseiller. */
	private String idConseiller;

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumCompteCourant() {
		return numCompteCourant;
	}

	public void setNumCompteCourant(String numCompteCourant) {
		this.numCompteCourant = numCompteCourant;
	}

	public String getSoldeCompteCourant() {
		return soldeCompteCourant;
	}

	public void setSoldeCompteCourant(String soldeCompteCourant) {
		this.soldeCompteCourant = soldeCompteCourant;
	}

	public String getDateCreationCC() {
		return dateCreationCC;
	}

	public void setDateCreationCC(String dateCreationCC) {
		this.dateCreationCC = dateCreationCC;
	}

	public String getNumCompteEpargne() {
		return numCompteEpargne;
	}

	public void setNumCompteEpargne(String numCompteEpargne) {
		this.numCompteEpargne = numCompteEpargne;
	}

	public String getSoldeCompteEpargne() {
		return soldeCompteEpargne;
	}

	public void setSoldeCompteEpargne(String soldeCompteEpargne) {
		this.soldeCompteEpargne = soldeCompteEpargne;
	}

	public String getDateCreationCE() {
		return dateCreationCE;
	}

	public void setDateCreationCE(String dateCreationCE) {
		this.dateCreationCE = dateCreationCE;
	}

	public String getNumCarteVisaPremier() {
		return numCarteVisaPremier;
	}

	public void setNumCarteVisaPremier(String numCarteVisaPremier) {
		this.numCarteVisaPremier = numCarteVisaPremier;
	}

	public String getDateValidVisaP() {
		return dateValidVisaP;
	}

	public void setDateValidVisaP(String dateValidVisaP) {
		this.dateValidVisaP = dateValidVisaP;
	}

	public String getNumCarteVisaElectron() {
		return numCarteVisaElectron;
	}

	public void setNumCarteVisaElectron(String numCarteVisaElectron) {
		this.numCarteVisaElectron = numCarteVisaElectron;
	}

	public String getDateValidVisaE() {
		return dateValidVisaE;
	}

	public void setDateValidVisaE(String dateValidVisaE) {
		this.dateValidVisaE = dateValidVisaE;
	}

	public String getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}


	public void setCodePostal(long codePostal2) {
		// TODO Auto-generated method stub
		this.codePostal= Long.toString(codePostal2);
	}

	public void setId(int id2) {
		// TODO Auto-generated method stub
		this.id=Integer.toString(id2);
	}
	
	
}
