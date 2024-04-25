package menus;

import java.util.ArrayList;
import java.util.Scanner;

import clases.GestorMonumentos;

public class SubConsulta {
	public static void consultarAforo(GestorMonumentos gestor) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		int opcionConsultar = 0;
		do {
			System.out.println("\n¿Que quieres consultar?");
			System.out.println("1. - Por Tipo");
			System.out.println("2. - Generales");
			System.out.println("3. - Salir");
			System.out.print("Opcion: ");
			opcionConsultar = input.nextInt();
			
			switch (opcionConsultar) {
			case 1:
				gestor.estadisticasPorTipo();
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
		} while (opcionConsultar!=3);
	}
}
