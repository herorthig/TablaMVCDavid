package jcolonia.daw2025.tablasmvc;
/**
 * Lanzador de aplicación de consola de texto con menús. Aplicación
 * de texto usando tablas de multiplicar infantiles clásicas. 
 * 
 * @author <a href= "mailto:dmartin.jcolonia@gmail.com">David H. Martín</a>
 * @version 1.1 (20260312)
 */
public class LanzadorTablaMultiplicar {
	
	/**
	 * Inicia el menú principal del programa.
	 * @param argumentos opciones de ejecución -no se usan-
	 */
	public static void main (String[] argumentos){
		ControlTablaMultiplicar programa;
		
		programa = new ControlTablaMultiplicar();
		
		programa.buclePrincipal();
	}
}