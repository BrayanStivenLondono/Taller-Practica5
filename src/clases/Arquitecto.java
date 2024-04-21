package clases;

import java.time.LocalDate;

public class Arquitecto {
	private String nombre;
	private String nacionalidad;
	private Genero genero;
	private LocalDate fechaNacimiento;
	
	public Arquitecto(String nombre) {
		this.nombre = "";
	}

	public Arquitecto(String nombre, String nacionalidad, Genero genero, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}

	//SETTER Y GETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

	@Override
	public String toString() {
		return "Arquitecto [nombre=" + ", nacionalidad=" + nacionalidad
				+ ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
