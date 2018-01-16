package org.formation.proxibanqueSpringDJMF.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author DJMF
 * The Class CarteBancaire.
 * classe abstraite permet de transmettre aux classes filles les donnees de numero de carte 
 * et la date de validite
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class CarteBancaire {
	
	/** The num carte. */
	@Id
	private long numCarte;
	
	/** The date valid. */
	private String dateValid;
	
	
	
	/**
	 * Instantiates a new carte bancaire.
	 */
	public CarteBancaire() {
		super();
	
	}
	
	/**
	 * Instantiates a new carte bancaire.
	 *
	 * @param numCarte the num carte
	 * @param dateValid the date valid
	 */
	public CarteBancaire(long numCarte, String dateValid) {
		super();
		this.numCarte = numCarte;
		this.dateValid = dateValid;
	}

	/**
	 * Gets the num carte.
	 *
	 * @return the num carte
	 */
	public long getNumCarte() {
		return numCarte;
	}

	/**
	 * Sets the num carte.
	 *
	 * @param numCarte the new num carte
	 */
	public void setNumCarte(long numCarte) {
		this.numCarte = numCarte;
	}

	/**
	 * Gets the date valid.
	 *
	 * @return the date valid
	 */
	public String getDateValid() {
		return dateValid;
	}

	/**
	 * Sets the date valid.
	 *
	 * @param dateValid the new date valid
	 */
	public void setDateValid(String dateValid) {
		this.dateValid = dateValid;
	}
	
	

}
