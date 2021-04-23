package mx.com.cargaarchivos.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cargaarchivos.dao.ObtenerLogsDAO;
import mx.com.cargaarchivos.error.LogNotFoundException;
import mx.com.cargaarchivos.main.model.AwlogLoger;
import mx.com.cargaarchivos.main.model.CreditoExcel;
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

	@Override
	public List<CreditoExcel> obtieneLista(String path) {
		// TODO Auto-generated method stub
		File file=new File(path);
		List<CreditoExcel> listaCredito=new ArrayList<CreditoExcel>();
		String tipo=FilenameUtils.getExtension(path);
		if(tipo.equals("xls")||tipo.equals("xlsx")){
		try {
			InputStream inp=new FileInputStream(file);
			Workbook libro=WorkbookFactory.create(inp);
			Sheet hoja=(Sheet) libro.getSheetAt(0);
			int iRow=0;
			Row row=hoja.getRow(iRow);
			while(row!=null) {
				CreditoExcel credito=new CreditoExcel();
			
					Cell cell=row.getCell(0);
					credito.setNumeroCredito(cell.getStringCellValue());
					cell=row.getCell(1);
					credito.setFactorREA(cell.getStringCellValue());
					cell=row.getCell(2);
					credito.setFactorROA(cell.getStringCellValue());
					
					listaCredito.add(credito);
				
				iRow++;
				row=hoja.getRow(iRow);
				
			}
			
			
		} 
		catch(Exception e) {
			LOGGER.error("Error, ",e);
		}
		/*catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			throw new LogNotFoundException("Archivo no encontrado");
		}
			
			 
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			
			throw new EncryptedDocumentException("Error encripted archive");
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			
			throw new LogNotFoundException("Formato invalido");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		}else {
			throw new LogNotFoundException("Tipo de archivo invalido");
			
			
		}
		
		return listaCredito;
	}

	
	
}
