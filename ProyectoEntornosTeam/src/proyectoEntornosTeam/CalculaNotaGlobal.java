package proyectoEntornosTeam;

import java.util.ArrayList;
import java.util.Scanner;


public class CalculaNotaGlobal {
	
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno("1", 10, 10, 10, new ExamenTest(30, 0, 0), new ExamenTest(30, 0, 0), new TrabajoClase( 0), new TrabajoClase( 0), new TrabajoClase( 0)));
		listaAlumnos.add(new Alumno("2", 5.5, 4, 6.2, new ExamenTest(15, 10, 5), new ExamenTest(20, 3, 7), new TrabajoClase( 1), new TrabajoClase( 0), new TrabajoClase( 2)));
		listaAlumnos.add(new Alumno("3", 7.6, 8, 8.5, new ExamenTest(25, 4, 1), new ExamenTest(26, 4, 0), new TrabajoClase( 0), new TrabajoClase( 1), new TrabajoClase( 0)));
		listaAlumnos.add(new Alumno("4", 4.5, 5, 5.6, new ExamenTest(17, 3, 10), new ExamenTest(12, 8, 10), new TrabajoClase( 4), new TrabajoClase( 1), new TrabajoClase( 3)));
		listaAlumnos.add(new Alumno("5", 9, 8.75, 9.25, new ExamenTest(27, 1, 2), new ExamenTest(29, 1, 0), new TrabajoClase( 0), new TrabajoClase( 0), new TrabajoClase( 0)));
		listaAlumnos.add(new Alumno("6", 6, 5.5, 5, new ExamenTest(20, 10, 0), new ExamenTest(19, 8, 3), new TrabajoClase( 2), new TrabajoClase( 1), new TrabajoClase( 7)));
		listaAlumnos.add(new Alumno("7", 8, 7.5, 8.5, new ExamenTest(28, 0, 2), new ExamenTest(26, 2, 2), new TrabajoClase( 0), new TrabajoClase( 0), new TrabajoClase( 1)));
		listaAlumnos.add(new Alumno("8", 7.8, 7, 8.9, new ExamenTest(25, 1, 4), new ExamenTest(27, 3, 0), new TrabajoClase( 1), new TrabajoClase( 1), new TrabajoClase( 0)));
		listaAlumnos.add(new Alumno("9", 2.5, 4, 5.5, new ExamenTest(10, 15, 5), new ExamenTest(20, 8, 2), new TrabajoClase( 4), new TrabajoClase( 2), new TrabajoClase( 3)));
		listaAlumnos.add(new Alumno("10", 9.5, 10, 8.9, new ExamenTest(28, 2, 0), new ExamenTest(30, 0, 0), new TrabajoClase( 0), new TrabajoClase( 0), new TrabajoClase( 0)));
		
		
		
		
		System.out.println("Bienvenido/a al calculador de notas del Juan de Garay");
		System.out.println("Introduce tu NIA y pulsa Enter por favor");
		String nia = tec.next();
		
		if (Integer.valueOf(nia) < 0 || Integer.valueOf(nia) > listaAlumnos.size()) {
			System.out.println("Ese NIA no existe en nuestra base de datos, prueba otra vez con un valor del 1 al 10");
		}else {
			for (int i = 0; i < listaAlumnos.size(); i++) {
				
				if (i + 1 == Integer.valueOf(nia)) {
					System.out.println("La nota del alumno con NIA número " + nia + " es: "
							+ listaAlumnos.get(i).calcNotaGlobal());
				}
			}
		}
	}
}
