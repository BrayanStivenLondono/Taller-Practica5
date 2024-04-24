package clases;

public class Monumento {//Superclase
	String nombre;
	String ubicacion;
	String material;
	boolean disponible;
	Visitante visitante;
	Estilo estilo;
	Arquitecto arquitecto;
	
	public Monumento(String nombre) {
		this.nombre = "";
		
	}
	
	public Monumento() {
		this.nombre = "";
		this.ubicacion = "";
		this.material = "";
		this.disponible = true;
		
	}
	
	public Monumento(String nombre, String ubicacion, String material, boolean disponible,
			Visitante visitante, Estilo estilo, Arquitecto arquitecto) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.material = material;
		this.disponible = disponible;
		this.visitante = visitante;
		this.estilo = estilo;
		
	}
	
	//setter y getter
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
	public Visitante getVisitante() {
		return visitante;
	}
	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
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
				"\nEstilo: " + estilo + 
				"\nArquitecto: " + arquitecto +
				"\nVisitante: " + visitante;
	}
}