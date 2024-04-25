package clases;

public class MonumentoArqueologico extends Monumento {
	private String dimensiones;
	private String civilizacion;
	
	public MonumentoArqueologico () {
		super();
		this.dimensiones = "";
		this.civilizacion = "";
	}
	
	public MonumentoArqueologico(String nombre, String ubicacion, String material, boolean disponible, 
			int cantidadVisitantes, int anyosAntiguedad, String dimensiones, String civilizacion, 
			Estilo estilo, Arquitecto arquitecto) {
		super(nombre, ubicacion, material, disponible, cantidadVisitantes, anyosAntiguedad, estilo, arquitecto);
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
	
	@Override
	public String toString() {
		return "\nMonumento Arqueologico " + 
				"\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nMaterial: " + material + 
				"\nDisponible: " + disponible +
				"\nVisitantes: " + cantidadVisitantes +
				"\nAnyosAntiguedad: " + anyosAntiguedad +
				"\nDimensiones: " + dimensiones + 
				"\nCivilizacion: " + civilizacion +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto;
				
				
	}
}
