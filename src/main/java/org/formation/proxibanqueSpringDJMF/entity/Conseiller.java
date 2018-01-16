package org.formation.proxibanqueSpringDJMF.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

// TODO: Auto-generated Javadoc
/**
 * The Class Conseiller.
 *
 * @author DJMF
 * The Class Conseiller.
 * la classe conseiller permet d'instancier un objet conseiller
 * il pourrra gerer un portefeuille de clients
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Conseiller extends Employe{
	
public static final char ROLE_CONSEILLER = 'C';
	
	@ManyToOne
	private Gerant gerant;

	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Client> clientsList = new ArrayList<>();

	public Conseiller() {
		super();
		super.setRole(ROLE_CONSEILLER);
	}

	public Conseiller(String nom, String prenom, String refEmployee, Adresse adresse) {
		super(nom, prenom, refEmployee, adresse);
		super.setRole(ROLE_CONSEILLER);
	}

	public void addClient(Client c) {
		c.setConseiller(this);
		clientsList.add(c);
	}

	public void deleteClient(Client c) {
		c.setConseiller(null);
		clientsList.remove(c);
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public List<Client> getClientsList() {
		return clientsList;
	}

	public void setClientsList(List<Client> clientsList) {
		this.clientsList = clientsList;
	}
}
