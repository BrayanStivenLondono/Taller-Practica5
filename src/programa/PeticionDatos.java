package programa;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Arquitecto;
import clases.Estilo;
import clases.Genero;
import clases.GestorMonumentos;
import clases.Monumento;
import clases.MonumentoArqueologico;
import clases.Santuario;

public class PeticionDatos {
	
	static Scanner input = new Scanner (System.in);
	static Scanner input2 = new Scanner (System.in);
	
	public static void listadoClases(GestorMonumentos gestor) {
		int opcionListar = 0;
		do {
			System.out.println("\n¿Que quieres Listar?");
			System.out.println("1. - Los Monumentos");
			System.out.println("2. - Los Estilo");
			System.out.println("3. - Los Aquitectos");
			System.out.println("4. - Todo");
			System.out.println("5. - Salir");
			System.out.print("Opcion: ");
			opcionListar = input2.nextInt();
			
			switch (opcionListar) {
			case 1:
				gestor.listarMonumentos();
				break;
			case 2:
				gestor.listarEstilos();
				break;
			case 3:
				gestor.listarArquitectos();
				break;
			case 4:
				System.out.println("\nMonumentos");
				gestor.listarMonumentos();
				System.out.println("\nEstilos");
				gestor.listarMonumentos();
				System.out.println("\nArquitectos");
				gestor.listarArquitectos();
				break;
			case 5:
				System.out.println("\nHaz salido de listar");
				break;
			default:
					System.out.println("\nOpcion incorrecta");
				break;
			}
		} while (opcionListar!=5);	
	}
	
	
	
