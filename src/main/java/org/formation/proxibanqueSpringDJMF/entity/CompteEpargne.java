package org.formation.proxibanqueSpringDJMF.entity;

import javax.persistence.Entity;

// TODO: Auto-generated Javadoc
/**
 * @author DJMF
 * The Class CompteEpargne.
 * elle herite de CompteBancaire elle permet d'instancier un objet compte epargne
 * la principale difference est qu'il est remunere avec un taux de 3% en attribut
 */
@Entity
public class CompteEpargne extends CompteBancaire {
	
	/** The tx interet. */
	private float txInteret;
	
	/**
	 * Instantiates a new compte epargne.
	 */
	public CompteEpargne() {
		super();
		this.txInteret  = 3.0f;
	}

	/**
	 * Instantiates a new compte epargne.
	 *
	 * @param numCompte the num compte
	 * @param soldeCompte the solde compte
	 * @param date the date
	 */
	public CompteEpargne(long numCompte, double soldeCompte, String date) {
		super(numCompte, soldeCompte, date);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new compte epargne.
	 *
	 * @param soldeCpteEpargne the solde cpte epargne
	 * @param dateStr the date str
	 */
	public CompteEpargne(double soldeCpteEpargne, String dateStr) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the tx interet.
	 *
	 * @return the tx interet
	 */
	public float getTxInteret() {
		return txInteret;
	}

	/**
	 * Sets the tx interet.
	 *
	 * @param txInteret the new tx interet
	 */
	public void setTxInteret(float txInteret) {
		this.txInteret = txInteret;
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.entity.CompteBancaire#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne [txInteret=" + txInteret + ", getNumCompte()=" + getNumCompte() + ", getDate()="
				+ getDate() + ", getSoldeCompte()=" + getSoldeCompte() + "]";
	}

	
}
