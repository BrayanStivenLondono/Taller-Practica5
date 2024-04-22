package clases;

import java.util.Scanner;
import clases.GestorMonumentos;

public class Santuario extends Monumento {
	private String religion;
	private int anyosAntiguedad;
	
	public Santuario() {
		super();
		this.religion = "";
		this.anyosAntiguedad = 0;
		this.disponible = false;
		
	}
	
	public Santuario(String nombre, String ubicacion, String material, boolean disponible, 
			Estilo estilo, Arquitecto arquitecto, String religion, int anyosAntiguedad) {
		super(nombre, ubicacion, material, disponible, estilo, arquitecto);
		this.religion = religion;
		this.anyosAntiguedad = anyosAntiguedad;
		this.disponible = disponible;
	}


	//setter y getter
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}
	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	}

	@Override
	public String toString() {
		return "Santuario [religion=" + religion + ", anyosAntiguedad=" + anyosAntiguedad + ", nombre=" + nombre
				+ ", ubicacion=" + ubicacion + ", material=" + material + ", disponible=" + disponible + ", estilo="
				+ estilo + ", arquitecto=" + arquitecto + "]";
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
		System.out.print("Religion: ");
		this.religion = input.nextLine();
		input.nextLine();
		System.out.print("AnyosAntiguedad: ");
		this.anyosAntiguedad = input.nextInt();
		gestor.altaSantuario(nombre, ubicacion, material, disponible, estilo, arquitecto, religion, anyosAntiguedad);
		
	}
	
}