	public static void buscar(GestorMonumentos gestor) {
		int opcionBuscar = 0;
		do {
			System.out.println("\n¿Que quires Buscar? ");
			System.out.println("1. - Monumento");
			System.out.println("2. - Arquitecto");
			System.out.println("3. - Estilo");
			System.out.println("4. - Salir");
			System.out.print("Opcion: ");
			opcionBuscar = input2.nextInt();
			
			switch (opcionBuscar) {
			case 1:
				System.out.print("\nNombre de Monumento: ");
				String nombreMonumento = input.nextLine();
				System.out.println(gestor.buscarMonumento(nombreMonumento));
				break;
			case 2:
				System.out.print("\nNombre del Arquitecto: ");
				String nombreArquitecto = input.nextLine();
				System.out.println(gestor.buscarArquitecto(nombreArquitecto));
				break;
			case 3:
				System.out.println("\nNombre del Estilo: ");
				String estilo = input.nextLine();
				System.out.println(gestor.buscarEstilo(estilo));
				break;
			case 4:
				System.out.println("\nHaz Salido de Buscar");
				break;
			default:
				System.out.println("\nOpcion incorrecta");
				break;
			}
		} while (opcionBuscar!=4);
	}
	
	
	public static void altaEstilo (GestorMonumentos gestor) {
		System.out.print("Nombre: ");
		String nombre = input.nextLine();
		System.out.print("Pais Origen: ");
		String paisOrigen = input.nextLine();
		gestor.altaEstilo(nombre, paisOrigen);
	}
	
	
	public static void altaArquitecto (GestorMonumentos gestor) {
		System.out.print("\nNombre: ");
		String nombre = input.nextLine();
		System.out.print("FechaNacimiento: ");
		String fechaNacimiento = input.nextLine();
		Estilo estilo = null;
		gestor.altaArquitecto(nombre, fechaNacimiento, estilo);
	}
	

	
	public static void altaMonumento (GestorMonumentos gestor) {
		int opcionTipoMunumento = 0;
		do {
			System.out.println("\n¿Que tipo de Monumento?");
			System.out.println("1. - Monumento (estandar)");
			System.out.println("2. - M. Arqueologico");
			System.out.println("3. - M. Historico");
			System.out.println("4. - Santuario");
			System.out.println("5. - Salir");
			System.out.print("Opcion: ");
			opcionTipoMunumento = input2.nextInt();
			
			switch (opcionTipoMunumento) {
			case 1:
				System.out.print("Nombre: ");
				String nombre = input.nextLine();
				System.out.print("Ubicacion (Pais): ");
				String ubicacion = input.nextLine();
				System.out.print("Material: ");
				String material = input.nextLine();
				System.out.print("Disponible (true | false): ");
				boolean disponible = input2.nextBoolean();
				System.out.print("Cantidad de Visitantes: ");
				int visitantesMonumento = input2.nextInt();
				System.out.print("Anyos Antiguedad: ");
				int anyosAntiguedad = input2.nextInt();
				Estilo estilo = null;
				Arquitecto arquitecto = null;
				gestor.altaMonumento(nombre, ubicacion, material, disponible, visitantesMonumento, anyosAntiguedad ,estilo, arquitecto);
				// nombre,  ubicacion,  material,  disponible,  cantidadVisitantes,  anyosAntiguedad, estilo,  arquitecto

				break;
			case 2:
				System.out.print("Nombre: ");
				String nombreArqueologico = input.nextLine();
				System.out.print("Ubicacion (Pais): ");
				String ubicacionArqueologico  = input.nextLine();
				System.out.print("Material: ");
				String materialArqueologico  = input.nextLine();
				System.out.print("Disponible (true | false): ");
				boolean disponibleArqueologico  = input2.nextBoolean();
				System.out.print("Cantidad de Visitantes: ");
				int visitantesArqueologico = input2.nextInt();
				System.out.print("Anyos Antiguedad: ");
				int anyosAntiguedadArqueologico = input2.nextInt();
				System.out.print("Dimensiones: ");
				String dimensiones = input.nextLine();
				System.out.print("Civilizacion: ");
				String civilizacion = input.nextLine();
				Estilo estiloArqueologico  = null;
				Arquitecto arquitectoArqueologico = null;
				gestor.altaMonumentoArqueologico(nombreArqueologico, ubicacionArqueologico, materialArqueologico, disponibleArqueologico, 
						visitantesArqueologico, anyosAntiguedadArqueologico , dimensiones, civilizacion, estiloArqueologico, arquitectoArqueologico);
				////nombre,ubicacion,material, disponible, cantidadVisitantes, anyosAntiguedad, dimensiones, civilizacion, estilo, arquitecto
				break;
			case 3:
				System.out.print("Nombre: ");
				String nombreHistorico = input.nextLine();
				System.out.print("Ubicacion (Pais): ");
				String ubicacionHistorico = input.nextLine();
				System.out.print("Material: ");
				String materialHistorico = input.nextLine();
				System.out.print("Disponible (true | false): ");
				boolean disponibleHistorico = input2.nextBoolean();
				System.out.print("Cantidad de Visitantes: ");
				int visitantesHistorico = input2.nextInt();
				System.out.print("Anyos de Antiguedad: ");
				int anyosAntiguedadHistorico = input2.nextInt();
				System.out.print("Estado de Conservacion: ");
				String estadoConservacion = input.nextLine();
				System.out.print("Patrimonio de la Humanidad: ");
				boolean patrimonioHumanidad = input2.nextBoolean();
				Estilo estiloHistorico = null;
				Arquitecto arquitectoHistorico = null;
				gestor.altaMonumentoHistorico(nombreHistorico, ubicacionHistorico, materialHistorico, disponibleHistorico, 
						visitantesHistorico, anyosAntiguedadHistorico, estadoConservacion, patrimonioHumanidad, estiloHistorico, arquitectoHistorico);
				//nombre,ubicacion, material,disponible,cantidadVisitantes,anyosAntiguedad,
				//estadoConservacion,patrimonioHumanidad,estilo,arquitecto
				break;
			case 4:
				System.out.print("Nombre: ");
				String nombreSantuario = input.nextLine();
				System.out.print("Ubicacion (Pais): ");
				String ubicacionSantuario = input.nextLine();
				System.out.print("Material: ");
				String materialSantuario = input.nextLine();
				System.out.print("Disponible (true | false): ");
				boolean disponibleSantuario = input2.nextBoolean();
				System.out.print("Cantidad de Visitantes: ");
				int visitantesSantuario = input2.nextInt();
				System.out.print("AnyosAntiguedad: ");
				int anyosAntiguedadSantuario = input2.nextInt();
				System.out.print("Religion: ");
				String religion = input.nextLine();
				System.out.print("Entorno: ");
				String entorno = input.nextLine();
				System.out.print("Tipo: ");
				String tipo = input.nextLine();
				Estilo estiloSantuario = null;
				Arquitecto arquitectoSantuario = null;
				gestor.altaSantuario(nombreSantuario, ubicacionSantuario, materialSantuario, disponibleSantuario, 
						visitantesSantuario, anyosAntiguedadSantuario, religion, entorno, tipo ,estiloSantuario, arquitectoSantuario);
				gestor.listarMonumentos();
				//nombre,ubicacion,material,disponible,cantidadVisitantes,anyosAntiguedad,religion, entorno,tipo,estilo, arquitecto

				break;
			case 5:
				System.out.println("\nHaz salido de Alta Monumento");
				break;
			default:
				System.out.println("\nOpcion incorrecta, intentalo de nuevo");
				break;
			}
		} while (opcionTipoMunumento!=5);
	}
	
	public static void eliminar (GestorMonumentos gestor) {
		int opcionElimnar = 0;
		do {
			System.out.println("\n¿Que quieres Eliminar?");
			System.out.println("1. - Monumento");
			System.out.println("2. - Estilo");
			System.out.println("3. - Arquitecto");
			System.out.println("4. - Salir");
			System.out.print("Opcion: ");
			opcionElimnar = input2.nextInt();
			
			switch (opcionElimnar) {
			case 1:
				gestor.listarMonumentos();
				System.out.print("\nNombre del Monumento: ");
				String nombreMonumento = input.nextLine();
				gestor.eliminarMonumento(nombreMonumento);
				gestor.listarMonumentos();
				break;
			case 2:
				gestor.listarEstilos();
				System.out.print("\nNombre del Estilo: ");
				String nombreEstilo = input.nextLine();
				gestor.eliminarEstilo(nombreEstilo);
				gestor.listarEstilos();
				break;
			case 3:
				gestor.listarArquitectos();
				System.out.print("\nNombre del Arquitecto: ");
				String nombreArquitecto = input.nextLine();
				gestor.eliminarArquitecto(nombreArquitecto);
				gestor.listarArquitectos();
				break;
			case 4:
				System.out.println("\nHaz salido de Eliminar");
				break;
			default:
				System.out.println("\nOpcion incorrecta");
				break;
			}
		} while (opcionElimnar!=4);	
	}
	
