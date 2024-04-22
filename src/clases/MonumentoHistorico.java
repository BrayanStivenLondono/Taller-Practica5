package clases;

import java.util.Scanner;

public class MonumentoHistorico extends Monumento {
	private String estadoConservacion;
	private int anyosAntiguedad;
	
	public MonumentoHistorico() {
		super();
		this.estadoConservacion = "";
		this.anyosAntiguedad = 0;
		this.disponible = true;
		
	}	

	public MonumentoHistorico(String nombre, String ubicacion, String material, boolean disponible, 
			Estilo estilo, Arquitecto arquitecto, String estadoConservacion, int anyosAntiguedad) {
		super(nombre, ubicacion, material, disponible, estilo, arquitecto);
		this.estadoConservacion = estadoConservacion;
		this.anyosAntiguedad = anyosAntiguedad;
		this.disponible = disponible;
	}

	//setter y getter
	public String getEstadoConservacion() {
		return estadoConservacion;
	}
	public void setEstadoConservacion(String estadoConservacion) {
		this.estadoConservacion = estadoConservacion;
	}
	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}
	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	}

	@Override
	public String toString() {
		return "MonumentoHistorico [estadoConservacion=" + estadoConservacion + ", anyosAntiguedad=" + anyosAntiguedad
				+ ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", material=" + material + ", disponible="
				+ disponible + ", estilo=" + estilo + ", arquitecto="
				+ arquitecto + "]";
	}
	public void solicitudDatos () {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		GestorMonumentos gestor = new GestorMonumentos();
		
		System.out.print("\nNombre: ");
		this.nombre = input.nextLine();
		System.out.print("Ubicacion (Pais): ");
		this.ubicacion = input.nextLine();
		System.out.print("Material: ");
		this.material = input.nextLine();
		System.out.print("Disponible (true | false): ");
		this.disponible = input.nextBoolean();
		this.estilo = null;
		this.arquitecto = null;
		System.out.print("Estado de Conservacion: ");
		this.estadoConservacion = input.nextLine();
		input.nextLine();
		System.out.println("Antiguedad");
		this.anyosAntiguedad = input.nextInt();
		
		gestor.altaMonumentoHistorico(nombre, ubicacion, material, disponible, estilo, arquitecto, estadoConservacion, anyosAntiguedad);
	}
}
