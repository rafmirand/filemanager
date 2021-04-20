package mx.com.cargaarchivos.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Manejador de excepciones
 * @author rmiranda
 * 
 *
 */
@ControllerAdvice
public class ErrorHandlingMessages extends ResponseEntityExceptionHandler{
	/**
	 * Handle exceptioni para not found
	 * @param exception
	 * @return
	 */
	@ResponseBody
    @ExceptionHandler( value = LogNotFoundException.class)
	public ResponseEntity<?> handleException(LogNotFoundException exception) {
	     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMsg());
	}
	
	/**
	 * Handler Exception para bad requesr
	 * @param exception
	 * @return
	 */
	@ResponseBody
    @ExceptionHandler( value = BadRequestException.class)
	public ResponseEntity<?> handleExceptionBAdRequest(BadRequestException exception) {
	     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMsg());
	}
}
