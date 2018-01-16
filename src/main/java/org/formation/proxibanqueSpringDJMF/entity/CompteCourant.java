package org.formation.proxibanqueSpringDJMF.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author DJMF
 * The Class CompteCourant.
 * elle herite de CompteBancaire, permet d'instancier un objet compte courant
 * a un decouvert autorise de 1000
 */
@Entity
public class CompteCourant extends CompteBancaire{
	
	/** The decouvert autorise. */
	private double decouvertAutorise = 1000.00;
	
	/** The visa P. */
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="visaP_id", unique=true)
	private CarteVisaPremier visaP;
	
	/** The visa E. */
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="visaE_id", unique=true)
	private CarteVisaElectron visaE;
	
	/**
	 * Instantiates a new compte courant.
	 */
	public CompteCourant() {
		super();
	}
	
	/**
	 * Instantiates a new compte courant.
	 *
	 * @param numCompte the num compte
	 * @param soldeCompte the solde compte
	 * @param date the date
	 */
	public CompteCourant(long numCompte, double soldeCompte, String date) {
		super(numCompte, soldeCompte, date);

	}

	
	/**
	 * Instantiates a new compte courant.
	 *
	 * @param soldeCpteCourant the solde cpte courant
	 * @param dateStr the date str
	 */
	public CompteCourant(double soldeCpteCourant, String dateStr) {

	}

	/**
	 * Gets the decouvert autorise.
	 *
	 * @return the decouvert autorise
	 */
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	/**
	 * Sets the decouvert autorise.
	 *
	 * @param decouvertAutorise the decouvert autorise
	 * @return the double
	 */
	public double setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
		return decouvertAutorise;
	}

	/**
	 * Gets the visa P.
	 *
	 * @return the visa P
	 */
	public CarteVisaPremier getVisaP() {
		return visaP;
	}

	/**
	 * Sets the visa P.
	 *
	 * @param visaP the new visa P
	 */
	public void setVisaP(CarteVisaPremier visaP) {
		this.visaP = visaP;
	}

	/**
	 * Gets the visa E.
	 *
	 * @return the visa E
	 */
	public CarteVisaElectron getVisaE() {
		return visaE;
	}

	/**
	 * Sets the visa E.
	 *
	 * @param visaE the new visa E
	 */
	public void setVisaE(CarteVisaElectron visaE) {
		this.visaE = visaE;
	}

	
	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.entity.CompteBancaire#toString()
	 */
	@Override
	public String toString() {
		return "CompteCourant [decouvertAutorise=" + decouvertAutorise + ", visaP=" + visaP + ", visaE=" + visaE
				+ ", getNumCompte()=" + getNumCompte() + ", getDate()=" + getDate() + ", getSoldeCompte()="
				+ getSoldeCompte() + "]";
	}


	
	
	

}
