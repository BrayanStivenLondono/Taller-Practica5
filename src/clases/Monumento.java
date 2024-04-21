package clases;

import java.util.Scanner;
import clases.GestorMonumentos;

public class Monumento {//Superclase
	String nombre;
	String ubicacion;
	String material;
	boolean disponible;
	Estilo estilo;
	Arquitecto arquitecto;
	
	public Monumento(String nombre) {
		this.nombre = "";
		
	}
	
	public Monumento() {
		this.nombre = "";
		this.ubicacion = "";
		this.material = "";
		this.disponible = true;
		
	}
	
	public Monumento(String nombre, String ubicacion, String material, boolean disponible,
			Estilo estilo, Arquitecto arquitecto) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.material = material;
		this.disponible = disponible;
		this.estilo = estilo;
		
	}
	
	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public Estilo getEstilo() {
		return estilo;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	public Arquitecto getArquitecto() {
		return arquitecto;
	}
	public void setArquitecto(Arquitecto arquitecto) {
		this.arquitecto = arquitecto;
	}
	
	@Override
	public String toString() {
		return "Monumento [nombre=" + nombre + ", ubicacion=" + ubicacion + ", material=" + material 
				+ ", disponible=" + disponible + ", estilo=" + estilo + ", arquitecto=" + arquitecto + "]";
	}

	public void solicitudDatos () {
		Scanner input = new Scanner (System.in);
		
		GestorMonumentos gestor = new GestorMonumentos();
		
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
		gestor.altaMonumento(nombre, ubicacion, material, disponible, estilo, arquitecto);
	}
}
