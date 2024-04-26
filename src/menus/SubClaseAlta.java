package menus;

import java.util.Scanner;
import clases.GestorMonumentos;
import programa.PeticionDatos;
import clases.Arquitecto;
import clases.Estilo;

public class SubClaseAlta {

	Arquitecto arquitecto = new Arquitecto();
	Estilo estilo = new Estilo();

	/**
	 * Metodo que llama al GestorMonumento para dar de alta la clase seleccionada
	 * por el usuario
	 * 
	 * @param gestor Llama a la clase GestorMonumentos donde estan los metodos para
	 *               dar de alta
	 */

	public void opcionAlta(GestorMonumentos gestor) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int opcionMenuAlta = 0;
		do {
			System.out.println("\n¿Que quieres dar de Alta?");
			System.out.println("1. - Monumento");
			System.out.println("2. - Arquitecto");
			System.out.println("3. - Estilo");
			System.out.println("4. - Salir");
			
			System.out.print("Elige: ");
			opcionMenuAlta = input.nextInt();
			switch (opcionMenuAlta) {
			case 1:
				PeticionDatos.altaMonumento(gestor);
				break;
			case 2:
				PeticionDatos.altaArquitecto(gestor);
				break;
			case 3:
				PeticionDatos.altaEstilo(gestor);
				break;
			case 4:
				System.out.println("\nHaz salido");
				break;
			default:
				System.out.println("\nOpcion incorrecta");
				break;
			}
		} while (opcionMenuAlta != 4);
	}
}
