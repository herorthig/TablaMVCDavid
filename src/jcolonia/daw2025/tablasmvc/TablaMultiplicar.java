package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Creación de tablas de multiplicar.
 * Aplicación de texto usando tablas de multiplicar infantiles clásicas.
 * 
 * @author <a href="hernanj.higort@educa.jcyl.es">Hernán José Higuero Ortega</a>
 * @version 1.2 (20260309)
 */
public class TablaMultiplicar {
	/**
	 * Número de la tabla de multiplicar.
	 */
	private int número;
	
	/**
	 * Lista generica de cadenas de texto.
	 */
	private List<String> listaTextos;
	
	/**
	 * Inicialización de variable su creación de objetos.
	 * @param número de la tabla de multiplcar.
	 */
	public TablaMultiplicar(int número) {
		this.número = número;
		listaTextos = new ArrayList<String>();
	}
	
	/**
	 * Genera la tabla de multiplicar.
	 */
	public void generarTabla() {
		String[] auxiliar;
		
		auxiliar = new String[10];
		
		for (int i=0;i<10;i++) {
			auxiliar[i] = String.format("%d × %d = %d%n", i+1, número, número*(i+1));
			listaTextos.add(auxiliar[i]);
		}
	}
	
	/**
	 * Facilita la lista con la tabla de multiplciar a la clase {@link ExportacionArchivo}.
	 * @return listaTextos con la tabla generada.
	 */
	public List<String> toListaExportacion() {
		if(listaTextos == null) {
			generarTabla();
		}
		
		return listaTextos;
	}
	
	/**
	 * Envia la lista con la tabla de multiplicar a pantalla.
	 * @return listaTextos con la tabla generada.
	 */
	public List<String> toListaPantalla() {
		if(listaTextos == null) {
			generarTabla();
		}
		
		return listaTextos;
	}
	
	/**
	 * guarda la tabla de multiplicar en una cadena de texto.
	 * @return descripcion con la tabla de multiplicar.
	 */
	public String toString() {
		String descripcion;
		
		descripcion = "";
		for(int i=0;i<listaTextos.size();i++) {
			descripcion += String.format(listaTextos.get(i));
		}
		return descripcion;
	}
}
