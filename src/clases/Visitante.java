package clases;

public class Visitante {//clase 1
	private String nombre;
	private int edad;
	private Genero genero;
	
	public Visitante() {
		this.nombre = "";
		this.edad = 0;
	}
	
	public Visitante(String nombre, int edad, Genero genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	//SETTER Y GETTER
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
		return "Visitante [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
}
