package proyectoEntornosTeamVersionBD;

import java.sql.SQLException;
import java.util.ArrayList;


/**
 * <h2>Clase Grupo</h2> Esta clase representa una lista de alumnos
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */
public class Grupo {
	ConexionDB conexion;
	
	/**
	 * Atributo listaAlumnos
	 * 
	 * Arraylist que contiene los datos de clase Alumno
	 */
	private String nombreGrupo;
	
	
	/**
	 * Atributo listaAlumnos
	 * 
	 * Arraylist que contiene los datos de clase Alumno
	 */
	private ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
	
	public Grupo() {};
	public Grupo(String nombre) throws Exception {
		conexion = new ConexionDB();
		this.nombreGrupo = nombre;

		ArrayList<Grupo> grupos = conexion.leerBD();
		for (Grupo g:grupos) {
			if (g.getNombreGrupo().compareTo(nombre) == 0) {
				throw new grupoDuplicadoExcepcion("Ya existe el grupo " + nombre);
			}
		}
		conexion.crearGrupo(this); 
	}
	
	
	public String getNombreGrupo() {
		return nombreGrupo;
	}




	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public void cambiarNombreGrupo(String nombreGrupo) throws SQLException {
		this.nombreGrupo = nombreGrupo;
		conexion.cambiarNombreGrupo(this, nombreGrupo);
	}

	/**
	 * 
	 * @param alumno Clase alumno <<<<<<< HEAD
	 * @return Devuelve true si la NIA no esta repetido y a�ade el alumno a la lista
	 *         y false si la NIA ya existe
	 * @throws niaRepetidoExcepcion La NIA es �nica =======
	 * @return Devuelve true si el NIA(Número Identificador del Alumno) no está
	 *         repetido y añade el alumno a la lista y false si el NIA ya existe
	 * @throws Exception 
	 * @throws niaRepetidoExcepcion El NIA es único >>>>>>> branch 'master' of
	 *                              https://github.com/BerniVila/entornosNotasTeam.git
	 * @throws SQLException 
	 */
	public boolean addAlumno(Alumno alumno) throws Exception {
		try {
		if (ckNiaRepetido(alumno.getNia()))
			return false;
		else
			listaAlumnos.add(alumno);
			conexion.crearAlumno(alumno, this);
		return true; 
		}
		catch (Exception e) {
			throw e;
		}
	}
	public boolean addAlumnoBD(Alumno alumno) throws Exception {
		try {
			if (ckNiaRepetido(alumno.getNia()))
				return false;
			else
				listaAlumnos.add(alumno);
			return true; 
			}
			catch (Exception e) {
				throw e;
			}
	}

	/**
	 * 
	 * @param nia NIA del alumno
	 * @return Devuelve la nota global del alumno para un NIA dado
	 * @throws SinPorcentajeExcepcion El porcentaje no está asignado
	 * @throws porcentajeInvalidoExcepcion 
	 */
	public String getNotaAlumno(String nia) throws SinPorcentajeExcepcion, porcentajeInvalidoExcepcion {
		for (Alumno alumno : listaAlumnos) {
			if (nia.compareTo(alumno.getNia()) == 0) {
				return ("La nota del alumno con NIA número " + nia + " es: " + alumno.calcNotaGlobal());
			}
		}
		return "Ese NIA no existe en nuestra base de datos, pruebe otra vez con un valor del 1 al 10";

	}

	/**
	 * 
	 * <<<<<<< HEAD
	 * 
	 * @param nia La NIA del alumno
	 * @return Devuelve true si la NIA ya existe en la list y false si no existe
	 * @throws niaRepetidoExcepcion La NIA es �nica =======
	 * @param nia El NIA del alumno
	 * @return Devuelve true si el NIA ya existe en el grupo y false si no existe
	 * @throws niaRepetidoExcepcion El NIA es único >>>>>>> branch 'master' of
	 *                              https://github.com/BerniVila/entornosNotasTeam.git
	 */
	private boolean ckNiaRepetido(String nia) throws niaRepetidoExcepcion {
		try {
			for (int i = 0; i < listaAlumnos.size(); i++) {
				for (int j = i + 1; j < listaAlumnos.size(); j++) {
					if (listaAlumnos.get(i).getNia().compareTo(listaAlumnos.get(j).getNia()) == 0)
						throw new niaRepetidoExcepcion("Esta NIA ya existe");
				}
			}
			return false;
		} catch (niaRepetidoExcepcion e) {
			return true;
		}
	}

	/**
	 * 
	 * <<<<<<< HEAD
	 * 
	 * @return Devuelve una copia de la lista, asi nos permite modificar la lista con
	 *         los m�todos de ArrayList =======
	 * @return Devuelve una copia de la lista, asi nos permite modificar la lista con
	 *         los métodos de ArrayList >>>>>>> branch 'master' of
	 *         https://github.com/BerniVila/entornosNotasTeam.git
	 */
	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
	
	

	@Override
	public String toString() {
		String txt = "";
		for (Alumno alumno : listaAlumnos) {
			txt += "\n" + alumno.toString();
		}
		return nombreGrupo + "\n" + txt;
	}




	
}