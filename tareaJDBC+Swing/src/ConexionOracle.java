import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexionOracle {
	
	public ResultSet ejecutarconsulta (String consulta) throws ClassNotFoundException, SQLException{
        // 1. Cargar el driver
        Class.forName ("oracle.jdbc.OracleDriver");
        // 2. Conectar con la base de datos
                                        
        Connection conn = DriverManager.getConnection
                                        ("jdbc:oracle:thin:@172.30.160.190:1521/enlaces6","daw20", "tiger");
                                        
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(consulta);
        
        return rs;
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Cargar el driver
		Class.forName("oracle.jdbc.OracleDriver");
		// 2. Conectar con la base de datos
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.30.160.190:1521/enlaces6","daw20", "tiger");
		System.out.println("Conexión realizada");
		
		// 3. Acceder a la base de datos ...
		Statement sentencia = conn.createStatement();
		
		
		// 4. Procesar el resultado
		String consulta = "select * from emp";
		ResultSet rs = sentencia.executeQuery(consulta);
		
		// Obtener metadatos:
		ResultSetMetaData metaData = rs.getMetaData();
		int cols = metaData.getColumnCount();
		
		System.out.println("Nombre de la tabla: " + metaData.getTableName(2));
		System.out.println("Campo \t Tamaño \tTipo");
		
		
		for (int i = 0; i < cols; i++) {
			System.out.print(metaData.getColumnName(i + 1) + " \t");
			System.out.print(metaData.getColumnDisplaySize(i + 1) + " \t");
			System.out.println(metaData.getColumnTypeName(i + 1) + " \t");
		}
		
		
		// escribir nombres de las columnas
		System.out.println("\nID emp.\tNombre\tPuesto de trabajo");
		while (rs.next()) {
			System.out.println(rs.getNString(1) + "\t" + rs.getNString(2) + "\t" + rs.getNString(3));
		}
		
		System.out.println("Terminada consulta");
		
		rs.close();
		conn.close();
	}
}
