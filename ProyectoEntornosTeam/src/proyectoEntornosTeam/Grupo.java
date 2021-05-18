package proyectoEntornosTeam;

import java.util.ArrayList;
/**
 * <h2> Clase Grupo </h2>
 * Esta clase representa una lista de alumnos
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */
public class Grupo {
	/**
	 * Atributo listaAlumnos
	 * 
	 * Arraylist que contiene los datos de clase Alumno
	 */
	ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
	
	/**
	 * 
	 * @param alumno Clase alumno
	 * @return Devuelve true si el NIA(Número Identificador del Alumno) no está repetido y añade el alumno a la lista y false si el NIA ya existe
	 * @throws niaRepetidoExcepcion El NIA es único
	 */
	public boolean addAlumno(Alumno alumno) throws niaRepetidoExcepcion {
		if (ckNiaRepetido(alumno.getNia())) 
			return false;
		else 
			listaAlumnos.add(alumno);
		return true;
	}
	/**
	 * 
	 * @param nia NIA del alumno
	 * @return Devuelve la nota global del alumno para un NIA dado
	 * @throws SinPorcentajeExcepcion El porcentaje no está asignado
	 */
	public String getNotaAlumno (String nia) throws SinPorcentajeExcepcion {
		for (Alumno alumno : listaAlumnos) {
			if (nia.compareTo(alumno.getNia()) == 0) {
				return ("La nota del alumno con NIA número " + nia + " es: "
						+ alumno.calcNotaGlobal());
			}
		}
		return "Este NIA no existe en nuestra base de datos";
	}
	
	/**
	 * 
	 * @param nia El NIA del alumno
	 * @return Devuelve true si el NIA ya existe en el grupo y false si no existe
	 * @throws niaRepetidoExcepcion El NIA es único
	 */
	private boolean ckNiaRepetido (String nia) throws niaRepetidoExcepcion {
		try {
			for (int i=0; i < listaAlumnos.size(); i++) {
				for (int j=i+1; j < listaAlumnos.size(); j++) {
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
	 * @return Devuelve una copia de la lista, asi no permite motificar la lista con los métodos de ArrayList
	 */
	public ArrayList<Alumno> getListaAlumnos() {
		ArrayList<Alumno> cpListaAlumno = listaAlumnos;
		return cpListaAlumno;
	}
	@Override
	public String toString() {
		String txt = "";
		for (Alumno alumno : listaAlumnos) {
			txt += "/n" + alumno.toString();
		}
		return txt;
	}
}