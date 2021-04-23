package mx.com.cargaarchivos.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.cargaarchivos.main.model.AwlogLoger;
import mx.com.cargaarchivos.main.model.CreditoExcel;
import mx.com.cargaarchivos.service.ObtenerDatosService;


/**
 * Clase controller contiene la obtencion de todos los logs
 * y de los logs por hashtag
 * @author rmiranda
 */
@Controller
@RequestMapping(value = "/main")
public class ControllerUno{
	private static final Logger LOGGER = Logger.getLogger(ControllerUno.class);
	/**
	 * Servicio para logs
	 */
	@Autowired
	private ObtenerDatosService service;
	/**
	 * Metodo que obtiene el perfil del usuario
	 */
	@GetMapping("/sample")
	@ResponseBody
	public List<AwlogLoger> obtenerTodosLogs() {
		LOGGER.debug("Entra a obtener TODOS los LOGS");
		return service.obtieneTodosLosLogs();

	}
	
	/**
	 * Metodo que obtiene el perfil del usuario
	 */
	@GetMapping("/cargaArchivo")
	@ResponseBody
	public List<CreditoExcel> obtenerRegistrosExcel() {
		String path="c:/datos/ok2.docx";
		LOGGER.debug("Entra a cargar el archivo de excel");
		return service.obtieneLista(path);

	}


}
