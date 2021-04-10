package entornosNotasTeam;

import java.util.Scanner;

public class CalculaNotas {
	public static Scanner tec = new Scanner(System.in);
	public static double notaFinal(Alumno alumno) {
		if (superaRetrasoMaximoDelTrabajo(alumno) == false)
			return notaExNormal(alumno)+notaExTest(alumno)-penalizacionTrabajo(alumno);
		else 
			return 3;
	}
	public static double notaExNormal(Alumno alumno) {
		double nota1 = alumno.getExNormal()[0];
		double nota2 = alumno.getExNormal()[1];
		double nota3 = alumno.getExNormal()[2];
		return nota1*0.1 + nota2*0.2 + nota3*0.2;
	}
	public static double notaExTest(Alumno alumno) {
		double bien1 = alumno.getExTest()[0];
		double mal1 = alumno.getExTest()[2];
		double bien2 = alumno.getExTest()[1];
		double mal2 = alumno.getExTest()[3];
		
		return 0.5*(bien1-mal1/3+bien2-mal2/3)/6;
	}
	public static double penalizacionTrabajo(Alumno alumno) {
		int trabajo1 = alumno.getTrabajos()[0];
		int trabajo2 = alumno.getTrabajos()[1];
		int trabajo3 = alumno.getTrabajos()[2];
		
		return (trabajo1+trabajo2+trabajo3)*0.1;
	}
	public static boolean superaRetrasoMaximoDelTrabajo(Alumno alumno) {
		int trabajo1 = alumno.getTrabajos()[0];
		int trabajo2 = alumno.getTrabajos()[1];
		int trabajo3 = alumno.getTrabajos()[2];
		if (trabajo1 > 5 || trabajo2 > 5 || trabajo3 > 5)
			return true;
		else 
			return false;		
	}
	public static void main(String[] args) {
		Alumno[] alumnos = new Alumno[10];

		alumnos[0] = new Alumno(10.0, 10.0, 10.0, 30, 30, 0, 0, 0, 0, 0);
		alumnos[1]  = new Alumno(6.5, 7.0, 7.5, 28, 26, 0, 1, 0, 1, 0);
		alumnos[2]  = new Alumno(4.0, 5.5, 5.0, 16, 21, 9, 5, 2, 0, 0);
		alumnos[3]  = new Alumno(8.2, 9.0, 7.4, 23, 19, 3, 2, 0, 0, 0);
		alumnos[4]  = new Alumno(5.7, 6.0, 7.8, 20, 22, 4, 1, 0, 1, 0);
		alumnos[5]  = new Alumno(8.5, 9.2, 8.6, 26, 28, 2, 0, 0, 0, 0);
		alumnos[6]  = new Alumno(8.5, 7.5, 10.0, 27, 30, 1, 0, 0, 0, 0);
		alumnos[7]  = new Alumno(5.0, 6.7, 5.8, 15, 17, 6, 4, 2, 0, 4);
		alumnos[8]  = new Alumno(5.0, 0.0, 4.0, 12, 14, 10, 7, 1, 1, 0);
		alumnos[9]  = new Alumno(9.4, 8.6, 9.8, 27, 29, 0, 1, 0, 0, 6);
		System.out.println("Introduce tu número de identificador de alumno (disponibles del 1 al 10).");
		int num = tec.nextInt();
		System.out.println(notaFinal(alumnos[num-1]));
	}
}
