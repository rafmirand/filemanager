package mx.com.cargaarchivos.error;

/**
 * Clase para manejor de error cuando no se encuentra un log
 * @author rmiranda
 *
 */
public class LogNotFoundException extends RuntimeException {
	
	/**
	 * the serial ID
	 */
	private static final long serialVersionUID = -8383432595181827006L;
	private String msg ;
	public LogNotFoundException(String m) {
		msg = m ;
    }
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

}
