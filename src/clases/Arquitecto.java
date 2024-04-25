package clases;

import java.time.LocalDate;

public class Arquitecto {
	private String nombre;
	private LocalDate fechaNacimiento;
	Estilo estilo;

	/**
	 * Constructor vacio de la clase Arquitecto
	 */
	public Arquitecto() {

	}

	/**
	 * Constrcutor de clase Arquitecto
	 * 
	 * @param nombre          Nombre del arquitecto
	 * @param fechaNacimiento Fecha de nacimiento del arquitecto
	 * @param estilo          Estilo arquitectonico del Arquitecto
	 * 
	 */
	public Arquitecto(String nombre, LocalDate fechaNacimiento, Estilo estilo) {
		this.nombre = nombre;
	}

	// SETTER Y GETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return  "\nArquitecto " + 
				"\nNombre: " + nombre + 
				"\nFechaNacimiento: " + fechaNacimiento + 
				"\nEstilo: " + estilo;
	}
}
