package menus;

import java.util.Scanner;

import clases.GestorMonumentos;

public class SubClaseAsignar {
	static Scanner input = new Scanner(System.in);

	/**
	 * Metodo que llama al GestorMonumento para hacer el tipo de asignacion
	 * seleccionada por el usuario
	 * 
	 * @param gestor Llama a la clase GestorMonumentos donde estan los metodos de
	 *               asignacion
	 */
	public static void asignacionMonumento(GestorMonumentos gestor) {
		int opcionAsignacionMonumento = 0;
		do {
			System.out.println("\n¿Que le Quieres Asignar a Monumento ?");
			System.out.println("1. - Estilo");
			System.out.println("2. - Arquitecto");
			System.out.println("3. - Salir");
			System.out.print("Opcion: ");
			opcionAsignacionMonumento = input.nextInt();
			input.nextLine();

			switch (opcionAsignacionMonumento) {
			case 1:
				System.out.print("\nNombre del Estilo: ");
				String nombreEstilo = input.nextLine();
				System.out.print("Nombre del Monumento: ");
				String nombreMonumento = input.nextLine();
				gestor.asignarEstiloMonumento(nombreEstilo, nombreMonumento);
				break;
			case 2:
				System.out.print("\nNombre del Arquitecto: ");
				String nombreArquitecto = input.nextLine();
				System.out.print("Nombre del Monumento: ");
				String monumentoAsignado = input.nextLine();
				gestor.asignarArquitectoMonumento(nombreArquitecto, monumentoAsignado);
				break;
			case 3:
				System.out.println("\nHaz Salido");
				break;
			default:
				System.out.println("\nOpcion incorrecta");
				break;
			}
		} while (opcionAsignacionMonumento != 3);
	}
}
