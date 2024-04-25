package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestorMonumentos {
	static Scanner input = new Scanner(System.in);
	private ArrayList<Monumento> listaMonumentos;
	private ArrayList<Arquitecto> listaArquitectos;
	private ArrayList<Estilo> listaEstilos;

	/**
	 * Constructor de la clase GestorMonumentos
	 */
	public GestorMonumentos() {
		listaMonumentos = new ArrayList<Monumento>();
		listaArquitectos = new ArrayList<Arquitecto>();
		listaEstilos = new ArrayList<Estilo>();

	}

	/**
	 * Da de alta un nuevo monumento en la lista de monumentos
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
	 * 
	 */
	public void altaMonumento(String nombre, String ubicacion, String material, boolean disponible,
			int cantidadVisitantes, int anyosAntiguedad, Estilo estilo, Arquitecto arquitecto) {
		Monumento monumento = new Monumento(nombre);
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

	/**
	 * Metodo que da de alta un Arquitecto en la lista de los Arquitectos
	 * 
	 * @param nombre          Nombre del arquitecto
	 * @param fechaNacimiento Fecha de nacimiento del arquitecto
	 * @param estilo          Estilo arquitectonico del Arquitecto
	 */

	public void altaArquitecto(String nombre, String fechaNacimiento, Estilo estilo) {
		Arquitecto arquitecto = new Arquitecto();
		arquitecto.setNombre(nombre);
		arquitecto.setFechaNacimiento(LocalDate.parse(fechaNacimiento));
		arquitecto.setEstilo(estilo);
		listaArquitectos.add(arquitecto);
	}

	/**
	 * Metodo que da de alta un MonumentoArqueologico en la lista de Monumentos
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
	 */
	public void altaMonumentoArqueologico(String nombre, String ubicacion, String material, boolean disponible,
			int cantidadVisitantes, int anyosAntiguedad, String dimensiones, String civilizacion,
			String periodoHistorico, Estilo estilo, Arquitecto arquitecto) {
		MonumentoArqueologico monumentoArqueologico = new MonumentoArqueologico(nombre, ubicacion, material, disponible,
				cantidadVisitantes, anyosAntiguedad, dimensiones, civilizacion, periodoHistorico, estilo, arquitecto);
		listaMonumentos.add(monumentoArqueologico);
	}

	/**
	 * Metodo que da de al un MonumentoHistorico en las lista de los Monumentos
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
	public void altaMonumentoHistorico(String nombre, String ubicacion, String material, boolean disponible,
			int cantidadVisitantes, int anyosAntiguedad, String estadoConservacion, boolean patrimonioHumanidad,
			String uso, Estilo estilo, Arquitecto arquitecto) {
		MonumentoHistorico monumentoHistorico = new MonumentoHistorico(nombre, ubicacion, material, disponible,
				cantidadVisitantes, anyosAntiguedad, estadoConservacion, patrimonioHumanidad, uso, estilo, arquitecto);
		listaMonumentos.add(monumentoHistorico);
		// lo listo
	}

	/**
	 * Metodo que da de alta un Santuario en la lista de los Monumentos
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
	 */
	public void altaSantuario(String nombre, String ubicacion, String material, boolean disponible,
			int cantidadVisitantes, int anyosAntiguedad, String religion, String entorno, String tipo, Estilo estilo,
			Arquitecto arquitecto) {
		Santuario santuario = new Santuario(nombre, ubicacion, material, disponible, cantidadVisitantes,
				anyosAntiguedad, religion, entorno, tipo, estilo, arquitecto);
		listaMonumentos.add(santuario);
	}

	/**
	 * Metodo que da de alta un Estilo en la lista de los Estilos
	 * 
	 * @param nombre     Nombre del estilo arquitectonico
	 * @param paisOrigen Pais de origen de estilo arquitectonico
	 */
	public void altaEstilo(String nombre, String paisOrigen) {
		if (!existeEstilo(nombre)) {
			Estilo estilo = new Estilo(nombre, paisOrigen);
			listaEstilos.add(estilo);
		}
	}

	/**
	 * Metodo que comprueba si un estilo exite
	 * 
	 * @param nombreEstilo Nombre del estilo ha comprobar
	 * 
	 */
	public boolean existeEstilo(String nombreEstilo) {
		for (Estilo estilo : listaEstilos) {
			if (estilo != null && estilo.getNombre().equalsIgnoreCase(nombreEstilo)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que lista todos los Monumentos de la lista de Monumentos
	 */
	public void listarTodoMonumentos() {
		for (Monumento monumento : listaMonumentos) {
			if (monumento != null) {
				System.out.println(monumento);
			}
		}
	}

	/**
	 * Metodo que lista el tipo de Monumento elegido por el usuario
	 */
	public void listarMonumentos() {
		String opcionListar = "";

		do {
			System.out.println("\n¿Cual Quieres Listar?");
			System.out.println(" Historico");
			System.out.println(" Arqueologico");
			System.out.println(" Santuario");
			System.out.println(" Todo");
			System.out.println(" Salir");
			System.out.print("Opcion: ");
			opcionListar = input.nextLine();

			for (Monumento monumento : listaMonumentos) {
				if (opcionListar.equalsIgnoreCase("Todo") && monumento instanceof Monumento) {
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

	/**
	 * Metodo que lista a los Arquitectos de la lista de Arquitectos
	 */

	public void listarArquitectos() {
		for (int i = 0; i < listaArquitectos.size(); i++) {
			if (listaArquitectos != null) {
				System.out.println(listaArquitectos.get(i));
			}
		}
	}

	/**
	 * Metodo que lista a los Estilos de la lista de Estilo
	 */

	public void listarEstilos() {
		for (Estilo estilo : listaEstilos) {
			if (estilo != null) {
				System.out.println(estilo);
			}
		}
	}

	/**
	 * Metodo que lista un estilo por un atributo dado por el usuario
	 * 
	 * @param estilo Un estilo de la clase Estilo
	 */

	public void listarMonumentoPorAtributo(Estilo estilo) {
		for (Monumento monumento : listaMonumentos) {
			if (monumento.getEstilo() != null
					&& monumento.getEstilo().getNombre().equalsIgnoreCase(estilo.getNombre())) {
				System.out.println(monumento);
			}
		}
	}

	/**
	 * Metodo que busca un Monumento a partir de su nombre
	 * 
	 * @param nombreMonumento Nombre del Monumento a buscar
	 */
	public Monumento buscarMonumento(String nombreMonumento) {
		for (Monumento monumento : listaMonumentos) {
			if (monumento != null && monumento.getNombre().equalsIgnoreCase(nombreMonumento)) {
				return monumento;
			}
		}
		return null;
	}

	/**
	 * Metodo que busca un Estilo a partir de su nombre
	 * 
	 * @param nombreEstilo Nombre del Estilo a buscar
	 */
	public Estilo buscarEstilo(String nombreEstilo) {
		for (Estilo estilo : listaEstilos) {
			if (estilo != null && estilo.getNombre().equalsIgnoreCase(nombreEstilo)) {
				return estilo;
			}
		}
		return null;
	}

	/**
	 * Metodo que busca un Arquitecto a partir de su nombre
	 * 
	 * @param nombreArquitecto Nombre del Arquitecto a buscar
	 */
	public Arquitecto buscarArquitecto(String nombreArquitecto) {
		for (Arquitecto arquitecto : listaArquitectos) {
			if (arquitecto != null && arquitecto.getNombre().equalsIgnoreCase(nombreArquitecto)) {
				return arquitecto;
			}
		}
		return null;
	}

	/**
	 * Metodo que le asigna un EstiloAquitectonico a un Monumento
	 * 
	 * @param nombreEstilo    Nombre del estilo que se va a asignar
	 * @param nombreMonumento Nombre del Monumento al que se le asignara ese Estilo
	 */
	public void asignarEstiloMonumento(String nombreEstilo, String nombreMonumento) {
		if (buscarMonumento(nombreMonumento) != null && buscarEstilo(nombreEstilo) != null) {
			Monumento monumento = buscarMonumento(nombreMonumento);
			Estilo estilo = buscarEstilo(nombreEstilo);
			monumento.setEstilo(estilo);
		}
	}

	/**
	 * Metodo que le asigna un Arquitecto (autor) a un Monumento
	 * 
	 * @param nombreArquitecto Nombre del Arquitecto que se va a asignar
	 * @param nombreMonumento  Nombre del Monumento al que se le asignara ese
	 *                         Arquitecto
	 */
	public void asignarArquitectoMonumento(String nombreArquitecto, String nombreMonumento) {
		if (buscarMonumento(nombreMonumento) != null && buscarArquitecto(nombreArquitecto) != null) {
			Monumento monumento = buscarMonumento(nombreMonumento);
			Arquitecto arquitecto = buscarArquitecto(nombreArquitecto);
			monumento.setArquitecto(arquitecto);
		}
	}

	/**
	 * Metodo que le asigna un Estilo a un Arquitecto
	 * 
	 * @param nombreEstilo     Nombre del Estilo al que se va asignar
	 * @param nombreArquitecto Nombre del Arquitecto al que se le dara ese Estilo
	 */
	public void asignarEstiloArquitecto(String nombreArquitecto, String nombreEstilo) {
		if (buscarArquitecto(nombreArquitecto) != null && buscarEstilo(nombreEstilo) != null) {
			Arquitecto arquitecto = buscarArquitecto(nombreArquitecto);
			Estilo estilo = buscarEstilo(nombreEstilo);
			arquitecto.setEstilo(estilo);
		}
	}

	/**
	 * Metodo que elimina un Monumento a partir de su nombre
	 * 
	 * @param nombreMonumento Nombre del Monumento a eliminar
	 */
	public void eliminarMonumento(String nombreMonumento) {
		Iterator<Monumento> iterador = listaMonumentos.iterator();
		while (iterador.hasNext()) {
			Monumento monumento = iterador.next();
			if (monumento.getNombre().equalsIgnoreCase(nombreMonumento)) {
				iterador.remove();
			}
		}
	}

	/**
	 * Metodo que elimina un Estilo a partir de su nombre
	 * 
	 * @param nombreEstilo Nombre del Estilo a eliminar
	 */
	public void eliminarEstilo(String nombreEstilo) {
		Iterator<Estilo> iterador = listaEstilos.iterator();
		while (iterador.hasNext()) {
			Estilo estilo = iterador.next();
			if (estilo.getNombre().equalsIgnoreCase(nombreEstilo)) {
				iterador.remove();
			}
		}
	}

	/**
	 * Metodo que elimina un Arquitecto a partir de su nombre
	 * 
	 * @param nombreArquitecto Nombre del Arquitecto a eliminar
	 */
	public void eliminarArquitecto(String nombreArquitecto) {
		Iterator<Arquitecto> iterador = listaArquitectos.iterator();
		while (iterador.hasNext()) {
			Arquitecto arquitecto = iterador.next();
			if (arquitecto.getNombre().equalsIgnoreCase(nombreArquitecto)) {
				iterador.remove();
			}
		}
	}

	/**
	 * Metodo que calcula las caracteristicas de cada tipo de Monumento
	 * 
	 * @param totalVisitantesTipoSeleccionado Cantidad de visitantes del tipo de
	 *                                        Monumento selecionado
	 * @param totalMonumentos                 Suma total de todos los Monumentos
	 * @param opcionConsultar                 Opcion elegida de los tipos de
	 *                                        Monumentos
	 * @param mediaVisitantes                 La media de visitantes por el tipo de
	 *                                        Monumento seleccionado
	 */
	public void estadisticasPorTipoMonumento() {
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
				if (monumento != null) {
					totalMonumentos++;
					if ((opcionConsultar == 1 && monumento instanceof Monumento)
							|| (opcionConsultar == 2 && monumento instanceof MonumentoHistorico)
							|| (opcionConsultar == 3 && monumento instanceof MonumentoArqueologico)
							|| (opcionConsultar == 4 && monumento instanceof Santuario)) {
						totalVisitantesTipoSeleccionado += monumento.getCantidadVisitantes();
					}
				}
			}
			double mediaVisitantes = totalVisitantesTipoSeleccionado / totalMonumentos;
			System.out.println(
					"\nCantidad de visitantes del tipo de monumento seleccionado: " + totalVisitantesTipoSeleccionado);
			System.out.println("Media de visitantes del Monumento: " + mediaVisitantes + "%");
		} while (opcionConsultar != 5);

	}

	/**
	 * Metodo que calcula estadisticas generales entre los Monumentos
	 * 
	 * @param cantidadVisitante             Cantidad total de visitantes de todos
	 *                                      los Monumentos
	 * @param cantidadMonumento             Cantidad total de Monumentos
	 * @param monumentoMasVisitado          El Monumento con mas visitantes
	 * @param monumentoMenosVisitado        El Monumento menos visitado
	 * @param monumentoMasAntiguo           El monumento con el año de antiguedad
	 *                                      mas alta
	 * @param monumentoMasActual            El monumento con el año de antiguedad
	 *                                      mas bajo
	 * @param mediaVisitanteTodosMonumentos Media de habitantes de todos los
	 *                                      Monumentos
	 */

	public void estadisticasGenerales() {
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
				mediaVisitanteTodosMonumentos = cantidadVisitante / cantidadMonumento;

				if (monumentoMasVisitado == null
						|| monumento.getCantidadVisitantes() > monumentoMasVisitado.getCantidadVisitantes()) {
					monumentoMasVisitado = monumento;
				}

				if (monumentoMenosVisitado == null
						|| monumento.getCantidadVisitantes() < monumentoMenosVisitado.getCantidadVisitantes()) {
					monumentoMenosVisitado = monumento;
				}

				if (monumentoMasAntiguo == null
						|| monumento.getAnyosAntiguedad() > monumentoMasAntiguo.getAnyosAntiguedad()) {
					monumentoMasAntiguo = monumento;
				}

				if (monumentoMasActual == null
						|| monumento.getAnyosAntiguedad() < monumentoMasActual.getAnyosAntiguedad()) {
					monumentoMasActual = monumento;
				}
			}
		}

		System.out.println("\nTotal Visitantes: " + cantidadVisitante);
		System.out.println("Total Monumentos: " + cantidadMonumento);

		System.out.println("Media Visitante de todos los Monumentos: " + mediaVisitanteTodosMonumentos + "%");
		System.out.println("Monumento Menos Visitado: " + monumentoMenosVisitado.getNombre());
		System.out.println("Monumento Mas Visitado: " + monumentoMasVisitado.getNombre());

		System.out.println("Monumento Mas Antiguo: " + monumentoMasAntiguo.getNombre());
		System.out.println("Monumento Mas Actual: " + monumentoMasActual.getNombre());
	}
}
