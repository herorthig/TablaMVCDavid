package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Núcleo de aplicación de consola de texto con menús. Aplicación
 * de texto usando tablas de multiplicar infantiles clásicas. 
 * 
 *  
 * @author <a href= "mailto:dmartin.jcolonia@gmail.com">David H. Martín</a>
 * @version 1.1 (20260311)
*/
public class ControlTablaMultiplicar {
	/** Formato tipo «printf» para el nombre del archivo de
	* exportación.
	*/
	public static final String FORMATO_RUTA_ARCHIVO_EXPORTACIÓN = "tabla del %02d.txt";
	
	public static final List<String> OPCIONES_MENÚ_PRINCIPAL = new ArrayList();
	
	/** Tabla de multiplicar activa. */
	private TablaMultiplicar tabla;

	public ControlTablaMultiplicar(){
		init();
	}


	/**
	* Pide al usuario un número y prepara la primera
	* tabla activa.
	*/
	public void init(){
		cambiarTabla();
	}

	/**
	* Gestión del menú principal. Desde este menú
	* se ejecutan las opciones disponibles a elección del usuario.
	* A la salida del menú se finaliza el programa.
	*/
	public void buclePrincipal(){
		VistaMenú menú;
		int opción;
		
		menú=new VistaMenú("Tablas de multiplicar",OPCIONES_MENÚ_PRINCIPAL);
		
		do{
			menú.mostrarOpciones();
			opción=menú.pedirOpción();
			
			switch(opción){
			case 1: // Mostrar tabla
				mostrarTabla();
				break;
			case 2: //Cambiar tabla
				cambiarTabla();
				break;
			case 3: // Exportar tabla
				exportarTabla();
				break;
			case 0: // Salir
				break;
			default: // Opciones no implementadas
				opciónNoDisponible();
				break;
			}
			
		} while (opción!=0);
		
		VistaGeneral.mostrarAviso("FIN");
		
	}
	
	/**
	* Muestra por pantalla -envía a la salida estándar-
	* los productos correspondientes a la tabla activa.
	*/
	private void mostrarTabla(){}
	
	/**
	* Cambia la tabla activa por otra elegida por el usuario.
	*/
	private void cambiarTabla(){
		int n;
		
		n = 0;
		
		VistaGeneral.pedirNumero("Introduzca el número para la tabla");
		
		tabla=new TablaMultiplicar(n);
		tabla.generarTabla();
	}

	/**
	* Envía a un archivo
	* los productos correspondientes a la tabla activa.
	*/
	private void exportarTabla(){
		
	}
	
	/**
	 * Muestra un mensaje de aviso indicando que 
	 * la opción elegida no está disponible.
	*/
	private void opciónNoDisponible(){}
}