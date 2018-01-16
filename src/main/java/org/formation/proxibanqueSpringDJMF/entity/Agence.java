package org.formation.proxibanqueSpringDJMF.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class Agence.
 *
 * @author DJMF
 * The Class Agence.
 */
@Entity
public class Agence {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** The nom agence. */
	private String nomAgence;
	
	/** The date creation. */
	private String dateCreation;
	
	/** The adresse. */
	@Embedded
	private Adresse adresse;

	/** The gerant. */
	@OneToOne(mappedBy="agence", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private Gerant gerant;
	

	/**
	 * Instantiates a new agence.
	 */
	public Agence() {
		super();
		
	}
	

	/**
	 * Instantiates a new agence.
	 *
	 * @param id the id
	 * @param nomAgence the nom agence
	 * @param dateCreation the date creation
	 * @param adresse the adresse
	 * @param gerant the gerant
	 */
	public Agence(Long id, String nomAgence, String dateCreation, Adresse adresse, Gerant gerant) {
		super();
		this.id = id;
		this.nomAgence = nomAgence;
		this.dateCreation = dateCreation;
		this.adresse = adresse;
		this.gerant = gerant;
	}


	/**
	 * Gets the reference.
	 *
	 * @return the reference
	 */
	public String getReference() {
		return nomAgence;
	}

	/**
	 * Sets the reference.
	 *
	 * @param reference the new reference
	 */
	public void setReference(String reference) {
		this.nomAgence = reference;
	}

	/**
	 * Gets the date creation.
	 *
	 * @return the date creation
	 */
	public String getDateCreation() {
		return dateCreation;
	}

	/**
	 * Sets the date creation.
	 *
	 * @param dateCreation the new date creation
	 */
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
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
	 * Gets the gerant.
	 *
	 * @return the gerant
	 */
	public Gerant getGerant() {
		return gerant;
	}

	/**
	 * Sets the gerant.
	 *
	 * @param gerant the new gerant
	 */
	
	public void setGerant(Gerant gerant) {
		gerant.setAgence(this);
		this.gerant = gerant;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agence [id=" + id + ", nomAgence=" + nomAgence + ", dateCreation=" + dateCreation + ", adresse="
				+ adresse + ", gerant=" + gerant + "]";
	}

}
