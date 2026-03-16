package jcolonia.daw2025.tablasmvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Exportación de la tabla de multiplicar a un archivo de texto.
 * Aplicación de texto usando tablas de multiplicar infantiles clásicas.
 * 
 * @author <a href="hernanj.higort@educa.jcyl.es">Hernán José Higuero Ortega</a>
 * @version 1.2 (20260316)
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
		refArchivos = Path.of(rutaArchivo);
	}
	
	/**
	 * Guarda la tabla de multiplicar en un archivo de texto.
	 * @param contenidos a guardar.
	 */
	public void guardar(List<String> contenidos) {		
		try {
			Files.deleteIfExists(refArchivos);
			Path archivo = Files.createFile(refArchivos);
			
			PrintWriter out = new PrintWriter(Files.newBufferedWriter(archivo));
		
			for (String opcion : contenidos) {
				out.println(opcion);
			}
			
			out.close();
		} catch (IOException e) {
			System.err.printf("Error de escritura: %s", e.getLocalizedMessage());
		}
	}
	
}
