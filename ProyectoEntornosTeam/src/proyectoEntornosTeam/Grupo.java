package proyectoEntornosTeam;

import java.util.ArrayList;

public class Grupo {
	ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	public String getNotaAlumno (String nia) throws SinPorcentajeExcepcion {
		for (Alumno alumno : listaAlumnos) {
			if (nia.compareTo(alumno.getNia()) == 0) {
				return ("La nota del alumno con NIA número " + nia + " es: "
						+ alumno.calcNotaGlobal());
			}
		}
		return "Ese NIA no existe en nuestra base de datos";
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
