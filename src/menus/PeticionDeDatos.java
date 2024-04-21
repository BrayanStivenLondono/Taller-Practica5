package menus;

import clases.Monumento;
import java.util.Scanner;
import clases.Arquitecto;
import clases.Estilo;
import clases.GestorMonumentos;

public class PeticionDeDatos {
	
	Scanner input = new Scanner (System.in);
	GestorMonumentos gestor = new GestorMonumentos();
	
	public void peticionDatosTipoMonumento () {
		

		System.out.print("Nombre: ");
		String nombre = input.nextLine();
		System.out.print("Ubicacion (Pais): ");
		String ubicacion = input.nextLine();
		System.out.print("Material: ");
		String material = input.nextLine();
		System.out.print("Disponible (true | false): ");
		boolean disponible = input.nextBoolean();
		Estilo estilo = null;
		Arquitecto arquitecto = null;
		gestor.altaMonumento(nombre, ubicacion, material, disponible, estilo, arquitecto);
	}
}
