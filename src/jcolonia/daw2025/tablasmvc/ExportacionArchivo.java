package jcolonia.daw2025.tablasmvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Exportación de la tabla de multiplicar a un archivo de texto.
 * Aplicación de texto usando tablas de multiplicar infantiles clásicas.
 * 
 * @author <a href="hernanj.higort@educa.jcyl.es">Hernán José Higuero Ortega</a>
 * @version 1.1 (20260311)
 */
public class ExportacionArchivo {

	/**
	 * Ruta completa del archivo donde guardaremos la tabla de multiplicar.
	 */
	private Path refArchivos;
	
	/**
	 * Inicializa el atributo donde se guarda el archivo.
	 * @param rutaArchivo la ruta del archivo
	 */
	public ExportacionArchivo(String rutaArchivo) {
		refArchivos = Paths.get(rutaArchivo);
	}
	
	/**
	 * Guarda la tabla de multiplicar en un archivo de texto.
	 * @param contenidos
	 */
	public void guardar(List<String> contenidos) {
		
	}
	
}
