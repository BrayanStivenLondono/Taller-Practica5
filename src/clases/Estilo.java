package clases;

public class Estilo {
	private String nombre;
	private String paisOrigen;

	/**
	 * Constructor de vacio de la clase Estilo
	 */

	public Estilo() {
		this.nombre = "";
		this.paisOrigen = "";
	}

	/**
	 * Constrcutor de la clase Estilo
	 * 
	 * @param nombre     Nombre del estilo arquitectonico
	 * @param paisOrigen Pais de origen de estilo arquitectonico
	 */

	public Estilo(String nombre, String paisOrigen) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
	}

	// SETTER Y GETTER
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

}
