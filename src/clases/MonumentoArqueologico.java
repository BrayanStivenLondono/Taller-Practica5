package clases;

import java.util.ArrayList;

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
	
	public MonumentoArqueologico(String nombre, String ubicacion, String descripcion, String material, boolean disponible, 
			Estilo estilo, ArrayList<Visitante> listaVisitantes, String dimensiones, String civilizacion, int anyosAntiguedad,
			Arquitecto arquitecto) {
		super(nombre, ubicacion, descripcion, material, disponible, estilo, listaVisitantes, arquitecto);
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
				+ ", descripcion=" + descripcion + ", material=" + material + ", disponible=" + disponible + ", estilo="
				+ estilo + ", listaVisitantes=" + listaVisitantes + ", arquitecto=" + arquitecto + "]";
	}
	
}
