package proyectoEntornosTeamSinExcepcion;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculaNotaGlobal {

	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) throws SinPorcentajeExcepcion {

		Grupo daw = new Grupo();
		daw.getListaAlumnos()
				.add(new Alumno("1", new ExamenClasico(0.1, 10), new ExamenClasico(0.2, 10), new ExamenClasico(0.2, 10),
						new ExamenTest(0.25, 30, 0), new ExamenTest(0.25, 30, 0), new TrabajoClase(0),
						new TrabajoClase(0), new TrabajoClase(0)));
		daw.getListaAlumnos()
				.add(new Alumno("2", new ExamenClasico(0.1, 5.5), new ExamenClasico(0.2, 4),
						new ExamenClasico(0.2, 6.2), new ExamenTest(0.25, 15, 10), new ExamenTest(0.25, 20, 3),
						new TrabajoClase(1), new TrabajoClase(0), new TrabajoClase(2)));
		daw.getListaAlumnos()
				.add(new Alumno("3", new ExamenClasico(0.1, 7.6), new ExamenClasico(0.2, 8),
						new ExamenClasico(0.2, 8.5), new ExamenTest(0.25, 25, 4), new ExamenTest(0.25, 26, 4),
						new TrabajoClase(0), new TrabajoClase(1), new TrabajoClase(0)));
		daw.getListaAlumnos()
				.add(new Alumno("4", new ExamenClasico(0.1, 4.5), new ExamenClasico(0.2, 5),
						new ExamenClasico(0.2, 5.6), new ExamenTest(0.25, 17, 3), new ExamenTest(0.25, 12, 8),
						new TrabajoClase(4), new TrabajoClase(1), new TrabajoClase(3)));
		daw.getListaAlumnos()
				.add(new Alumno("5", new ExamenClasico(0.1, 9), new ExamenClasico(0.2, 8.75),
						new ExamenClasico(0.2, 9.25), new ExamenTest(0.25, 27, 1), new ExamenTest(0.25, 29, 1),
						new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)));
		daw.getListaAlumnos()
				.add(new Alumno("6", new ExamenClasico(0.1, 6), new ExamenClasico(0.2, 5.5), new ExamenClasico(0.2, 5),
						new ExamenTest(0.25, 20, 10), new ExamenTest(0.25, 19, 8), new TrabajoClase(2),
						new TrabajoClase(1), new TrabajoClase(7)));
		daw.getListaAlumnos()
				.add(new Alumno("7", new ExamenClasico(0.1, 8), new ExamenClasico(0.2, 7.5),
						new ExamenClasico(0.2, 8.5), new ExamenTest(0.25, 28, 0), new ExamenTest(0.25, 26, 2),
						new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(1)));
		daw.getListaAlumnos()
				.add(new Alumno("8", new ExamenClasico(0.1, 7.8), new ExamenClasico(0.2, 7),
						new ExamenClasico(0.2, 8.9), new ExamenTest(0.25, 25, 1), new ExamenTest(0.25, 27, 3),
						new TrabajoClase(1), new TrabajoClase(1), new TrabajoClase(0)));
		daw.getListaAlumnos()
				.add(new Alumno("9", new ExamenClasico(0.1, 2.5), new ExamenClasico(0.2, 4),
						new ExamenClasico(0.2, 5.5), new ExamenTest(0.25, 10, 15), new ExamenTest(0.25, 20, 8),
						new TrabajoClase(4), new TrabajoClase(2), new TrabajoClase(3)));
		daw.getListaAlumnos()
				.add(new Alumno("10", new ExamenClasico(0.1, 9.5), new ExamenClasico(0.2, 10),
						new ExamenClasico(0.2, 8.9), new ExamenTest(0.25, 28, 2), new ExamenTest(0.25, 30, 0),
						new TrabajoClase(0), new TrabajoClase(0), new TrabajoClase(0)));
		System.out.println("Bienvenido/a al calculador de notas del Juan de Garay");
		boolean recargar;
		do {
			recargar = false;
			System.out.println("Introduce tu NIA y pulsa Enter por favor");
			String nia = tec.nextLine();
			System.out.println(daw.getNotaAlumno(nia));
			System.out.println("¿Quieres consultar con otra NIA?(s/n)");
			if (tec.next().compareTo("s") == 0) recargar = true;
			tec.nextLine();
		}while (recargar);
		
	}
}
