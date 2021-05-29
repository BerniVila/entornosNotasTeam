package proyectoEntornosTeamVersionBD;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AsignarDatos {

	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Grupo daw = new Grupo("DAW", false);
		try {
			daw.addAlumno(new Alumno("1", "nombre1", "apellido1"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 10,"Primer examen clasico."),new ExamenClasico(0.2, 10,"Segundo examen clasico."),new ExamenClasico(0.2, 10,"Tercer examen clasico."), new ExamenTest(0.25, 30, 0, "Primer examen test"), new ExamenTest(0.25, 30, 0,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(0, "Trabajo1"), new TrabajoClase(0, "Trabajo2"), new TrabajoClase(0, "Trabajo3"));
			
			daw.addAlumno(new Alumno("2", "nombre2", "apellido2"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 5.5,"Primer examen clasico."), new ExamenClasico(0.2, 4,"Segundo examen clasico."),new ExamenClasico(0.2, 6.2,"Tercer examen clasico."), new ExamenTest(0.25, 15, 10, "Primer examen test"), new ExamenTest(0.25, 20, 3,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(1, "Trabajo1"), new TrabajoClase(0, "Trabajo2"), new TrabajoClase(2, "Trabajo3"));

			daw.addAlumno(new Alumno("3", "nombre3", "apellido3"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 7.6,"Primer examen clasico."), new ExamenClasico(0.2, 8,"Segundo examen clasico."),new ExamenClasico(0.2, 8.5,"Tercer examen clasico."), new ExamenTest(0.25, 25, 4, "Primer examen test"), new ExamenTest(0.25, 26, 4,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(0, "Trabajo1"), new TrabajoClase(1, "Trabajo2"), new TrabajoClase(0, "Trabajo3"));

			daw.addAlumno(new Alumno("4", "nombre4", "apellido4"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 4.5,"Primer examen clasico."), new ExamenClasico(0.2, 5,"Segundo examen clasico."),new ExamenClasico(0.2, 5.6,"Tercer examen clasico."), new ExamenTest(0.25, 17, 3, "Primer examen test"), new ExamenTest(0.25, 12, 8,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(4, "Trabajo1"), new TrabajoClase(1, "Trabajo2"), new TrabajoClase(3, "Trabajo3"));

			daw.addAlumno(new Alumno("5", "nombre5", "apellido5"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 9,"Primer examen clasico."), new ExamenClasico(0.2, 8.75,"Segundo examen clasico."),new ExamenClasico(0.2, 9.25,"Tercer examen clasico."), new ExamenTest(0.25, 27, 1, "Primer examen test"), new ExamenTest(0.25, 29, 1,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(0, "Trabajo1"), new TrabajoClase(0, "Trabajo2"), new TrabajoClase(0, "Trabajo3"));

			daw.addAlumno(new Alumno("6", "nombre6", "apellido6"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 6,"Primer examen clasico."), new ExamenClasico(0.2, 5.5,"Segundo examen clasico."),new ExamenClasico(0.2, 5,"Tercer examen clasico."), new ExamenTest(0.25, 20, 10, "Primer examen test"), new ExamenTest(0.25, 19, 8,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(2, "Trabajo1"), new TrabajoClase(1, "Trabajo2"), new TrabajoClase(7, "Trabajo3"));

			daw.addAlumno(new Alumno("7", "nombre7", "apellido7"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 8,"Primer examen clasico."), new ExamenClasico(0.2, 7.5,"Segundo examen clasico."),new ExamenClasico(0.2, 8.5,"Tercer examen clasico."), new ExamenTest(0.25, 28, 0, "Primer examen test"), new ExamenTest(0.25, 26, 2,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(0, "Trabajo1"), new TrabajoClase(0, "Trabajo2"), new TrabajoClase(1, "Trabajo3"));

			daw.addAlumno(new Alumno("8", "nombre8", "apellido8"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 7.8,"Primer examen clasico."), new ExamenClasico(0.2, 7,"Segundo examen clasico."),new ExamenClasico(0.2, 8.9,"Tercer examen clasico."), new ExamenTest(0.25, 25, 1, "Primer examen test"), new ExamenTest(0.25, 27, 3,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(1, "Trabajo1"), new TrabajoClase(1, "Trabajo2"), new TrabajoClase(0, "Trabajo3"));

			daw.addAlumno(new Alumno("9", "nombre9", "apellido9"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 2.5,"Primer examen clasico."), new ExamenClasico(0.2, 4,"Segundo examen clasico."),new ExamenClasico(0.2, 5.5,"Tercer examen clasico."), new ExamenTest(0.25, 10, 15, "Primer examen test"), new ExamenTest(0.25, 20, 8,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(4, "Trabajo1"), new TrabajoClase(2, "Trabajo2"), new TrabajoClase(3, "Trabajo3"));

			daw.addAlumno(new Alumno("10", "nombre10", "apellido10"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addExamenes(
					new ExamenClasico(0.1, 9.5,"Primer examen clasico."), new ExamenClasico(0.2, 10,"Segundo examen clasico."),new ExamenClasico(0.2, 8.9,"Tercer examen clasico."), new ExamenTest(0.25, 28, 2, "Primer examen test"), new ExamenTest(0.25, 30, 0,"Segundo examen test"));
			daw.getListaAlumnos().get(daw.getListaAlumnos().size()-1).addTrabajos(
					new TrabajoClase(0, "Trabajo1"), new TrabajoClase(0, "Trabajo2"), new TrabajoClase(0, "Trabajo3"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
