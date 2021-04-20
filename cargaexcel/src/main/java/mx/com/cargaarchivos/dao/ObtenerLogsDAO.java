package mx.com.cargaarchivos.dao;

import java.util.List;

import mx.com.cargaarchivos.main.model.AwlogLoger;

/**
 * Interface de acceso a datos
 * @author rmiranda
 *
 */
public interface ObtenerLogsDAO {

	/**
	 * Obtiene todos los logs a nivel DAO
	 * @return List
	 */
	List<AwlogLoger> obtenerTodosLosLogs();
	

}
