package clases;

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
	
	public MonumentoArqueologico(String nombre, String ubicacion, String material, boolean disponible, Visitante visitante, 
			Estilo estilo, Arquitecto arquitecto, String dimensiones, String civilizacion, int anyosAntiguedad) {
		super(nombre, ubicacion, material, disponible, visitante , estilo, arquitecto);
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
		return "\nMonumento Arqueologico " + 
				"\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nMaterial: " + material + 
				"\nDisponible: " + disponible +
				"\nVisitante: " + visitante +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto +
				"\nDimensiones: " + dimensiones + 
				"\nCivilizacion: " + civilizacion + 
				"\nAnyosAntiguedad: " + anyosAntiguedad;
	}
}
