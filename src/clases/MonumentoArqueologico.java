package clases;

public class MonumentoArqueologico extends Monumento {
	private String dimensiones;
	private String civilizacion;
	private String periodoHistorico;

	/**
	 * Constructor de vacio de la clase MonumentoArqueologico
	 * 
	 */

	public MonumentoArqueologico() {
		super();
		this.dimensiones = "";
		this.civilizacion = "";
	}

	/**
	 * Constructor de vacio de la clase MonumentoArqueologico
	 * 
	 * @param nombre             Nombre del monumento
	 * @param ubicacion          Pais donde se encuetra el monumento
	 * @param material           Principal material con el que esta construido el
	 *                           monumento
	 * @param disponible         El monumento es disponbible para visitar
	 * @param cantidadVisitantes Cantidad de visitantes del monumento
	 * @param anyosAntiguedad    la antiguedad de monuemento en años
	 * @param dimensiones        Midas de altura o ancho en cualquiero formato
	 *                           (cm,m)
	 * @param civilizacion       Civilizacion que fundo o poblo ese monumento
	 * @param periodoHistorico   Periodo en la historio donde se construyo el
	 *                           monumento
	 * @param estilo             Estilo arquitectonico del monumento
	 * @param arquitecto         Principal encargado del monumento
	 * 
	 * 
	 */

	public MonumentoArqueologico(String nombre, String ubicacion, String material, boolean disponible,
			int cantidadVisitantes, int anyosAntiguedad, String dimensiones, String civilizacion,
			String periodoHistorico, Estilo estilo, Arquitecto arquitecto) {
		super(nombre, ubicacion, material, disponible, cantidadVisitantes, anyosAntiguedad, estilo, arquitecto);
		this.dimensiones = dimensiones;
		this.civilizacion = civilizacion;
		this.periodoHistorico = periodoHistorico;
	}

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

	public String getPeriodoHistorico() {
		return periodoHistorico;
	}

	public void setPeriodoHistorico(String periodoHistorico) {
		this.periodoHistorico = periodoHistorico;
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
				"\nPeriodoHistorico: " + periodoHistorico +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto;
				
				
	}
}
