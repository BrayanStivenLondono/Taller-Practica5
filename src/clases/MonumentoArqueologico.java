package clases;

import java.util.Scanner;

public class MonumentoArqueologico extends Monumento {
	private String dimensiones;
	private String civilizacion;
	private int anyosAntiguedad;
	
	public MonumentoArqueologico () {
		super();
		this.dimensiones = "";
		this.civilizacion = "";
		this.anyosAntiguedad = 0;
	}
	
	public MonumentoArqueologico(String nombre, String ubicacion, String material, boolean disponible, 
			Estilo estilo, Arquitecto arquitecto, String dimensiones, String civilizacion, int anyosAntiguedad) {
		super(nombre, ubicacion, material, disponible, estilo, arquitecto);
		this.dimensiones = dimensiones;
		this.civilizacion = civilizacion;
		this.anyosAntiguedad = anyosAntiguedad;
	}

	//SETTER Y GETTER
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	public String getCivilizacion() {
		return civilizacion;
	}
	public void setCivilizacion(String civilizacion) {
		this.civilizacion = civilizacion;
	}
	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}
	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	}

	@Override
	public String toString() {
		return "MonumentoArqueologico [dimensiones=" + dimensiones + ", civilizacion=" + civilizacion
				+ ", anyosAntiguedad=" + anyosAntiguedad + ", nombre=" + nombre + ", ubicacion=" + ubicacion
				+ ", material=" + material + ", disponible=" + disponible + ", estilo=" + estilo + ", arquitecto=" + arquitecto + "]";
	}
	
	public void solicitudDatos () {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Nombre: ");
		this.nombre = input.nextLine();
		System.out.print("Ubicacion (Pais): ");
		this.ubicacion = input.nextLine();
		System.out.print("Material: ");
		this.material = input.nextLine();
		System.out.print("Disponible (true | false): ");
		this.disponible = input.nextBoolean();
		this.estilo = null;
		this.arquitecto = null;
	}
	
}
