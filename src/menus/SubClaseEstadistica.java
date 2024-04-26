package menus;

import java.util.Scanner;

import clases.GestorMonumentos;

public class SubClaseEstadistica {

	/**
	 * Metodo que llama al GestorMonumento para hacer el tipo de consulta
	 * seleccionada por el usuario
	 * 
	 * @param gestor Llama a la clase GestorMonumentos donde estan los metodos de
	 *               las estadisticas
	 */
	public static void consultarEstadisticas(GestorMonumentos gestor) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int opcionConsultar = 0;
		do {
			System.out.println("\n¿Que quieres consultar?");
			System.out.println("1. - E. Por tipo de Monumento");
			System.out.println("2. - E. Generales");
			System.out.println("3. - Salir");
			System.out.print("Opcion: ");
			opcionConsultar = input.nextInt();

			switch (opcionConsultar) {
			case 1:
				gestor.estadisticasPorTipoMonumento();
				break;
			case 2:
				gestor.estadisticasGenerales();
				break;
			case 3:
				System.out.println("Haz salido de Consultar");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcionConsultar != 3);
	}
}
