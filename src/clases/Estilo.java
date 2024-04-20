package clases;

public class Estilo {
	private String nombre;
	private String principios;
	private String paisOrigen;
	
	public Estilo() {
		this.nombre = "";
		this.principios = "";
		this.paisOrigen = "";
	}
	
	public Estilo(String nombre, String principios, String paisOrigen) {
		this.nombre = nombre;
		this.principios = principios;
		this.paisOrigen = paisOrigen;
	}

	//SETTER Y GETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrincipios() {
		return principios;
	}
	public void setPrincipios(String principios) {
		this.principios = principios;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Estilo [nombre=" + nombre + ", principios=" + principios + ", paisOrigen=" + paisOrigen + "]";
	}
	
}
