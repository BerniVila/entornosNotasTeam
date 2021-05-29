package proyectoEntornosTeamVersionBD;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CalculaNotaGlobal {

	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		try {
		ConexionDB conexion = new ConexionDB();
		ArrayList<Grupo> grupos = conexion.leerBD();
		Grupo daw = grupos.get(0);
			
			System.out.println("Bienvenido/a al calculador de notas del Juan de Garay");
			boolean recargar;
			do {
				recargar = false;
				System.out.println("Introduzca su NIA (Número de Identificación del Alumnado) y pulse Enter por favor");
				String nia = tec.nextLine();
				System.out.println(daw.getNotaAlumno(nia));
				System.out.println("¿Quiere consultar con otro NIA?(s/n)");
				if (tec.next().compareTo("s") == 0)
					recargar = true;
				tec.nextLine();
			} while (recargar);
			System.out.println("Gracias por usar nuestro servicio, vuelva cuando desee para consultar otras notas");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
