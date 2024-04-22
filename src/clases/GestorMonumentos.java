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
	
	public void altaMonumento (String nombre, String ubicacion, String material, boolean disponible, Estilo estilo, Arquitecto arquitecto) {
		Monumento monumento = new Monumento (nombre);
		monumento.setNombre(nombre);
		monumento.setUbicacion(ubicacion);
		monumento.setMaterial(material);
		monumento.setDisponible(disponible);
		monumento.setEstilo(estilo);
		monumento.setArquitecto(arquitecto);
		listaMonumentos.add(monumento);
	}
	
	public void altaArquitecto (String nombre, String nacionalidad, Genero genero, String fechaNacimiento) {
		Arquitecto arquitecto = new Arquitecto ();
		arquitecto.setNombre(nombre);
		arquitecto.setNacionalidad(nacionalidad);
		arquitecto.setGenero(genero);
		arquitecto.setFechaNacimiento(LocalDate.parse(fechaNacimiento));
		listaArquitectos.add(arquitecto);
	}
	
	public void altaMonumentoArqueologico (String nombre, String ubicacion, String material, boolean disponible, 
			Estilo estilo, Arquitecto arquitecto, String dimensiones, String civilizacion, int anyosAntiguedad) {
		MonumentoArqueologico monumentoArqueologico = new MonumentoArqueologico (nombre, ubicacion, 
				material, disponible, estilo, arquitecto, dimensiones, civilizacion, anyosAntiguedad);
		listaMonumentos.add(monumentoArqueologico);
	}
	
	public void altaMonumentoHistorico (String nombre, String ubicacion, String material, boolean disponible, 
			Estilo estilo, Arquitecto arquitecto, String estadoConservacion, int anyosAntiguedad) {
		MonumentoHistorico monumentoHistorico = new MonumentoHistorico(nombre, ubicacion, 
				material, disponible, estilo, arquitecto, estadoConservacion, anyosAntiguedad);
		listaMonumentos.add(monumentoHistorico);
	}
	
	public void altaSantuario (String nombre, String ubicacion, String material, boolean disponible, 
			Estilo estilo, Arquitecto arquitecto, String religion, int anyosAntiguedad) {
		Santuario santuario = new Santuario(nombre, ubicacion, material, disponible, estilo, arquitecto, religion, anyosAntiguedad);
		listaMonumentos.add(santuario);
	}
	
	public void altaEstilo (String nombre, String paisOrigen) {
		if (!existeEstilo(nombre)) {
			Estilo estilo = new Estilo (nombre, paisOrigen);
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
		if (buscarMonumento(nombreMonumento)!=null &&  buscarEstilo(nombreEstilo)!=null) {
			Monumento monumento = buscarMonumento(nombreMonumento);
			Estilo estilo = buscarEstilo(nombreEstilo);
			monumento.setEstilo(estilo);
		}
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
