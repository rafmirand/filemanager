package mx.com.cargaarchivos.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import mx.com.cargaarchivos.dao.ObtenerLogsDAO;
import mx.com.cargaarchivos.main.model.AwlogLoger;


/**
 * Clase para acceso a datos
 * @author rmiranda
 *
 */
@Repository
public class ObtenerLogsDAOImpl implements ObtenerLogsDAO {
	
	/**
	 * Variable para log
	 */
	private static final Logger LOGGER = Logger.getLogger(ObtenerLogsDAOImpl.class);
	

	/* (non-Javadoc)
	 * @see com.awto.test.application.dao.ObtenerLogsDAO#obtenerTodosLosLogs()
	 */
	@Override
	public List<AwlogLoger> obtenerTodosLosLogs() {
		LOGGER.debug("Enytra a obtener todos los logs :: ");
		List<AwlogLoger> lstRegistros = new ArrayList<AwlogLoger>();
		AwlogLoger reg = new AwlogLoger();
		reg.setDetails("detail");
		reg.setFechaCreacion(new Date());
		reg.setId(1);
		reg.setOrigin("Origin");
		reg.setStackTrace("tace");
		lstRegistros.add(reg);
		return lstRegistros;
	}
	
	


}
