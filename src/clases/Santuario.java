package clases;

import java.util.ArrayList;

public class Santuario extends Monumento {
	private String religion;
	private int anyosAntiguedad;
	
	public Santuario() {
		super();
		this.religion = "";
		this.anyosAntiguedad = 0;
		this.disponible = false;
		
	}
	public Santuario(String nombre, String ubicacion, String descripcion, String material, boolean disponible,
			Estilo estilo, ArrayList<Visitante> listaVisitantes, String religion,int anyosAntiguedad, Arquitecto arquitecto) {
		super(nombre, ubicacion, descripcion, material, disponible, estilo, listaVisitantes, arquitecto);
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
				+ ", ubicacion=" + ubicacion + ", descripcion=" + descripcion + ", material=" + material
				+ ", disponible=" + disponible + ", estilo=" + estilo + ", listaVisitantes=" + listaVisitantes
				+ ", arquitecto=" + arquitecto + "]";
	}
	
}
