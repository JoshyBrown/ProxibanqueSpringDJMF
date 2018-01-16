package org.formation.proxibanqueSpringDJMF.util;

// TODO: Auto-generated Javadoc
/**
 * @author DJMF
 * The Class InvalidVirementException.
 * cette classe herite d'exception
 * elle permettra a la classe Virement de gerer les exceptions generes
 */
public class InvalidVirementException extends Exception {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5454731825864252239L;
	
	/** The st. */
	String st="";

	/**
	 * Instantiates a new invalid virement exception.
	 */
	public InvalidVirementException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new invalid virement exception.
	 *
	 * @param str the str
	 */
	public InvalidVirementException(String str) {
		super("La somme saisie est negative!" + str);
		st=str;
	}
	
	/**
	 * Gets the virement.
	 *
	 * @return the virement
	 */
	public String getVirement() {
		return st;
		
	}
	

	/**
	 * Instantiates a new invalid virement exception.
	 *
	 * @param cause the cause
	 */
	public InvalidVirementException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new invalid virement exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public InvalidVirementException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new invalid virement exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public InvalidVirementException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
