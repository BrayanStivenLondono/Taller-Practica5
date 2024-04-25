package clases;

public class Monumento {
	protected String nombre;
	protected String ubicacion;
	protected String material;
	protected boolean disponible;
	protected int cantidadVisitantes;
	protected int anyosAntiguedad;
	protected Estilo estilo;
	protected Arquitecto arquitecto;

	/**
	 * Constructor de la clase Monumento
	 * 
	 * @param nombre Nombre del monumento
	 */
	public Monumento(String nombre) {
		this.nombre = "";

	}

	/**
	 * Contructor de la clse Monumento vacio
	 */

	public Monumento() {
		this.nombre = "";
		this.ubicacion = "";
		this.material = "";
		this.disponible = true;

	}

	/**
	 * Constrcutor de la clase monumento
	 * 
	 * @param nombre          Nombre del monumento
	 * @param ubicacion       Pais donde se encuetra el monumento
	 * @param material        Principal material con el que esta construido el
	 *                        monumento
	 * @param disponible      El monumento es disponbible para visitar
	 * @param anyosAntiguedad la antiguedad de monuemento en años
	 * @param anyosAntiguedad Su antiguedad en años
	 * @param estilo          Estilo arquitectonico del monumento
	 * @param arquitecto      Principal encargado del monumento
	 */

	public Monumento(String nombre, String ubicacion, String material, boolean disponible, int cantidadVisitantes,
			int anyosAntiguedad, Estilo estilo, Arquitecto arquitecto) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.material = material;
		this.disponible = disponible;
		this.cantidadVisitantes = cantidadVisitantes;
		this.anyosAntiguedad = anyosAntiguedad;
		this.estilo = estilo;
		this.arquitecto = arquitecto;
		calcularVisitantesPorDisponibilidad();

	}

	// setter y getter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getCantidadVisitantes() {
		return cantidadVisitantes;
	}

	public void setCantidadVisitantes(int cantidadVisitantes) {
		this.cantidadVisitantes = cantidadVisitantes;
	}

	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}

	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public Arquitecto getArquitecto() {
		return arquitecto;
	}

	public void setArquitecto(Arquitecto arquitecto) {
		this.arquitecto = arquitecto;
	}

	@Override
	public String toString() {
		return  "\nMonumento " + 
				"\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nMaterial: " + material + 
				"\nDisponible: " + disponible +
				"\nVisitantes: " + cantidadVisitantes +
				"\nAnyosAntiguedad: " + anyosAntiguedad +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto;
	}
	
	/**
	 * calcularVisitantePorDisponibilidad metodo que iniciliza a cero la cantidad de
	 * visitantes si disponibilidad es false
	 */
	public void calcularVisitantesPorDisponibilidad() {
		if (this.disponible == false) {
			this.cantidadVisitantes = 0;
		}
	}
}
