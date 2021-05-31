package proyectoEntornosTeamVersionBD;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JTextField;

import com.mysql.cj.xdevapi.Result;

public class ConexionDB {
	private String url = "jdbc:mysql://localhost:3306/calculadoranotasentornos";
	private String user = "root";
	private String password = "administrador";
	private Connection connect;
	private static Statement statement;
	public ConexionDB() throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(url, user, password);
			statement = connect.createStatement();
	};
	
	public static void main(String[] args) throws Exception {
//		ConexionDB cd = new ConexionDB();  
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
//		ArrayList<Grupo> g = cd.leerBD();
//		System.out.println(g.get(1).toString());
//		System.out.println(g.get(1).getNotaAlumno("1"));
		
	}

	public void crearGrupo(String nombreGrupo) throws SQLException {
		statement.execute("insert into Grupo values (\"" + nombreGrupo + "\")");
	}
	public void crearGrupo(Grupo g) throws SQLException {
		statement.execute("insert into Grupo values (\"" + g.getNombreGrupo() + "\")");
	}
	public void cambiarNombreGrupo(Grupo g,String nombreGrupo) throws SQLException {
		statement.execute("update grupo set nombregrupo = \"" + nombreGrupo + "\" where nombregrupo = \"" + g.getNombreGrupo() + "\";");
	}
	public void eliminarGrupo(String nombreGrupo) throws SQLException {
		statement.execute("delete from grupo where NombreGrupo = \"" + nombreGrupo + "\"");
	}
	public void eliminarGrupo(Grupo g) throws SQLException {
		statement.execute("delete from grupo where NombreGrupo = \"" + g.getNombreGrupo() + "\"");
	}
	
	public void crearAlumno(String nia, String nombre, String apellidos, String nombreGrupo) throws SQLException {
		statement.execute("insert into Alumno values (\"" + nia + "\",\"" + nombre + "\",\"" + apellidos + "\",\"" + nombreGrupo + "\")");
	}
	public void crearAlumno(Alumno al, Grupo g) throws SQLException {
		statement.execute("insert into Alumno values (\"" + al.getNia() + "\",\"" + al.getNombre() + "\",\"" + al.getApellido() + "\",\"" + g.getNombreGrupo() + "\")");
	}
	public void eliminarAlumno(String nia) throws SQLException {
		statement.execute("delete from alumno where NIA = \"" + nia + "\"");
	}
	public void eliminarAlumno(Alumno al) throws SQLException {
		statement.execute("delete from alumno where NIA = \"" + al.getNia() + "\"");
	}
	
	public void anyadirExamenClasico (String nia, double porcentaje, String descripcion, double nota) throws SQLException {
		statement.execute("insert into ExamenClasico values (\"" + porcentaje + "\",\"" + descripcion + "\",\"" + nota + "\",\"" + nia + "\")");
	}
	public void anyadirExamenClasico (Alumno al, ExamenClasico ec) throws SQLException, SinPorcentajeExcepcion {
		statement.execute("insert into ExamenClasico values (\"" + ec.getPorcentaje() + "\",\"" + ec.getDescripcion() + "\",\"" + ec.getNotaExamen() + "\",\"" + al.getNia() + "\")");
	}
	public void eliminarExamenClasico (String nia, String descripcion) throws SQLException {
		statement.execute("delete from ExamenClasico where (NIA = \""+ nia + "\") & (descripcion = \"" + descripcion + "\")");
	}
	public void eliminarExamenClasico (Alumno al, ExamenClasico ec) throws SQLException {
		statement.execute("delete from ExamenClasico where (NIA = \""+ al.getNia() + "\") & (descripcion = \"" + ec.getDescripcion() + "\")");
	}
	
	public void anyadirExamenTest (String nia, double porcentaje, String descripcion, int aciertos, int fallos) throws SQLException {
		statement.execute("insert into ExamenTest values (\"" + porcentaje + "\",\"" + descripcion + "\",\"" + aciertos + "\",\"" + fallos + "\",\"" + nia + "\")");
	}
	public void anyadirExamenTest (Alumno al, ExamenTest et) throws SQLException {
		statement.execute("insert into ExamenTest values (\"" + et.getPorcentaje() + "\",\"" + et.getDescripcion() + "\",\"" + et.getNumAciertos() + "\",\"" + et.getNumFallos() + "\",\"" + al.getNia() + "\")");
	}
	public void eliminarExamenTest (String nia, String descripcion) throws SQLException {
		statement.execute("delete from ExamenTest where (NIA = \""+ nia + "\") & (descripcion = \"" + descripcion + "\")");
	}
	public void eliminarExamenTest (Alumno al, ExamenTest et) throws SQLException {
		statement.execute("delete from ExamenTest where (NIA = \""+ al.getNia() + "\") & (descripcion = \"" + et.getDescripcion() + "\")");
	}
	
	public void anyadirTrabajo(String nia, int diasRestrasado, String descripcion) throws SQLException {
		statement.execute("insert into Trabajo values (\"" + diasRestrasado + "\",\"" + descripcion + "\",\"" + nia + "\")");
	}
	public void anyadirTrabajo(Alumno al, TrabajoClase tc) throws SQLException {
		statement.execute("insert into Trabajo values (\"" + tc.getDiasRetraso() + "\",\"" + tc.getDescripcion() + "\",\"" + al.getNia() + "\")");
	}
	public void eliminarTrabajo(String nia, String descripcion) throws SQLException {
		statement.execute("delete from trabajo where (NIA = \"" + nia + "\") & (descripcion = \"" + descripcion + "\");");
	}
	public void eliminarTrabajo(Alumno al, TrabajoClase tc) throws SQLException {
		statement.execute("delete from trabajo where (NIA = \"" + al.getNia() + "\") & (descripcion = \"" + tc.getDescripcion() + "\");");
	}
	
	public ArrayList<Grupo> leerBD() throws Exception {
		ResultSet rsGrupo = statement.executeQuery("select * from grupo");
		ArrayList<Grupo> g = new ArrayList<Grupo>();
		while(rsGrupo.next()) {
			g.add(new Grupo());
			g.get(g.size()-1).setNombreGrupo(rsGrupo.getString(1));
		}
		for (int i = 0; i < g.size(); i++) {
			leerBDAlumno(g.get(i));
		}
		return g;
	}
	private void leerBDAlumno(Grupo g) throws Exception {
		ResultSet rsAlumno = statement.executeQuery("select * from alumno where NombreGrupo = \"" + g.getNombreGrupo() +"\"");
		while (rsAlumno.next()) {
			Alumno al = new Alumno(rsAlumno.getString(1),rsAlumno.getString(2),rsAlumno.getString(3));
			g.addAlumnoBD(al);
		}
		for (int i = 0; i < g.getListaAlumnos().size(); i++) {
			leerBDExameneTrabajo(g.getListaAlumnos().get(i));
		}
	}
	
	
	public void leerBDAlumnos(Grupo g) throws Exception {
		ResultSet rsAlumno = statement.executeQuery("select * from alumno where NombreGrupo = \"" + g.getNombreGrupo() +"\"");
		while (rsAlumno.next()) {
			Alumno al = new Alumno(rsAlumno.getString(1),rsAlumno.getString(2),rsAlumno.getString(3));
			g.addAlumnoBD(al);
		}
		for (int i = 0; i < g.getListaAlumnos().size(); i++) {
			leerBDExameneTrabajo(g.getListaAlumnos().get(i));
		}
	}
	 
	
	
	
	private void leerBDExameneTrabajo(Alumno al) throws ClassNotFoundException, Exception {
		ResultSet rsExClasico = statement.executeQuery("select * from ExamenClasico where NIA = \"" + al.getNia() + "\"");
		while (rsExClasico.next()) {
			al.addExamenesBD(new ExamenClasico(rsExClasico.getDouble(1), rsExClasico.getDouble(3), rsExClasico.getString(2)));
		}
		ResultSet rsExTest = statement.executeQuery("select * from ExamenTest where NIA = \"" + al.getNia() + "\"");
		while (rsExTest.next()) {
			al.addExamenesBD(new ExamenTest(rsExTest.getDouble(1), rsExTest.getInt(3), rsExTest.getInt(4), rsExTest.getString(2)));
		}
		ResultSet rsTrabajo = statement.executeQuery("select * from Trabajo where NIA = \"" + al.getNia() + "\"");
		while (rsTrabajo.next()) {
			al.addTrabajosBD(new TrabajoClase(rsTrabajo.getInt(1),rsTrabajo.getString(2)));
		}
	}
}
