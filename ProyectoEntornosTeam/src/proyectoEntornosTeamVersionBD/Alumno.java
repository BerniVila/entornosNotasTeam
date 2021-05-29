package proyectoEntornosTeamVersionBD;
/**
 *   <h2> Clase Alumno </h2>
 * Esta clase contiene los datos de alumno y sus notas.
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */

import java.sql.SQLException;
import java.util.ArrayList;

public class Alumno {
	ConexionDB conexion;
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
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Alumno(String nia, String nombre, String apellido) throws ClassNotFoundException, SQLException {
		conexion = new ConexionDB();
		setNia(nia);
		setNombre(nombre);
		setApellido(apellido);
	}
	
//	/**
//	 * 
//	 * @param nia Indica el Número Identificador del Alumno (NIA)
//	 * @param nombre Indica el nombre del alumno
//	 * @param apellido Indica el apellido del alumno
//	 * @param examenes Es la lista de todos los examenes del alumno
//	 * @param trabajos Es la lista de todos los trabajos del alumno
//	 * @throws Exception 
//	 */
//	public Alumno(String nia, String nombre, String apellido, ArrayList<Examen> examenes, ArrayList<TrabajoClase> trabajos) throws Exception {
//		this(nia, nombre, apellido);
//		conexion = new ConexionDB();
//		setExamenes(examenes);
//		setTrabajos(trabajos);
//	}
	
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
	 * @throws Exception 
	 * @throws SinPorcentajeExcepcion 
	 * @throws SQLException 
	 */
	public void addExamenes(Examen ... examenes) throws Exception {
		try {
			for (Examen e:examenes) {
				this.examenes.add(e); 
				if (e instanceof ExamenClasico) 
					conexion.anyadirExamenClasico(this, (ExamenClasico)e);
				else if (e instanceof ExamenTest)
					conexion.anyadirExamenTest(this, (ExamenTest)e);
			}
		}
		catch (Exception e) {
			throw e;
		}
	}
	public void addExamenesBD(Examen ... examenes) throws Exception {
		try {
			for (Examen e:examenes) {
				this.examenes.add(e);
			}
		}
		catch (Exception e) {
			throw e;
		}
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
	 * @throws SQLException 
	 */
	public void addTrabajos(TrabajoClase ... trabajos) throws Exception {
		try {
			for (TrabajoClase t:trabajos) {
				this.trabajos.add(t);
				conexion.anyadirTrabajo(this, t);
			}
		}
		catch (Exception e) {
			throw e;
		}
	}
	public void addTrabajosBD(TrabajoClase ... trabajos) throws Exception {
		try {
			for (TrabajoClase t:trabajos) {
				this.trabajos.add(t);
			}
		}
		catch (Exception e) {
			throw e;
		}
	}
	
	/**
	 * 
	 * @param examenes Es la lista de todos los examenes del alumno
	 * @throws Exception 
	 */
	public void setExamenes(ArrayList<Examen> examenes) throws Exception {
		for (Examen e:examenes)
			addExamenes(e);
	}
	
	/**
	 * 
	 * @param trabajos Es la lista de todos los trabajos del alumno
	 * @throws Exception 
	 */
	public void setTrabajos(ArrayList<TrabajoClase> trabajos) throws Exception {
		for (TrabajoClase t:trabajos)
			addTrabajos(t);
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
		String txt = "Nombre: " + nombre + "  Apellido: " + apellido;
		for (int i = 0; i < examenes.size(); i++) {
			txt += "\nExamen-" + (i+1) + "  " + examenes.get(i).toString();
		}
		for (int i = 0; i < trabajos.size(); i++) {
			txt += "\nTrabajo-" + (i+1) + "  " + trabajos.get(i).toString();
		}
		return txt;
	}
	
	/**
	 * 
	 * @return Devuelve la nota global del alumno
	 * @throws SinPorcentajeExcepcion El porcentaje no está asignado
	 */
	public double calcNotaGlobal() throws SinPorcentajeExcepcion, porcentajeInvalidoExcepcion {
		double porcentaje = 0;
		double notaGlobal = 0;
		for (int i = 0; i < examenes.size(); i++) {
			notaGlobal += examenes.get(i).getNota();
			porcentaje += examenes.get(i).getPorcentaje();
		}
		for (int i = 0; i < trabajos.size(); i++) {
			notaGlobal -= trabajos.get(i).getPuntosPenalizacion();
			if (!trabajos.get(i).isEntregado())
				return 3.0;
		}
		if (porcentaje != 1) throw new porcentajeInvalidoExcepcion("El porcentaje total de es invalido: " + (porcentaje*100) + "%");
		return (Math.round(notaGlobal * 100)) / 100.0;
	}
}
