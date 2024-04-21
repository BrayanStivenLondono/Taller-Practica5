package programa;

import java.util.Scanner;
import clases.GestorMonumentos;
import menus.MenuMomentos;

public class MenuPrincipal {

	public static void main(String[] args) {
		//Scanner input = new Scanner (System.in);
		Scanner input2 = new Scanner (System.in);
		
		GestorMonumentos gestor = new GestorMonumentos();
		MenuMomentos menu = new MenuMomentos();
		
		int opcionMenu = 0;
		do {
			System.out.println("\n------Menu------");
			System.out.println("1. - Alta");
			System.out.println("2. - Listar");
			System.out.println("3. - Buscar");
			System.out.println("4. - Eliminar");
			System.out.println("5. - Extra");
			System.out.println("6. - Extra");
			System.out.println("7. - Salir");
			System.out.print("Elige: ");
			opcionMenu = input2.nextInt();
			
			switch (opcionMenu) {
			case 1:
				menu.opcionAlta(gestor);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				System.out.println("\nFin del programa");
				break;
			default:
				System.out.println("\nOpcion Incorrecta, intentalo de nuevo");
				break;
			}
		} while (opcionMenu!=7);
		//altas
		input2.close();
		
		System.out.println();
		gestor.asignarEstiloMonumento("clasico", "coliseo");
		gestor.asignarArquitectoMonumento("Juan", "coliseo");
		gestor.listarMonumentos();
		
	}

}
