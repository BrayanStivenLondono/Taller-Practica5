package clases;

import java.util.ArrayList;

public class Monumento {//Superclase
	String nombre;
	String ubicacion;
	String descripcion;
	String material;
	boolean disponible;
	Estilo estilo;
	ArrayList<Visitante> listaVisitantes;
	Arquitecto arquitecto;
	
	public Monumento(String nombre) {
		this.nombre = "";
		
	}
	
	public Monumento() {
		this.nombre = "";
		this.ubicacion = "";
		this.descripcion = "";
		this.material = "";
		this.disponible = true;
		
	}
	
	public Monumento(String nombre, String ubicacion, String descripcion, String material, boolean disponible,
			Estilo estilo, ArrayList<Visitante> listaVisitantes, Arquitecto arquitecto) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.descripcion = descripcion;
		this.material = material;
		this.disponible = disponible;
		this.estilo = estilo;
		this.listaVisitantes = listaVisitantes;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public Estilo getEstilo() {
		return estilo;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	public ArrayList<Visitante> getListaVisitantes() {
		return listaVisitantes;
	}
	public void setListaVisitantes(ArrayList<Visitante> listaVisitantes) {
		this.listaVisitantes = listaVisitantes;
	}
	public Arquitecto getArquitecto() {
		return arquitecto;
	}
	public void setArquitecto(Arquitecto arquitecto) {
		this.arquitecto = arquitecto;
	}
	
	@Override
	public String toString() {
		return "Monumento [nombre=" + nombre + ", ubicacion=" + ubicacion + ", descripcion=" + descripcion
				+ ", material=" + material + ", disponible=" + disponible + ", estilo=" + estilo + ", listaVisitantes="
				+ listaVisitantes + ", arquitecto=" + arquitecto + "]";
	}

	public void consultarAforo () {
		
	}
	
}
