package menus;

import java.util.Scanner;
import clases.Monumento;
import clases.MonumentoArqueologico;
import clases.MonumentoHistorico;
import clases.Santuario;

public class SubMenuMonumentos {
	public void altaMenuTipoMonumento () {
		Scanner input2 = new Scanner (System.in);
		
		Monumento peticionDatos = new Monumento();
		Santuario peticionDatosSantiauro = new Santuario();
		MonumentoArqueologico peticionDatosArqueologico = new MonumentoArqueologico();
		MonumentoHistorico peticionDatosHistorico = new MonumentoHistorico();
		
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
				peticionDatos.solicitudDatos();
				break;
			case 2:
				peticionDatosArqueologico.solicitudDatos();
				break;
			case 3:
				peticionDatosHistorico.solicitudDatos();
				break;
			case 4:
				peticionDatosSantiauro.solicitudDatos();
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
}
