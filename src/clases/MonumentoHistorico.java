package clases;

public class MonumentoHistorico extends Monumento {
	private String estadoConservacion;
	private boolean patrimonioHumanidad;

	
	public MonumentoHistorico() {
		super();
		this.estadoConservacion = "";
		this.patrimonioHumanidad = false;
		
	}	

	public MonumentoHistorico(String nombre, String ubicacion, String material, 
			boolean disponible, int cantidadVisitantes, int anyosAntiguedad, String estadoConservacion, 
			boolean patrimonioHumanidad, Estilo estilo, Arquitecto arquitecto) {
		super(nombre, ubicacion, material, disponible, cantidadVisitantes, anyosAntiguedad, estilo, arquitecto);
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
	public boolean isPatrimonioHumanidad() {
		return patrimonioHumanidad;
	}
	public void setPatrimonioHumanidad(boolean patrimonioHumanidad) {
		this.patrimonioHumanidad = patrimonioHumanidad;
	}

	@Override
	public String toString() {
		return  "\nMonumento Historico " + 
				"\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nMaterial: " + material + 
				"\nDisponible: " + disponible + 
				"\nVisitantes: " + cantidadVisitantes +
				"\nAnyosAntiguedad: " + anyosAntiguedad +
				"\nEstadoConservacion: " + estadoConservacion +
				"\nPatrimonioHumanidad: " + patrimonioHumanidad +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto;
				
	}
	
	public void estadoConservacion (int anyosAntiguedad) {
		if (this.anyosAntiguedad <= 500) {
			this.estadoConservacion = "Bueno";
		} else if (this.anyosAntiguedad <= 800) {
			this.estadoConservacion = "Regular";
		} else {
			this.estadoConservacion = "Mal Estado";
		}
	}
}
