package mx.com.cargaarchivos.main;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Rafael Miranda *rmiranda*
 * @version 1.0
 * @since 20/04/2021
 */
@SpringBootApplication
@ComponentScan(basePackages = "mx.com.cargaarchivos")
@EnableAutoConfiguration
public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class);
	/**
	 * Punto de entrada de la aplicacion
	 */
	public static void main(String[] args) {
		LOGGER.info("Arrancando aplicacion  :::: ");
		SpringApplication.run(Main.class, args);
	}
}
