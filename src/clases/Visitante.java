package clases;

public class Visitante {
	private String nombre;
	private int edad;
	Genero genero;
	
	public Visitante() {
		this.nombre = "";
	}
	
	public Visitante(String nombre, int edad, Genero genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return 	"\nVisitante "+ 
				"\nNombre: " + nombre + 
				"\nEdad: " + edad + 
				"\nGenero: " + genero;
	}
}
