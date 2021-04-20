package mx.com.cargaarchivos.service;

import java.util.List;

import mx.com.cargaarchivos.main.model.AwlogLoger;

/**
 * Inyterface que define los metodos de servicio
 * @author rmiranda
 *
 */
public interface ObtenerDatosService {
	/**
	 * Obtiene todos los logs
	 * @return List
	 */
	List<AwlogLoger> obtieneTodosLosLogs();
	
	
	
}
