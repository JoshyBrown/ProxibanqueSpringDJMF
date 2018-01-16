package org.formation.proxibanqueSpringDJMF.bean;

import org.formation.proxibanqueSpringDJMF.util.InvalidVirementException;
import org.springframework.stereotype.Component;



// TODO: Auto-generated Javadoc
/**
 * The Class VirementEvent.
 *
 * @author DJMF
 * cette classe permet de crer un evenement de virement*
 * avec comme attributs les comptes de depart et le compte cible
 * gere les exceptions si le montant est inferieur ou egal a zero
 */
@Component
public class VirementEvent {

	/** The id compte depart. */
	private long idCompteDepart;
	
	/** The id compte cible. */
	private long idCompteCible;
	
	/** The montant. */
	private Double montant;

	/**
	 * Gets the id compte depart.
	 *
	 * @return the id compte depart
	 */
	public long getIdCompteDepart() {
		return idCompteDepart;
	}

	/**
	 * Sets the id compte depart.
	 *
	 * @param idCompteDepart the new id compte depart
	 */
	public void setIdCompteDepart(long idCompteDepart) {
		this.idCompteDepart = idCompteDepart;
	}

	/**
	 * Gets the id compte cible.
	 *
	 * @return the id compte cible
	 */
	public long getIdCompteCible() {
		return idCompteCible;
	}

	/**
	 * Sets the id compte cible.
	 *
	 * @param idCompteCible the new id compte cible
	 */
	public void setIdCompteCible(long idCompteCible) {
		this.idCompteCible = idCompteCible;
	}

	/**
	 * Gets the montant.
	 *
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}

	/**
	 * Sets the montant.
	 *
	 * @param montant the new montant
	 * @throws InvalidVirementException the invalid virement exception
	 */
	public void setMontant(Double montant) throws InvalidVirementException {
		if (montant<=0) {
			System.out.println("montant = " + this.getMontant());
			throw new InvalidVirementException("montant : "+ this.montant + " " + montant);
		}
		
		this.montant = montant;
	}

}
