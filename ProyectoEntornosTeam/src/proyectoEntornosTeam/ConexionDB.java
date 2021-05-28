package proyectoEntornosTeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
	private String url = "jdbc:mysql://localhost:3306/calculadoranotasentornos";
	private String user = "root";
	private String password = "administrador";
	private Connection connect;
	private Statement statement;
	public ConexionDB() throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(url, user, password);
			statement = connect.createStatement();
	};
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, notaInvalidoExamenTestExcepcion, SinPorcentajeExcepcion, notaInvalidoExamenClasicoExcepcion {
		ConexionDB cd = new ConexionDB();  
//		cd.crearGrupo("DAW");
//		cd.crearAlumno("1", "n1", "a1", "DAW");
//		cd.anyadirExamenClasico("1", 0.5 ,"ex1",10 );
//		cd.anyadirExamenTest("1", 0.5,"ex2" , 20, 10);
//		Grupo g = new Grupo("DAM");
//		Alumno al = new Alumno("2", "n2", "a2");
//		ExamenClasico ec = new ExamenClasico(0.1, 10, "ec1");
//		ExamenTest et = new ExamenTest(0.2, 30, 0, "et1");
//		TrabajoClase tc = new TrabajoClase(1,"tc");
//		cd.crearGrupo(g);
//		cd.crearAlumno(al, g);
//		cd.anyadirExamenClasico(al, ec);
//		cd.anyadirExamenTest(al, et);
//		cd.anyadirTrabajo(al, tc);
	}
//	public static void main(String[] args) throws Exception {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			String url = "jdbc:mysql://localhost:3306/calculadoranotasentornos";
//			String user = "root";
//			String password = "administrador";
//			Connection connect = DriverManager.getConnection(url, user, password);
//			Statement statement = connect.createStatement();
//
//		} catch (Exception e) {
//			throw e;
//		}
//	}

	public void crearGrupo(String nombreGrupo) throws SQLException {
		statement.execute("insert into Grupo values (\"" + nombreGrupo + "\")");
	}
	public void crearGrupo(Grupo g) throws SQLException {
		statement.execute("insert into Grupo values (\"" + g.getNombreGrupo() + "\")");
	}
	public void eliminarGrupo() {
		
	}
	
	public void crearAlumno(String nia, String nombre, String apellidos, String nombreGrupo) throws SQLException {
		statement.execute("insert into Alumno values (\"" + nia + "\",\"" + nombre + "\",\"" + apellidos + "\",\"" + nombreGrupo + "\")");
	}
	public void crearAlumno(Alumno al, Grupo g) throws SQLException {
		statement.execute("insert into Alumno values (\"" + al.getNia() + "\",\"" + al.getNombre() + "\",\"" + al.getApellido() + "\",\"" + g.getNombreGrupo() + "\")");
	}
	
	public void anyadirExamenClasico (String nia, double porcentaje, String descripcion, int nota) throws SQLException {
		statement.execute("insert into ExamenClasico values (\"" + porcentaje + "\",\"" + descripcion + "\",\"" + nota + "\",\"" + nia + "\")");
	}
	public void anyadirExamenClasico (Alumno al, ExamenClasico ec) throws SQLException, SinPorcentajeExcepcion {
		statement.execute("insert into ExamenClasico values (\"" + ec.getPorcentaje() + "\",\"" + ec.getDescripcion() + "\",\"" + ec.getNota() + "\",\"" + al.getNia() + "\")");
	}
	public void eliminarExamenClasico () {
		
	}
	
	public void anyadirExamenTest (String nia, double porcentaje, String descripcion, int aciertos, int fallos) throws SQLException {
		statement.execute("insert into ExamenTest values (\"" + porcentaje + "\",\"" + descripcion + "\",\"" + aciertos + "\",\"" + fallos + "\",\"" + nia + "\")");
	}
	public void anyadirExamenTest (Alumno al, ExamenTest et) throws SQLException {
		statement.execute("insert into ExamenTest values (\"" + et.getPorcentaje() + "\",\"" + et.getDescripcion() + "\",\"" + et.getNumAciertos() + "\",\"" + et.getNumFallos() + "\",\"" + al.getNia() + "\")");
	}
	public void eliminarExamenTest () {
		
	}
	
	public void anyadirTrabajo(String nia, int diasRestrasado, String descripcion) throws SQLException {
		statement.execute("insert into Trabajo values (\"" + diasRestrasado + "\",\"" + descripcion + "\",\"" + nia + "\")");
	}
	public void anyadirTrabajo(Alumno al, TrabajoClase tc) throws SQLException {
		statement.execute("insert into Trabajo values (\"" + tc.getDiasRetraso() + "\",\"" + tc.getDescripcion() + "\",\"" + al.getNia() + "\")");
	}
	public void eliminarTrajo() {
		
	}
	
}
