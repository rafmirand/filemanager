package mx.com.cargaarchivos.error;

/**
 * Clase para manejo de error BAD_REQUEST
 * @author rmiranda
 *
 */
public class BadRequestException extends RuntimeException {
	/**
	 * The log ID
	 */
	private static final long serialVersionUID = 556329535766059838L;
	private String msg ;
	
	public BadRequestException(String m) {
		msg = m ;
    }
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

}
