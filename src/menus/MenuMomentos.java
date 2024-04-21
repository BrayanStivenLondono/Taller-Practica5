package menus;

import java.util.Scanner;

import clases.Genero;
import clases.GestorMonumentos;
import menus.SubMenuMonumentos;

public class MenuMomentos {
	
	SubMenuMonumentos tipoMonumento = new SubMenuMonumentos();
	
	public void opcionAlta(GestorMonumentos gestor) {	
		Scanner input = new Scanner (System.in);
		int opcionMenuAlta = 0;
		do {
			System.out.println("\n¿Que quieres dar de Alta");
			System.out.println("1. - Monumento");
			System.out.println("2. - Arquitecto");
			System.out.println("3. - Estilo");
			System.out.println("4. - Salir");
			System.out.print("Elige: ");
			opcionMenuAlta = input.nextInt();
			switch (opcionMenuAlta) {
			case 1:
				tipoMonumento.altaMenuTipoMonumento();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (opcionMenuAlta!=4);
		System.out.println("Doy de alta un Monumento");
		gestor.altaMonumento("Partenon", "Grecia", "Marmol", true, null, null);
		gestor.altaMonumento("coliseo", "italia", "Marmol", true, null, null);
		gestor.listarMonumentos();
		
		System.out.println("\nDoy de alta un Arquitecto");
		gestor.altaArquitecto("Juan", "Espanya", Genero.HOMBRE,"2019-04-02", "Clasico");
		gestor.listarArquitectos();
		
		System.out.println("\nDoy de alta un Estilo");
		gestor.altaEstilo("clasico", "formas", "italia");
		gestor.listarEstilos();
		System.out.println("Alta Arqueologico, histocio o santuario");
	}
	
}
