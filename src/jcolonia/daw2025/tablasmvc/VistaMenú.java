package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Vista del menú flexible. del programa.
 * Aplicación de texto usando tablas de multiplicar infantiles clásicas.
 * 
 * @author <a href="hernanj.higort@educa.jcyl.es">Hernán José Higuero Ortega</a>
 * @version 1.2 (20260311)
 */
public class VistaMenú extends VistaGeneral {
	
	/**
	 * Titulo del menú.
	 */
	private String título;
	
	/**
	 * Opciones del menú.
	 */
	private List<String> opciones;
	
	/**
	 * Inicialización de titulo y creación de nuevo ArrayList de opciones.
	 * 
	 * @param título que se ponga
	 * @param opciones de la lista
	 */
	public VistaMenú(String título, List<String> opciones) {
		super();
		this.título = título;
		this.opciones = new ArrayList<String>(opciones);
	}
	
	/**
	 * Muestra el titulo del menú.
	 */
	public void mostrarTítulo() {
		System.out.println(título);
		
		for(int i=0;i<título.length();i++) {
			System.out.print("=");
		}
		
		System.out.println();
	}
	
	/**
	 * Muestra las opciones del menú, una tras otra en orden.
	 */
	public void mostrarOpciones() {
		for(int i=0;i<opciones.size();i++) {
			System.out.printf("     %d) %s%n", i+1, opciones.get(i));
		}
		System.out.println("     0) salir");
	}
	
	/**
	 * Pide un numeor al usuario.
	 * 
	 * @return entradaNumero como la opción elegida por el usuario.
	 */
	public int pedirOpción() {
		String entradaTexto;
		int entradaNumero, mín, máx;
		boolean salir;
		
		entradaTexto="";
		entradaNumero = mín = 0;
		máx = 0;
		salir = false;
		
		do {
			try {
				System.out.print("Elija una opción: ");
				entradaTexto = super.getScEntrada();
				entradaNumero = Integer.parseInt(entradaTexto);
				
				if(entradaNumero < mín || entradaNumero > máx) {
					System.out.printf("*** Por favor, ¡escriba un número entre %d y %d!***%n", mín, máx);
				} else {
					salir = true;
				}
			} catch (NumberFormatException e) {
				System.out.printf("*** Por favor, ¡escriba un número entre %d y %d!***%n", mín, máx);
			}
		} while (!salir);
		
		return entradaNumero;
	}
}
