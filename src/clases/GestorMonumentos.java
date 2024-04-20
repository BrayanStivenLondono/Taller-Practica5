package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorMonumentos {
	private ArrayList<Monumento> listaMonumentos;
	private ArrayList<Arquitecto> listaArquitectos;
	private ArrayList<Estilo> listaEstilos;
	
	public GestorMonumentos () {
		listaMonumentos = new ArrayList<Monumento>();
		listaArquitectos = new ArrayList<Arquitecto>();
		listaEstilos = new ArrayList<Estilo>();
	}
	
	public void altaMonumento (String nombre, String ubicacion, String descripcion, String material, boolean disponible,
			Estilo estilo, ArrayList<Visitante> listaVisitantes) {
		Monumento monumento = new Monumento (nombre);
		monumento.setUbicacion(ubicacion);
		monumento.setDescripcion(descripcion);
		monumento.setMaterial(material);
		monumento.setDisponible(disponible);
		monumento.setEstilo(estilo);
		monumento.setListaVisitantes(listaVisitantes);
		listaMonumentos.add(monumento);
	}
	
	public void altaArquitecto (String nombre, String nacionalidad, Genero genero, String fechaNacimiento,
			String estiloArquitectonico) {
		Arquitecto arquitecto = new Arquitecto (nombre);
		arquitecto.setNacionalidad(nacionalidad);
		arquitecto.setGenero(genero);
		arquitecto.setFechaNacimiento(LocalDate.parse(fechaNacimiento));
		arquitecto.setEstiloArquitectonico(estiloArquitectonico);
		listaArquitectos.add(arquitecto);
	}
	
	public void altaEstilo (String nombre, String principios, String paisOrigen) {
		if (!existeEstilo(nombre)) {
			Estilo estilo = new Estilo (nombre, principios, paisOrigen);
			listaEstilos.add(estilo);
		}
	}
	
	public boolean existeEstilo (String nombreEstilo) {
		for (Estilo estilo : listaEstilos) {
			if (estilo != null && estilo.getNombre().equalsIgnoreCase(nombreEstilo)) {
				return true;
			}
		}
		return false;
	}
	
	public void listarMonumentos () {
		for (Monumento monumento : listaMonumentos) {
			if (monumento!=null) {
				System.out.println(monumento);
			}
		}
	}
	
	public void listarArquitectos () {
		for (int i = 0; i < listaArquitectos.size(); i++) {
			if (listaArquitectos != null) {
				System.out.println(listaArquitectos.get(i));
			}
		}
	}
	
	public void listarEstilos () {
		for (Estilo estilo : listaEstilos) {
			if (estilo!=null) {
				System.out.println(estilo);
			}
		}
	}
	
	public void listarMonumentoPorAtributo (Estilo estilo) {
		for (Monumento monumento : listaMonumentos) {
			if (monumento.getEstilo() != null && monumento.getEstilo().getNombre().equalsIgnoreCase(estilo.getNombre())) {
				System.out.println(monumento);
			}
		}
	}
	
	public Monumento buscarMonumento (String nombreMonumento) {
		for (Monumento monumento : listaMonumentos) {
			if (monumento != null && monumento.getNombre().equalsIgnoreCase(nombreMonumento)) {
				return monumento;
			}
		}
		return null;
	}
	
	public Estilo buscarEstilo (String nombreEstilo) {
		for (Estilo estilo : listaEstilos) {
			if (estilo != null && estilo.getNombre().equalsIgnoreCase(nombreEstilo)) {
				return estilo;
			}
		}
		return null;
	}
	
	public Arquitecto buscarArquitecto (String nombreArquitecto) {
		for (Arquitecto arquitecto : listaArquitectos) {
			if (arquitecto != null && arquitecto.getNombre().equalsIgnoreCase(nombreArquitecto)) {
				return arquitecto;
			}
		}
		return null;
	}
	
	public void asignarEstiloMonumento (String nombreEstilo, String nombreMonumento) {
		Monumento monumento = buscarMonumento(nombreMonumento);
		Estilo estilo = buscarEstilo(nombreEstilo);
		monumento.setEstilo(estilo);
	}
	
	public void asignarArquitectoMonumento (String nombreArquitecto, String nombreMonumento) {
		Monumento monumento = buscarMonumento(nombreMonumento);
		Arquitecto arquitecto = buscarArquitecto(nombreArquitecto);
		monumento.setArquitecto(arquitecto);
		
	}
	
 	public void eliminarMonumento (String nombreMonumento) {
		Iterator<Monumento> iterador = listaMonumentos.iterator();
		while (iterador.hasNext()) {
			Monumento monumento = iterador.next();
			if (monumento.getNombre().equalsIgnoreCase(nombreMonumento)) {
				iterador.remove();
			}
		}
	}
 }
