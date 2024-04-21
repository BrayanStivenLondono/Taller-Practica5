package menus;

import java.util.Scanner;
import clases.GestorMonumentos;
import menus.PeticionDeDatos;

public class SubMenuMonumentos {
	public void altaMenuTipoMonumento () {
		Scanner input2 = new Scanner (System.in);
		
		GestorMonumentos gestor = new GestorMonumentos();
		PeticionDeDatos datos = new PeticionDeDatos();
		
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
			
			switch (opcionTipoMunumento) {
			case 1:
				datos.peticionDatosTipoMonumento();
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Haz salido de Alta Monumento");
				break;
			default:
				System.out.println("Opcion incorrecta, intentalo de nuevo");
				break;
			}
		} while (opcionTipoMunumento!=5);
	}
}
