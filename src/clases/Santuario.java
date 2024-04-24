package clases;

public class Santuario extends Monumento {
	private String religion;
	private int anyosAntiguedad;
	
	public Santuario() {
		super();
		this.religion = "";
		this.anyosAntiguedad = 0;
		this.disponible = false;
		
	}
	
	public Santuario(String nombre, String ubicacion, String material, boolean disponible, 
			Visitante visitante, Estilo estilo, Arquitecto arquitecto, String religion, int anyosAntiguedad) {
		super(nombre, ubicacion, material, disponible, visitante, estilo, arquitecto);
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
		return  "\nSantuario " + 
				"\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nMaterial: " + material + 
				"\nDisponible: " + disponible + 
				"\nVisitante: " + visitante +
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto +
				"\nReligion: " + religion + 
				"\nAnyosAntiguedad: " + anyosAntiguedad;
	}
	
}
