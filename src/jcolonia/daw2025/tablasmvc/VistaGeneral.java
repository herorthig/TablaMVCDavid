package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

/**
 * Vista general del programa.
 * Aplicación de texto usando tablas de multiplicar infantiles clásicas.
 * 
 * @author <a href="hernanj.higort@educa.jcyl.es">Hernán José Higuero Ortega</a>
 * @version 1.3 (20260316)
 */
public class VistaGeneral {
	/** Formato de salida para texto normal. Incorpora un salto de linea final. */
	public static final String FORMATO_PRINTF_MOSTRARTEXTO = "%s%n";
	
	/**
	 * Formato de salida para aviso. Va entre asteriscos «***».
	 * También incorpora un salto de linea final.
	 */
	public static final String FORMATO_PRINTF_MOSTRARAVISO= "*** %s ***%n";
	
	/** clase de entrada por pantalla. */
	private static Scanner ScEntrada;
	
	/**
	 * Muestra -envia a la salida estándar- un texto añadiendo un salto de linea final.
	 * 
	 * @see #FORMATO_PRINTF_MOSTRARTEXTO
	 * 
	 * @param texto a mostrar.
	 */
	public static void mostrarTexto(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
	}
	
	/**
	 * Muestra -envia a la salida estándar- un texto de aviso entre asteriscos.
	 * «***» y con dos saltos de linea finales.
	 * 
	 * @see #FORMATO_PRINTF_MOSTRARAVISO
	 * 
	 * @param texto a mostrar.
	 */
	public static void mostrarAviso(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARAVISO, texto);
	}
	
	/**
	 * Muestra -envia a la salida estándar- un titulo H1 añadiendo un salto de linea final.
	 * Para cada la longitud del titulo H1 se muestra un subrayado simple.
	 * 
	 * @see #FORMATO_PRINTF_MOSTRARTEXTO
	 *  
	 * @param texto a mostrar.
	 */
	public static void mostrarTitulo1(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
		for(int i=0;i<texto.length();i++) {
			System.out.print("-");
		}
	}
	
	/**
	 * Muestra -envia a la salida estándar- un título H2 añadiendo un salto de linea final.
	 * Para cada la longitud del titulo se muestra un subrayado simple.
	 * 
	 * @see #FORMATO_PRINTF_MOSTRARTEXTO
	 * 
	 * @param texto a mostrar.
	 */
	public static void mostrarTitulo2(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
		for(int i=0;i<texto.length();i++) {
			System.out.print("-");
		}
	}
	
	/**
	 * Pide un numero al usuario por pantalla.
	 * 
	 * @param texto con el número que necesita recibir.
	 * @return número que ha recibido.
	 */
	public static int pedirNumero(String texto) {
		int n;
		String entrada;
		
		mostrarTexto(texto);
		
		entrada = getScEntrada();
		n = Integer.parseInt(entrada);
		
		return n;
	}
	
	/**
	 * Espera a que el usuario de una confirmación para seguir con el programa.
	 * 
	 * @param texto con la entrada que necesita recibir.
	 */
	public static void pausa(String texto) {
		String entrada;
		
		mostrarTexto(texto);
		
		entrada = getScEntrada();
	}
	
	/**
	 * Muestra -envia a la salida estándar- un texto para perdir confimación al usuario
	 * añadiendo un salto de linea al final.
	 * 
	 * @param texto con la entrada espera a recibir.
	 * @return resultado para continuar o no.
	 */
	public static boolean pedirConfirmacion(String texto) {
		boolean salida;
		String entrada;
		
		salida = false;
		entrada = "";
		
		mostrarTexto(texto);
		entrada = getScEntrada();
		
		switch(entrada.toUpperCase()){
		case "S": //salir
			salida = true;
			break;
		case "N": //no salir
			salida = false;
			break;
		default:
			mostrarAviso("Por favor escoja una de las 2 opciones proporcionadas");
		}
		return salida;
	}
	
	/**
	 * Muestra -envia a la salida estándar- la lista de opciones del programa con
	 * una linea por cada opción.
	 * 
	 * @param lista de opciones.
	 */
	public static void mostrarLista(List<String> lista) {
		for (String opcion : lista) {
            mostrarTexto(opcion);
        }
	}
	
	/**
	 * Pide una entrada al usuario para cada acción que desee tomar.
	 * 
	 * @return enrada del scanner.
	 */
	public static String getScEntrada() {
		String entrada;
		
		if (ScEntrada == null) {
			ScEntrada = new Scanner(System.in);
		}
		
		entrada = ScEntrada.nextLine();
		
		ScEntrada.close();
		
		return entrada;
	}
}
