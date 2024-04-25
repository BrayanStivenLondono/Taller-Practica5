package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestorMonumentos {
	static Scanner input = new Scanner (System.in);
	private ArrayList<Monumento> listaMonumentos;
	private ArrayList<Arquitecto> listaArquitectos;
	private ArrayList<Estilo> listaEstilos;
	
	public GestorMonumentos () {
		listaMonumentos = new ArrayList<Monumento>();
		listaArquitectos = new ArrayList<Arquitecto>();
		listaEstilos = new ArrayList<Estilo>();

	}
	
	public void altaMonumento (String nombre, String ubicacion, String material, boolean disponible,
			int cantidadVisitantes, int anyosAntiguedad, Estilo estilo, Arquitecto arquitecto) {
		Monumento monumento = new Monumento (nombre);
		monumento.setNombre(nombre);
		monumento.setUbicacion(ubicacion);
		monumento.setMaterial(material);
		monumento.setDisponible(disponible);
		monumento.setCantidadVisitantes(cantidadVisitantes);
		monumento.setAnyosAntiguedad(anyosAntiguedad);
		monumento.setEstilo(estilo);
		monumento.setArquitecto(arquitecto);
		listaMonumentos.add(monumento);
	}
	
	public void altaArquitecto (String nombre, String fechaNacimiento, Estilo estilo) {
		Arquitecto arquitecto = new Arquitecto ();
		arquitecto.setNombre(nombre);
		arquitecto.setFechaNacimiento(LocalDate.parse(fechaNacimiento));
		arquitecto.setEstilo(estilo);
		listaArquitectos.add(arquitecto);
	}
	
	public void altaMonumentoArqueologico (String nombre, String ubicacion, String material, boolean disponible, 
			int cantidadVisitantes, int anyosAntiguedad, String dimensiones, String civilizacion, 
			Estilo estilo, Arquitecto arquitecto) {
		MonumentoArqueologico monumentoArqueologico = new MonumentoArqueologico (nombre, ubicacion, 
				material, disponible, cantidadVisitantes, anyosAntiguedad,dimensiones, civilizacion,estilo, arquitecto);
		listaMonumentos.add(monumentoArqueologico);
	}
	
	public void altaMonumentoHistorico (String nombre, String ubicacion, String material, 
			boolean disponible, int cantidadVisitantes, int anyosAntiguedad, String estadoConservacion, 
			boolean patrimonioHumanidad, Estilo estilo, Arquitecto arquitecto) {
		MonumentoHistorico monumentoHistorico = new MonumentoHistorico(nombre, ubicacion, material, disponible, 
				cantidadVisitantes, anyosAntiguedad, estadoConservacion , patrimonioHumanidad, estilo, arquitecto);
		listaMonumentos.add(monumentoHistorico);
	}
	
	public void altaSantuario (String nombre, String ubicacion, String material, boolean disponible, 
			int cantidadVisitantes, int anyosAntiguedad, String religion, String entorno, 
			String tipo, Estilo estilo, Arquitecto arquitecto) {
		Santuario santuario = new Santuario(nombre, ubicacion, material, disponible, 
				cantidadVisitantes, anyosAntiguedad, religion, entorno, tipo, estilo, arquitecto);
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
	
	
	public void listarMonumentos() {
	    String opcionListar = "";

	    do {
	        System.out.println("\n¿Cual Monumento ?");
	        System.out.println(" Monumento");
	        System.out.println(" Historico");
	        System.out.println(" Arqueologico");
	        System.out.println(" Santuario");
	        System.out.println(" Salir");
	        System.out.print("Opcion: ");
	        opcionListar = input.nextLine();

	        for (Monumento monumento : listaMonumentos) {
	            if (opcionListar.equalsIgnoreCase("Monumento")) {
	                System.out.println(monumento);
	            } else if (opcionListar.equalsIgnoreCase("Historico") && monumento instanceof MonumentoHistorico) {
	                System.out.println(monumento);
	            } else if (opcionListar.equalsIgnoreCase("Arqueologico") && monumento instanceof MonumentoArqueologico) {
	                System.out.println(monumento);
	            } else if (opcionListar.equalsIgnoreCase("Santuario") && monumento instanceof Santuario) {
	                System.out.println(monumento);
	            } 
	        }
	    } while (!opcionListar.equalsIgnoreCase("Salir"));
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
 	
 	public void eliminarEstilo (String nombreEstilo) {
		Iterator<Estilo> iterador = listaEstilos.iterator();
		while (iterador.hasNext()) {
			Estilo estilo = iterador.next();
			if (estilo.getNombre().equalsIgnoreCase(nombreEstilo)) {
				iterador.remove();
			}
		}
	}
 	
 	public void eliminarArquitecto (String nombreArquitecto) {
		Iterator<Arquitecto> iterador = listaArquitectos.iterator();
		while (iterador.hasNext()) {
			Arquitecto arquitecto = iterador.next();
			if (arquitecto.getNombre().equalsIgnoreCase(nombreArquitecto)) {
				iterador.remove();
			}
		}
	}
 	
 	
 	public void estadisticasPorTipo () {
 		int totalVisitantesTipoSeleccionado = 0;
 		int totalMonumentos = 0;
 		int opcionConsultar = 0;
 		
 		do {
	 		System.out.println("\n¿Que tipo de Monumento?");
	 		System.out.println("1. - Monumento (estandar)");
	 		System.out.println("2. - M. Historico");
	 		System.out.println("3. - M. Arqueologico");
	 		System.out.println("4. - Santuario");
	 		System.out.println("5. - Salir");
	 		System.out.print("Opcion: ");
	 		opcionConsultar = input.nextInt();
	 		
	 		for (Monumento monumento : listaMonumentos) {
	 			if (monumento!=null) {
	 				totalMonumentos++;
		 		 if ((opcionConsultar == 1 && monumento instanceof Monumento) 
		 				 || (opcionConsultar == 2 && monumento instanceof MonumentoHistorico)
		 				 || (opcionConsultar == 3 && monumento instanceof MonumentoArqueologico) 
		 				 || (opcionConsultar == 4 && monumento instanceof Santuario)) {
		             totalVisitantesTipoSeleccionado += monumento.getCantidadVisitantes();
		         }
	 		   }
	 		}
	 		double mediaVisitantes = totalVisitantesTipoSeleccionado/totalMonumentos;
	        System.out.println("\nCantidad de visitantes del tipo de monumento seleccionado: "+totalVisitantesTipoSeleccionado);
	        System.out.println("Media de visitantes del Monumento: "+mediaVisitantes+"%");
 		} while (opcionConsultar!=5);
        
 	}
 	
 	
 	public void estadisticasGenerales () {
 		int cantidadVisitante = 0;
 		int cantidadMonumento = 0;
 		Monumento monumentoMasVisitado = null;
 		Monumento monumentoMenosVisitado = null;
 		Monumento monumentoMasAntiguo = null;
 		Monumento monumentoMasActual = null;
 		double mediaVisitanteTodosMonumentos = 0;
 		
 		for (Monumento monumento : listaMonumentos) {
 			cantidadVisitante += monumento.getCantidadVisitantes();
 	        if (monumento != null) {
 	        	cantidadMonumento++;
 	        	mediaVisitanteTodosMonumentos = cantidadVisitante/cantidadMonumento;
 	        	
 	            if (monumentoMasVisitado == null || monumento.getCantidadVisitantes() > 
 	            monumentoMasVisitado.getCantidadVisitantes()) {
 	                monumentoMasVisitado = monumento;
 	            }
 	            
 	           if (monumentoMenosVisitado == null || monumento.getCantidadVisitantes() < 
 	        		   monumentoMenosVisitado.getCantidadVisitantes()) {
 	        	  monumentoMenosVisitado = monumento;
	            }
 	           
 	           if (monumentoMasAntiguo == null || monumento.getAnyosAntiguedad() > 
 	           monumentoMasAntiguo.getAnyosAntiguedad()) {
 	        	   monumentoMasAntiguo = monumento;
 	        	 }
 	           
 	          if (monumentoMasActual == null || monumento.getAnyosAntiguedad() < 
 	         monumentoMasActual.getAnyosAntiguedad()) {
 	        	 monumentoMasActual = monumento;
	        	 }
 	        }
 	    }
 		
 		System.out.println("\nTotal Visitantes: "+cantidadVisitante);
 		System.out.println("Media Visitante de todos lo Monumento: "+mediaVisitanteTodosMonumentos+"%");
 		System.out.println("Monumento Menos Visitado: "+monumentoMenosVisitado.getNombre());
 		System.out.println("Monumento Mas Visitado: "+monumentoMasVisitado.getNombre());
 		System.out.println("Monumento Mas Antiguo: "+monumentoMasAntiguo.getNombre());
 		System.out.println("Monumento Mas Actual: "+monumentoMasActual.getNombre());
 	}
}
