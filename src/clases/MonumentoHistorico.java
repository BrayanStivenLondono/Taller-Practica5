package clases;

public class MonumentoHistorico extends Monumento {
	private String estadoConservacion;
	private int anyosAntiguedad;
	
	public MonumentoHistorico() {
		super();
		this.estadoConservacion = "";
		this.anyosAntiguedad = 0;
		this.disponible = true;
		
	}	

	public MonumentoHistorico(String nombre, String ubicacion, String material, boolean disponible, 
			Visitante visitante, Estilo estilo, Arquitecto arquitecto, String estadoConservacion, int anyosAntiguedad) {
		super(nombre, ubicacion, material, disponible, visitante, estilo, arquitecto);
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
		return  "\nMonumento Historico " + 
				"\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nMaterial: " + material + 
				"\nDisponible: " + disponible + 
				"\nVisitante: " + visitante +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto +
				"\nEstadoConservacion: " + estadoConservacion +
				"\nAnyosAntiguedad: " + anyosAntiguedad;
	}
}
