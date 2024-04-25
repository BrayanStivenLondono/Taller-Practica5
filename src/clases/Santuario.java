package clases;

public class Santuario extends Monumento {
	private String religion;
	private String entorno;
	private String tipo;

	/**
	 * Constructor vacio de la clase Santuario
	 */

	public Santuario() {
		super();
		this.religion = "";
		this.entorno = "";
		this.tipo = "";

	}

	/**
	 * Constructor de la clase Santuario
	 * 
	 * @param nombre             Nombre del monumento
	 * @param ubicacion          Pais donde se encuetra el monumento
	 * @param material           Principal material con el que esta construido el
	 *                           monumento
	 * @param disponible         El monumento es disponbible para visitar
	 * @param cantidadVisitantes Cantidad de visitantes del monumento
	 * @param anyosAntiguedad    la antiguedad de monuemento en años
	 * @param religion           Religion a la que esta dedicada el monumento
	 * @param entorno            El tipo de edificicaion religiosa (catedral,
	 *                           basilica)
	 * @param tipo               El tipo de Santuario (templo, domestico, jardin)
	 * @param estilo             Estilo arquitectonico del monumento
	 * @param arquitecto         Principal encargado del monumento
	 * 
	 * 
	 */

	public Santuario(String nombre, String ubicacion, String material, boolean disponible, int cantidadVisitantes,
			int anyosAntiguedad, String religion, String entorno, String tipo, Estilo estilo, Arquitecto arquitecto) {
		super(nombre, ubicacion, material, disponible, cantidadVisitantes, anyosAntiguedad, estilo, arquitecto);
		this.religion = religion;
		this.entorno = entorno;
		this.tipo = tipo;
	}

	// setter y getter
	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getEntorno() {
		return entorno;
	}

	public void setEntorno(String entorno) {
		this.entorno = entorno;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {	
		return  "\nSantuario " + 
				"\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nMaterial: " + material + 
				"\nDisponible: " + disponible + 
				"\nVisitantes: " + cantidadVisitantes +
				"\nAnyosAntiguedad: " + anyosAntiguedad +
				"\nReligion: " + religion +
				"\nEntorno: " + entorno +
				"\nTipo: " + tipo +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto;
				
	}
}
