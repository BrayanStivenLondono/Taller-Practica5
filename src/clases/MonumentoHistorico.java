package clases;

public class MonumentoHistorico extends Monumento {
	private String estadoConservacion;
	private boolean patrimonioHumanidad;
	private String uso;

	/**
	 * Constructor vacio de la clase MonumentoHistorico
	 */

	public MonumentoHistorico() {
		super();
		this.estadoConservacion = "";
		this.patrimonioHumanidad = false;
		this.uso = "";

	}

	/**
	 * Constructor de la clase MonumentoHistorico
	 * 
	 * @param nombre              Nombre del monumento
	 * @param ubicacion           Pais donde se encuetra el monumento
	 * @param material            Principal material con el que esta construido el
	 *                            monumento
	 * @param disponible          El monumento es disponbible para visitar
	 * @param cantidadVisitantes  Cantidad de visitantes del monumento
	 * @param anyosAntiguedad     la antiguedad de monuemento en años
	 * @param estadoConservacion  El estado en que que se encuentra en la actualidad
	 * @param patrimonioHumanidad Si el monumento es un patrimonio de la humanidad
	 * @param uso                 El principal uso que se le da al monumento
	 * @param estilo              Estilo arquitectonico del monumento
	 * @param arquitecto          Principal encargado del monumento
	 * 
	 * 
	 */

	public MonumentoHistorico(String nombre, String ubicacion, String material, boolean disponible,
			int cantidadVisitantes, int anyosAntiguedad, String estadoConservacion, boolean patrimonioHumanidad,
			String uso, Estilo estilo, Arquitecto arquitecto) {
		super(nombre, ubicacion, material, disponible, cantidadVisitantes, anyosAntiguedad, estilo, arquitecto);
		this.estadoConservacion = estadoConservacion;
		this.patrimonioHumanidad = patrimonioHumanidad;
		this.uso = uso;
		establecerEstadoConservacion();
	}

	// setter y getter
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

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
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
				"\nUso: " + uso +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto;
				
	}
	
	/**
	 * Metodo que establece un estado de conservacion a partir de los años de
	 * antiguedad
	 */
	public void establecerEstadoConservacion() {
		if (this.anyosAntiguedad <= 150) {
			this.estadoConservacion = "Excelente";
		} else if (this.anyosAntiguedad <= 450) {
			this.estadoConservacion = "Buen Estado";
		} else if (this.anyosAntiguedad <= 800) {
			this.estadoConservacion = "Aceptable";
		} else if (this.anyosAntiguedad <= 1000) {
			this.estadoConservacion = "Deficiente";
		} else {
			this.estadoConservacion = "Critico";
		}
	}
}
