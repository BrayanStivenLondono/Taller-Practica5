package clases;

import java.util.Scanner;

public class Estilo {
	private String nombre;
	private String paisOrigen;
	
	public Estilo() {
		this.nombre = "";
		this.paisOrigen = "";
	}
	
	public Estilo(String nombre, String paisOrigen) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
	}

	//SETTER Y GETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "\nEstilo " + 
				"\nNombre: " + nombre + 
				"\nPaisOrigen: " + paisOrigen;
	}
	
	public void solicitudDatos () {
		@SuppressWarnings({ "resource" })
		Scanner input = new Scanner (System.in);
		
		GestorMonumentos gestor = new GestorMonumentos();
		
		System.out.print("\nNombre: ");
		this.nombre = input.nextLine();
		System.out.print("Pais de Origen: ");
		this.paisOrigen = input.nextLine();
		gestor.altaEstilo(nombre, paisOrigen);
		gestor.listarEstilos();
		
	}
	
}
