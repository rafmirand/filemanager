package mx.com.cargaarchivos.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cargaarchivos.dao.ObtenerLogsDAO;
import mx.com.cargaarchivos.error.LogNotFoundException;
import mx.com.cargaarchivos.main.model.AwlogLoger;
import mx.com.cargaarchivos.service.ObtenerDatosService;

@Service
public class ObtenerDatosServiceImpl implements ObtenerDatosService {
	/**
	 * Variable para log
	 */
	private static final Logger LOGGER = Logger.getLogger(ObtenerDatosServiceImpl.class);
	@Autowired
	private ObtenerLogsDAO dao;

	@Override
	public List<AwlogLoger> obtieneTodosLosLogs() {
		List<AwlogLoger> lst = dao.obtenerTodosLosLogs();
		if(lst.isEmpty()){
			throw new LogNotFoundException("No se encontro información");
		}
		LOGGER.debug("Entra a obtener todos los LOGS");
		return lst;
	}

	
	
}