	public static void asignar (GestorMonumentos gestor) {
		int opcionAsignar = 0;
		do {
			System.out.println("\n¿Que quieres Asignar a un Monumento? ");
			System.out.println("1. - Estilo");
			System.out.println("2. - Arquitecto");
			System.out.println("3. - Salir");
			System.out.print("Opcion: ");
			opcionAsignar = input2.nextInt();
			
			switch (opcionAsignar) {
			case 1:
				System.out.print("\nNombre del Estilo: ");
				String nombreEstilo = input.nextLine();
				System.out.print("\nNombre del Monumento");
				String nombreMonumentoEstilo = input.nextLine();
				gestor.asignarEstiloMonumento(nombreEstilo, nombreMonumentoEstilo);
				gestor.listarMonumentos();
				break;
			case 2:
				System.out.print("\nNombre del Arquitecto: ");
				String nombreArquitecto = input.nextLine();
				System.out.print("\nNombre del Monumento");
				String nombreMonumentoArquitecto = input.nextLine();
				gestor.asignarArquitectoMonumento(nombreArquitecto, nombreMonumentoArquitecto);
				gestor.listarMonumentos();
				break;
			case 3:
				System.out.println("\nHaz salido de Eliminar");
				break;
			default:
				System.out.println("\nOpcion incorrecta");
				break;
			}
		} while (opcionAsignar!=3);	
	}
	
	
	
	public static void cargaDeDatos(GestorMonumentos gestor) {
		
		// nombre,  ubicacion,  material,  disponible,  cantidadVisitantes,  anyosAntiguedad, estilo,  arquitecto
		gestor.altaMonumento("Sagrada Familia", "Espanya", "Piedra", true, 255, 150, null, null);
		gestor.altaMonumento("Taj Mahal", "India", "Marmol", true, 180, 300, null, null);
		
		//nombre,ubicacion,material, disponible, cantidadVisitantes, anyosAntiguedad, dimensiones, civilizacion, estilo, arquitecto
		gestor.altaMonumentoArqueologico("Piramide de Giza", "Egipto", "Piedra", true, 241,4500,"138.8m de altura", "Antiguo Egipto",null, null);
		//gestor.altaMonumentoArqueologico("Petra", "Jordania", "Roca", true, null, null, 245, null, "Nabateos", 2000);
		gestor.altaMonumentoArqueologico("Acropolis de Atenas", "Grecia", "Marmol", true, 159 , 2500, "3 hectareas", "Antiguo Grecia",null, null);
		
		//nombre,ubicacion, material,disponible,cantidadVisitantes,anyosAntiguedad,estadoConservacion,patrimonioHumanidad,estilo,arquitecto
		gestor.altaMonumentoHistorico("Castillo de Edimburgo", "Escocia", "Piedra", false, 258, 900,"Bueno", false, null, null);
		gestor.altaMonumentoHistorico("Castillo de Praga", "Republica Checa", "Piedra", false, 147, 1100, "Bueno", false, null, null);
		//gestor.altaMonumentoHistorico("Torre de Londres", "Ingleterra", "Piedra", true, null, 368, null, "Bueno", 950);
		
		
		//nombre,ubicacion,material,disponible,cantidadVisitantes,anyosAntiguedad,religion, entorno,tipo,estilo, arquitecto
		gestor.altaSantuario("Basilica de San Pedro", "Ciudad del Vaticano", "Marmol", true, 351,398, "Cristianismo", "Basilica", "Templo", null, null);
		gestor.altaSantuario("Catedral de Notre Dame", "Francia", "Pedra", true, 154, 669, "Cristianismo", "Catedral", "Templo", null, null);
		//gestor.altaSantuario("Capilla Sixtina", "Ciudad del Vaticano", "Marmol", true, null, null, null,"Cristianismo", 533);
		
		gestor.altaArquitecto("Antonio Gaudi", "1852-06-25", null);
		gestor.altaArquitecto("Zaha Hadid", "1867-06-08", null);
		//gestor.altaArquitecto("Miguel Angel","1475-03-06", null);

		gestor.altaEstilo("Renacimiento", "Italia");
		gestor.altaEstilo("Barroco", "Italia");
		gestor.altaEstilo("Gotico", "Francia");
		gestor.altaEstilo("Neoclasicismo", "Italia");
		gestor.altaEstilo("Modernismo", "Espanya");
		gestor.altaEstilo("Clasico", "Grecia");

	}	
}
