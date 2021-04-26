package mx.com.cargaarchivos.error;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Clase creada con la finalidad de evitar usar generic Exceptions
 * @author rmiranda - Rafael Miranda
 *
 */
public class BussinesException extends Exception {
	/**
	 * The serial ID
	 */
	private static final long serialVersionUID = -268483795457885317L;
	
	/**
	 Para el error
	 */
	private String error;
	
	/**
	 * Para el mensaje
	 */
	private String message;
	
	/**
	 * The throwable
	 */
	private Throwable throwable;

	/**
	 * Constructor para mensaje y errot
	 * @param error
	 * @param message
	 */
	public BussinesException(String error, String message) {
		setError(error);
		setMessage(message);
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 *Tostring sobre escrito
	 */
	@Override
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this);
	}

	/**
	 * @return the throwable
	 */
	public Throwable getThrowable() {
		return throwable;
	}

	/**
	 * @param throwable the throwable to set
	 */
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

}
