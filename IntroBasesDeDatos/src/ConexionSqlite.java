import java.sql.*;

public class ConexionSqlite {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Cargar el driver
		Class.forName("org.sqlite.JDBC");
		// 2. Conectar con la base de datos
		String cadena_con = "jdbc:sqlite:ejemplo.db" ;
		Connection conn = DriverManager.getConnection(cadena_con);
		// 3. Acceder a la base de datos ...
		Statement sentencia = conn.createStatement();
		sentencia.executeUpdate("drop table if exists people;");
	    sentencia.executeUpdate("create table people (name, occupation);");
	    PreparedStatement prep = conn.prepareStatement("insert into people values (?, ?);");
	    prep.setString(1, "Gandhi");
	    prep.setString(2, "politics");
	    prep.addBatch();
	    prep.setString(1, "Turing");
	    prep.setString(2, "computers");
	    prep.addBatch();
	    prep.setString(1, "Wittgenstein");
	    prep.setString(2, "smartypants");
	    prep.addBatch();
	    prep.setString(1, "Luis Miguel Morillas");
	    prep.setString(2, "profesor");
	    prep.addBatch();
	    
	    conn.setAutoCommit(false);
	    prep.executeBatch();
	    conn.setAutoCommit(true);
	    System.out.println("Terminado");
	    
		// 4. Procesar el resultado
	    String consulta = "select * from people;";
		ResultSet rs = sentencia.executeQuery(consulta);
		
		while (rs.next()) {
			System.out.println("Nombre: " + rs.getString("name"));
			System.out.println("Ocupación: " + rs.getString("occupation") + "\n");
		}
		
		rs.close();
		// 5. Cierre de la conexión
		conn.close();

	}

}
