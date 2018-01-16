package org.formation.proxibanqueSpringDJMF.service;

import org.formation.proxibanqueSpringDJMF.bean.VirementEvent;
import org.formation.proxibanqueSpringDJMF.dao.CrudCompteBancaireDAO;
import org.formation.proxibanqueSpringDJMF.entity.CompteBancaire;
import org.formation.proxibanqueSpringDJMF.util.InvalidVirementException;
import org.springframework.stereotype.Service;


// TODO: Auto-generated Javadoc
/**
 * @author DJMF
 * The Class VirementService.
 * cette classe permet d'appeler le DaoCompteBancaire afin de trouver
 * les comptes necessaires au virement compte a compte
 * elle permet aussi d'ajuster les comptes credites et debites
 * d'autre part, elle verifie si le compte a debiter a le solde 
 * suffisant pour effectuer le virement 
 * (apres virement, le solde ne doit pas etre inferieur a zero)
 */
@Service("virement")
public class VirementService{

	/** The compte DAO. */
	private CrudCompteBancaireDAO compteDAO;
	
	/** The compte debit. */
	private CompteBancaire compteDebit;
	
	/** The compte credit. */
	private CompteBancaire compteCredit;
	
	/** The montant. */
	private double montant;

	/**
	 * Instantiates a new virement service.
	 */
	public VirementService() {
		
	}

	/**
	 * Effectuer virement.
	 *
	 * @param ve the ve
	 * @return the boolean
	 * @throws InvalidVirementException the invalid virement exception
	 */
	public Boolean effectuerVirement(VirementEvent ve) throws InvalidVirementException {
		if (verificationSolde(compteDebit, montant)) {
		
			compteDebit = compteDAO.findOne((int) ve.getIdCompteDepart());

			compteCredit = compteDAO.findOne((int) ve.getIdCompteCible());

			

			compteDebit.setSoldeCompte(calculeSoldeCompteDebit(ve, compteDebit));
			compteDAO.save(compteDebit);
			
			compteCredit.setSoldeCompte(calculSoldeCompteCredit(ve, compteCredit));
			compteDAO.save(compteDebit);
			
			return true;

		} else
			return false;
		
	
	}
		
	
	

	/**
	 * Calcul solde compte credit.
	 *
	 * @param ve the ve
	 * @param compteCredit the compte credit
	 * @return the double
	 */
	private double calculSoldeCompteCredit(VirementEvent ve, CompteBancaire compteCredit) {
		return compteCredit.getSoldeCompte() + ve.getMontant();
	}

	/**
	 * Calcule solde compte debit.
	 *
	 * @param ve the ve
	 * @param compteDebit the compte debit
	 * @return the double
	 */
	private double calculeSoldeCompteDebit(VirementEvent ve, CompteBancaire compteDebit) {
		return compteDebit.getSoldeCompte() - ve.getMontant();
	}

	/**
	 * Verification solde.
	 *
	 * @param compteDebit the compte debit
	 * @param montant the montant
	 * @return true, if successful
	 */
	private boolean verificationSolde(CompteBancaire compteDebit , double montant) {
		// TODO
		if (compteDebit.getSoldeCompte() >= montant){
			 
			return true;
		
	}else
		return false;
}
}
