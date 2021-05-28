package proyectoEntornosTeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
	public static void main(String[] args) {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Setup the connection with the DB
			String url = "jdbc:mysql://localhost:3306/calculadoranotasentornos";
			String user = "root";
			String password = "administrador";
			Connection connect = DriverManager.getConnection(url, user, password);

			// Statements allow to issue SQL queries to the database
			Statement statement = connect.createStatement();

			// Result set get the result of the SQL query
			ResultSet rs = statement.executeQuery("select *  from grupos");
			// writeResultSet(resultSet);
			while (rs.next()) {
				System.out.println(rs.getInt("CodigoGrupo") + " " + rs.getString("NombreGrupo"));

			}

		} catch (Exception e) {
			System.out.println(e);
			;

		}
	}

	private static void writeResultSet(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			int code = resultSet.getInt("CodigoGrupo");
			String name = resultSet.getString("NombreGrupo");

			System.out.println("CodigoGrupo: " + code);
			System.out.println("NombreGrupo: " + name);

		}
	}
}
