package proyectoEntornosTeam;
/**
 *   <h2> Clase Alumno </h2>
 * Esta clase contiene los datos de alumno y sus notas.
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */

import java.util.ArrayList;

public class Alumno {

	/**
	 * Atributo nia
	 * Indica el Número Identificador del Alumno (NIA)
	 */
	private String nia;

	/**
	 * Atributo nombre
	 * Indica el nombre del alumno
	 */
	private String nombre;
	
	/**
	 * Atributo apellido
	 * Indica el apellido del alumno
	 */
	private String apellido;
	
	/**
	 * Atributo examenes
	 * Es la lista de todos los examenes del alumno
	 */
	private ArrayList<Examen> examenes = new ArrayList<Examen>();
	
	/**
	 * Atributo trabajos 
	 * Es la lista de todos los trabajos del alumno
	 */
	private ArrayList<TrabajoClase> trabajos = new ArrayList<TrabajoClase>();
	
	/**
	 * 
	 * @param nia Indica el Número Identificador del Alumno (NIA)
	 * @param nombre Indica el nombre del alumno
	 * @param apellido Indica el apellido del alumno
	 */
	public Alumno(String nia, String nombre, String apellido) {
		setNia(nia);
		setNombre(nombre);
		setApellido(apellido);
	}
	
	/**
	 * 
	 * @param nia Indica el Número Identificador del Alumno (NIA)
	 * @param nombre Indica el nombre del alumno
	 * @param apellido Indica el apellido del alumno
	 * @param examenes Es la lista de todos los examenes del alumno
	 * @param trabajos Es la lista de todos los trabajos del alumno
	 */
	public Alumno(String nia, String nombre, String apellido, ArrayList<Examen> examenes, ArrayList<TrabajoClase> trabajos) {
		this(nia, nombre, apellido);
		setExamenes(examenes);
		setTrabajos(trabajos);
	}
	
	/**
	 * 
	 * @return Devuelve el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Indica el nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Devuelve el apellido del alumno
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * 
	 * @param apellido Indica el apellido del alumno
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * 
	 * @return Devuelve la lista de los examenes del alumno
	 */
	public ArrayList<Examen> getExamenes() {
		return examenes;
	}
	
	/**
	 * 
	 * @param examenes Lista de examenes que quieres a�adir
	 */
	public void addExamenes(Examen ... examenes) {
		for (Examen e:examenes) 
			this.examenes.add(e);
	}

	/**
	 * 
	 * @return Devuelve la lista de los trabajos del alumno
	 */
	public ArrayList<TrabajoClase> getTrabajos() {
		return trabajos;
	}
	
	/**
	 * 
	 * @param trabajos Lista de trabajos que quieres a�adir
	 */
	public void addTrabajos(TrabajoClase ... trabajos) {
		for (TrabajoClase t:trabajos)
			this.trabajos.add(t);
	}
	
	/**
	 * 
	 * @param examenes Es la lista de todos los examenes del alumno
	 */
	public void setExamenes(ArrayList<Examen> examenes) {
		this.examenes = examenes;
	}
	
	/**
	 * 
	 * @param trabajos Es la lista de todos los trabajos del alumno
	 */
	public void setTrabajos(ArrayList<TrabajoClase> trabajos) {
		this.trabajos = trabajos;
	}

	/**
	 * Atributo notaGlobal
	 * Indica la nota global del alumno
	 */
	private double notaGlobal;
	
	/**
	 * 
	 * @return Devuelve el NIA(Número Identificador del Alumno) del alumno
	 */
	public String getNia() {
		return nia;
	}
	
	
	/**
	 * 
	 * @param nia NIA(Número Identificador del Alumno) del alumno
	 */
	public void setNia(String nia) {
		this.nia = nia;
	}

	
	@Override
	public String toString() {
		String txt = "Nombre:" + nombre + " Apellido: " + apellido;
		for (int i = 0; i < examenes.size(); i++) {
			txt += "\nExamen-" + i + "  " + examenes.get(i).toString();
		}
		for (int i = 0; i < trabajos.size(); i++) {
			txt += "\nTrabajo-" + i + "  " + trabajos.get(i).toString();
		}
		return txt;
	}
	
	/**
	 * 
	 * @return Devuelve la nota global del alumno
	 * @throws SinPorcentajeExcepcion El porcentaje no está asignado
	 */
	public double calcNotaGlobal() throws SinPorcentajeExcepcion {
		double notaGlobal = 0;
		for (int i = 0; i < examenes.size(); i++) {
			notaGlobal += examenes.get(i).getNota();
		}
		for (int i = 0; i < trabajos.size(); i++) {
			notaGlobal -= trabajos.get(i).getPuntosPenalizacion();
			if (!trabajos.get(i).isEntregado())
				return 3.0;
		}
		return (Math.round(notaGlobal * 100)) / 100.0;
	}
}
