package org.formation.proxibanqueSpringDJMF.entity;

import javax.persistence.Embeddable;

// TODO: Auto-generated Javadoc
/**
 * @author DJMF
 * The Class Adresse.
 * permet d'instancier le nom de la rue, le code postal et la ville
 * la classe adresse est inseree dans la classe client en base de donnees
 */
@Embeddable
public class Adresse {
	
	/** The rue. */
	private String rue;
	
	/** The code postal. */
	private long codePostal;
	
	/** The ville. */
	private String ville;
	
	
	/**
	 * Instantiates a new adresse.
	 *
	 * @param rue the rue
	 * @param codePostal the code postal
	 * @param ville the ville
	 */
	public Adresse(String rue, long codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	/**
	 * Instantiates a new adresse.
	 */
	public Adresse() {
		super();
		
	}

	/**
	 * Gets the rue.
	 *
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Sets the rue.
	 *
	 * @param rue the new rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Gets the code postal.
	 *
	 * @return the code postal
	 */
	public long getCodePostal() {
		return codePostal;
	}

	/**
	 * Sets the code postal.
	 *
	 * @param codePostal the new code postal
	 */
	public void setCodePostal(long codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Gets the ville.
	 *
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Sets the ville.
	 *
	 * @param ville the new ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	
	

}
