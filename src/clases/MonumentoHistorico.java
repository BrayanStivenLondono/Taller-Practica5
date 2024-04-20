package clases;

import java.util.ArrayList;

public class MonumentoHistorico extends Monumento {
	private String estadoConservacion;
	private int anyosAntiguedad;
	
	public MonumentoHistorico() {
		super();
		this.estadoConservacion = "";
		this.anyosAntiguedad = 0;
		this.disponible = true;
		
	}

	public MonumentoHistorico(String nombre, String ubicacion, String descripcion, String material, boolean disponible,
			Estilo estilo, ArrayList<Visitante> listaVisitantes, String estadoConservacion, int anyosAntiguedad, Arquitecto arquitecto) {
		super(nombre, ubicacion, descripcion, material, disponible, estilo, listaVisitantes, arquitecto);
		this.estadoConservacion = estadoConservacion;
		this.anyosAntiguedad = anyosAntiguedad;
		this.disponible = disponible;
		
	}

	//setter y getter
	public String getEstadoConservacion() {
		return estadoConservacion;
	}
	public void setEstadoConservacion(String estadoConservacion) {
		this.estadoConservacion = estadoConservacion;
	}
	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}
	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	}

	@Override
	public String toString() {
		return "MonumentoHistorico [estadoConservacion=" + estadoConservacion + ", anyosAntiguedad=" + anyosAntiguedad
				+ ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", descripcion=" + descripcion + ", material="
				+ material + ", disponible=" + disponible + ", estilo=" + estilo + ", listaVisitantes="
				+ listaVisitantes + ", arquitecto=" + arquitecto + "]";
	}
	
}
