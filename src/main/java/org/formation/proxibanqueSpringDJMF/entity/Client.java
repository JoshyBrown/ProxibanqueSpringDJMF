package org.formation.proxibanqueSpringDJMF.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;




// TODO: Auto-generated Javadoc
/**
 * The Class Client.
 *
 * @author DJMF
 * The Class Client.
 * cette classe permet d'instancier des clients particulier et professionnel
 * avec tous ses attributs et les comptes et cartes bancaires
 */

@Entity
public class Client {
	
	
	/** The id. */
	//attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	/** The nom. */
	private String nom;
	
	/** The prenom. */
	private String prenom;
	
	/** The adresse. */
	@Embedded
	private Adresse adresse;
	
	
	/** The num tel. */
	private String numTel;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name="conseiller_id")
	private Conseiller conseiller;
	
	/** The cpte C. */
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="cpteC_id", unique=true)
	private CompteCourant cpteC;
	
	/** The cpte ep. */
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="cpteEp_id", unique=true)
	private CompteEpargne cpteEp;

	/** The email. */
	private String email;
	

	/** The num SIRET. */
	private long numSIRET;
	
	
	/** The raison sociale. */
	private String raisonSociale;
	

	
	/**
	 * Instantiates a new client.
	 */
	public Client() {
		super();
	}
	
	

	/**
	 * Instantiates a new client.
	 *
	 * @param id the id
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param email the email
	 */
	public Client(int id, String nom, String prenom, Adresse adresse, String numTel, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numTel = numTel;
		this.email = email;
	}


	/**
	 * Instantiates a new client.
	 *
	 * @param id the id
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param email the email
	 * @param numSIRET the num SIRET
	 * @param raisonSociale the raison sociale
	 */
	public Client(int id, Adresse adresse, String numTel, String email, long numSIRET, String raisonSociale) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.numTel = numTel;
		this.email = email;
		this.numSIRET = numSIRET;
		this.raisonSociale = raisonSociale;
	}


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	
	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
		
	
	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	
	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Gets the adresse.
	 *
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Sets the adresse.
	 *
	 * @param adresse the new adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Gets the num tel.
	 *
	 * @return the num tel
	 */
	public String getNumTel() {
		return numTel;
	}

	/**
	 * Sets the num tel.
	 *
	 * @param numTel the new num tel
	 */
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	/**
	 * Gets the cpte C.
	 *
	 * @return the cpte C
	 */
	public CompteCourant getCpteC() {
		return cpteC;
	}

	/**
	 * Sets the cpte C.
	 *
	 * @param cpteC the new cpte C
	 */
	public void setCpteC(CompteCourant cpteC) {
		this.cpteC = cpteC;
	}

	/**
	 * Gets the cpte ep.
	 *
	 * @return the cpte ep
	 */
	public CompteEpargne getCpteEp() {
		return cpteEp;
	}

	/**
	 * Sets the cpte ep.
	 *
	 * @param cpteEp the new cpte ep
	 */
	public void setCpteEp(CompteEpargne cpteEp) {
		this.cpteEp = cpteEp;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * Gets the num SIRET.
	 *
	 * @return the num SIRET
	 */
	public long getNumSIRET() {
		return numSIRET;
	}
	
	/**
	 * Sets the num SIRET.
	 *
	 * @param numSIRET the new num SIRET
	 */
	public void setNumSIRET(long numSIRET) {
		this.numSIRET = numSIRET;
	}
	
	/**
	 * Gets the raison sociale.
	 *
	 * @return the raison sociale
	 */
	public String getRaisonSociale() {
		return raisonSociale;
	}
	
	/**
	 * Sets the raison sociale.
	 *
	 * @param raisonSociale the new raison sociale
	 */
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTel="
				+ numTel + ", cpteC=" + cpteC + ", email=" + email + ", numSIRET=" + numSIRET
				+ ", raisonSociale=" + raisonSociale + "]";
	}

	
	
	
		

}
