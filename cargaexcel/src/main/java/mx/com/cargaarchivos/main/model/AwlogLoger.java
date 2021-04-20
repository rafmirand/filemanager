package mx.com.cargaarchivos.main.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que cotiene la entidad de <b>awlog_logger </b>
 * El equivalente de entity :v
 * Rafael Miranda
 * @author rmiranda
 *
 */
public class AwlogLoger implements Serializable {
	/**
	 * The serial ID
	 */
	private static final long serialVersionUID = 440983177683752025L;
	/**
	 * El id equivalente a column en hibernate :(
	 */
	private Integer id;
	/**
	 * La fecha de creacion
	 */
	private Date fechaCreacion;
	/**
	 * El host
	 */
	private String host;
	/**
	 * El origen
	 */
	private String origin;
	/**
	 * Los detalles
	 */
	private String details;
	/**
	 * ell stack trace
	 */
	private String stackTrace;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * @return the stackTrace
	 */
	public String getStackTrace() {
		return stackTrace;
	}
	/**
	 * @param stackTrace the stackTrace to set
	 */
	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
}
