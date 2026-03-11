package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Núcleo de aplicación de consola de texto con menús. Aplicación
 * de texto usando tablas de multiplicar infantiles clásicas. 
 * 
 * @author <a href= "mailto:dmartin.jcolonia@gmail.com">David H. Martín</a>
 * @version 1.2 (20260312)
 */
public class ControlTablaMultiplicar {
	
	/** Formato tipo «printf» para el nombre del archivo de exportación. */
	public static final String FORMATO_RUTA_ARCHIVO_EXPORTACIÓN = "tabla del %02d.txt";

	/** Opciones que recibe {@link VistaMenú} para las tablas de multiplicar. */
	public static final String[] OPCIONES_MENÚ_PRINCIPAL=
		{"Mostrar","Exportar la tabla","Cambiar la tabla"};
	//public static final List<String> OPCIONES_MENÚ_PRINCIPAL= List.of("Op1","Op2","Op3","Op4","Op4");
	
	/** Tabla de multiplicar activa. */
	private TablaMultiplicar tabla;

	/** Inicializa la primera tabla activa con un método. */
	public ControlTablaMultiplicar(){
		init();
	}

	/** Pide al usuario un número y prepara la primera tabla activa. */
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
		
		menú=new VistaMenú("Tablas de multiplicar",Arrays.asList(OPCIONES_MENÚ_PRINCIPAL));
		
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
	private void mostrarTabla(){
		tabla.toListaPantalla();
	}
	
	/** Cambia la tabla activa por otra elegida por el usuario. */
	private void cambiarTabla(){
		int n;
		
		n = 0;
		
		VistaGeneral.pedirNumero("Introduzca el número para cambiar la tabla: ");
		
		tabla=new TablaMultiplicar(n);
		tabla.generarTabla();
	}

	/**
	 * Envía a un archivo
	 * los productos correspondientes a la tabla activa.
	 */
	private void exportarTabla(){
		tabla.toListaExportacion();
	}
	
	/**
	 * Muestra un mensaje de aviso indicando que 
	 * la opción elegida no está disponible.
	 */
	private void opciónNoDisponible(){
		System.out.println("Esta opción no esta disponible");
	}
}