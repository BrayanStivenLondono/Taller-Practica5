package programa;

import java.util.Scanner;
import clases.GestorMonumentos;
import menus.SubClaseAlta;
import menus.SubClaseEstadistica;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		GestorMonumentos gestor = new GestorMonumentos();
		SubClaseAlta menu = new SubClaseAlta();
		PeticionDatos.cargaDeDatos(gestor);

		int opcionMenu = 0;
		do {
			System.out.println("\n============ Menú ============");
			System.out.println("|1. - Alta                    |");
			System.out.println("|2. - Buscar                  |");
			System.out.println("|3. - Listar                  |");
			System.out.println("|4. - Eliminar                |");
			System.out.println("|5. - Asignar                 |");
			System.out.println("|6. - Estadisticas            |");
			System.out.println("|7. - Salir                   |");
			System.out.println("|_____________________________|");
			System.out.print("Elige una opción: ");
			opcionMenu = input.nextInt();

			switch (opcionMenu) {
			case 1:
				menu.opcionAlta(gestor);
				break;
			case 2:
				PeticionDatos.buscar(gestor);
				break;
			case 3:
				PeticionDatos.listar(gestor);
				break;
			case 4:
				PeticionDatos.eliminar(gestor);
				break;
			case 5:
				PeticionDatos.asignar(gestor);
				break;
			case 6:
				SubClaseEstadistica.consultarEstadisticas(gestor);
				break;
			case 7:
				System.out.println("\nFin del programa");
				break;
			default:
				System.out.println("\nOpcion Incorrecta, intentalo de nuevo");
				break;
			}
		} while (opcionMenu != 7);

		input.close();
	}
}
