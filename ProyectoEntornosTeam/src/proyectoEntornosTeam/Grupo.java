package proyectoEntornosTeam;

import java.util.ArrayList;
/**
 * <h1> Clase Grupo </h1>
 * Esta clase es la lista de alumnos
 * 
 * @author Bernardo,Zupan
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
	 * @return Devuelve true si la NIA no esta repetido y añade el alumno a la lista y false si la NIA ya existe
	 * @throws niaRepetidoExcepcion La NIA es única
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
	 * @return la nota global del alumno que contiene la NIA
	 * @throws SinPorcentajeExcepcion El porcentaje no esta asignado
	 */
	public String getNotaAlumno (String nia) throws SinPorcentajeExcepcion {
		for (Alumno alumno : listaAlumnos) {
			if (nia.compareTo(alumno.getNia()) == 0) {
				return ("La nota del alumno con NIA nÃºmero " + nia + " es: "
						+ alumno.calcNotaGlobal());
			}
		}
		return "Ese NIA no existe en nuestra base de datos";
	}
	
	/**
	 * 
	 * @param nia La NIA del alumno
	 * @return Devuelve true si la NIA ya existe en la list y false si no existe
	 * @throws niaRepetidoExcepcion La NIA es única
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
