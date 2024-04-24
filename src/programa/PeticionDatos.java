package programa;

import java.util.Scanner;

import clases.Arquitecto;
import clases.Estilo;
import clases.Genero;
import clases.GestorMonumentos;
import clases.Visitante;

public class PeticionDatos {
	
	static Scanner input = new Scanner (System.in);
	static Scanner input2 = new Scanner (System.in);
	
	public static void listadoClases(GestorMonumentos gestor) {
		int opcionListar = 0;
		do {
			System.out.println("\n¿Que quieres Listar");
			System.out.println("1. - Los Monumentos");
			System.out.println("2. - Los Estilo");
			System.out.println("3. - Los Aquitectos");
			System.out.println("4. - Todo");
			System.out.println("5. - Salir");
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
		System.out.print("Nombre: ");
		String nombre = input.nextLine();
		System.out.print("Nacionalidad: ");
		String nacionalidad = input.nextLine();
		System.out.print("Genero: ");
		String genero = input.nextLine();
		System.out.print("Fecha de Nacimiento: ");
		String fechaNacimiento = input.nextLine();
		gestor.altaArquitecto(nombre, nacionalidad, genero, fechaNacimiento);
	}
	

	
	public static void altaMonumento (GestorMonumentos gestor) {
		int opcionTipoMunumento = 0;
		do {
			System.out.println("\n¿Que tipo de Monumento?");
			System.out.println("1. - Monumento (estandar)");
			System.out.println("2. - M. Arqueologico");
			System.out.println("3. - M. Historico");
			System.out.println("4. - M. Santuario");
			System.out.println("5. - Salir");
			System.out.print("Opcion: ");
			opcionTipoMunumento = input2.nextInt();
			input.nextLine();
			
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
				Visitante visitantes = null;
				Estilo estilo = null;
				Arquitecto arquitecto = null;
				gestor.altaMonumento(nombre, ubicacion, material, disponible, visitantes, estilo, arquitecto);
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
				Visitante visitantesArqueologico = null;
				Estilo estiloArqueologico  = null;
				Arquitecto arquitectoArqueologico = null;
				System.out.print("Dimensiones: ");
				String dimensiones = input.nextLine();
				System.out.println("Civilizacion: ");
				String civilizacion = input.nextLine();
				System.out.println("Antiguedad");
				int anyosAntiguedad = input2.nextInt();
				gestor.altaMonumentoArqueologico(nombreArqueologico, ubicacionArqueologico, materialArqueologico, disponibleArqueologico, 
						visitantesArqueologico ,estiloArqueologico, arquitectoArqueologico, dimensiones, civilizacion, anyosAntiguedad);
				break;
			case 3:
				System.out.print("Nombre: ");
				String nombreHistorico = input.nextLine();
				System.out.print("Ubicacion (Pais): ");
				String ubicacionHistorico = input.nextLine();
				System.out.print("Material: ");
				String materialHistorico = input.nextLine();
				System.out.print("Disponible (true | false): ");
				boolean disponibleHistorico = input.nextBoolean();
				Visitante visitantesHistorico = null;
				Estilo estiloHistorico = null;
				Arquitecto arquitectoHistorico = null;
				System.out.print("Estado de Conservacion: ");
				String estadoConservacion = input.nextLine();
				System.out.println("Antiguedad");
				int anyosAntiguedadHistorico = input2.nextInt();
				gestor.altaMonumentoHistorico(nombreHistorico, ubicacionHistorico, materialHistorico, disponibleHistorico, 
						visitantesHistorico, estiloHistorico, arquitectoHistorico, estadoConservacion, anyosAntiguedadHistorico);
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
				Visitante visitantesSanturio = null;
				Estilo estiloSantuario = null;
				Arquitecto arquitectoSantuario = null;
				System.out.print("Religion: ");
				String religion = input.nextLine();
				System.out.print("AnyosAntiguedad: ");
				int anyosAntiguedadSantuario = input2.nextInt();
				gestor.altaSantuario(nombreSantuario, ubicacionSantuario, materialSantuario, disponibleSantuario, 
						visitantesSanturio ,estiloSantuario, arquitectoSantuario, religion, anyosAntiguedadSantuario);
				gestor.listarMonumentos();
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
		gestor.altaMonumento("Sagrada Familia", "Espanya", "Piedra", true, null, null, null);
		//gestor.altaMonumento("Estatua de la Libertad", "EEUU", "Cobre", false, null, null, null);
		//gestor.altaMonumento("Gran Muralla China", "China", "Ladrillo", true, null, null, null);
		gestor.altaMonumento("Taj Mahal", "India", "Marmol", true, null, null, null);
		
		gestor.altaMonumentoArqueologico("Piramide de Giza", "Egipto", "Piedra", true, null, null, null, "138.8m de altura", "Antiguo Egipto", 4500);
		gestor.altaMonumentoArqueologico("Petra", "Jordania", "Roca", true, null, null, null, null, "Nabateos", 2000);
		gestor.altaMonumentoArqueologico("Acropolis de Atenas", "Grecia", "Marmol", true, null, null, null, "3 hectareas", "Antiguo Grecia", 2500);
		
		gestor.altaMonumentoHistorico("Castillo de Edimburgo", "Escocia", "Piedra", false, null, null, null, "Bueno", 900);
		gestor.altaMonumentoHistorico("Castillo de Praga", "Republica Checa", "Piedra", false, null, null, null, "Bueno", 1100);
		//gestor.altaMonumentoHistorico("Torre de Londres", "Ingleterra", "Piedra", true, null, null, null, "Bueno", 950);
		
		gestor.altaSantuario("Basilica de San Pedro", "Ciudad del Vaticano", "Marmol", true, null, null, null,"Cristianismo", 398);
		gestor.altaSantuario("Catedral de Notre Dame", "Francia", "Pedra", true, null, null, null,"Cristianismo", 669);
		//gestor.altaSantuario("Capilla Sixtina", "Ciudad del Vaticano", "Marmol", true, null, null, null,"Cristianismo", 533);
		
		gestor.altaArquitecto("Antonio Gaudi", "Espanyol",Genero.HOMBRE, "1852-06-25");
		gestor.altaArquitecto("Zaha Hadid", "Britanica",Genero.MUJER, "1867-06-08");
		// gestor.altaArquitecto("Miguel Angel", "Italiana",Genero.HOMBRE, "1475-03-06");

		gestor.altaEstilo("Renacimiento", "Italia");
		gestor.altaEstilo("Barroco", "Italia");
		gestor.altaEstilo("Gotico", "Francia");
		gestor.altaEstilo("Neoclasicismo", "Italia");
		gestor.altaEstilo("Modernismo", "Espanya");
		gestor.altaEstilo("Clasico", "Grecia");
	}
	
}
