import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	private String db, user, pass;
	private Connection conn;
	Statement s;
	
	public Conexion () {
		
	}
	
	public Conexion(String db, String user, String pass) {
		super();
		this.db = db;
		this.user = user;
		this.pass = pass;
	}

	public void conectar () {
		String url = "jdbc:mysql://localhost:3306/";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+db,user,pass);
			s = conn.createStatement();
			
			if(!conn.isClosed()) {
				System.out.println("Conexión con BBDD realizada");
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insertar() {
		//Los datos que vamos a insertar los tenemos en 2 arrays
	     String nombres[] = {"Juan", "Pedro", "Ana"};
	     int partidasGanadas[] = {1, 15, 10};

	     //se insertan datos en la tabla
	     for (int i = 0; i < nombres.length; i++) {
	     	try {
				s.executeUpdate("INSERT INTO jugador (nombre, partidasGanadas) "
						+ "VALUES ('" + nombres[i] + "','" + partidasGanadas[i]  + "' )");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	}
	
	public void update() {
		
		try {
			s.executeUpdate("UPDATE jugador SET partidasGanadas=0 WHERE id=1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete() {
		
		try {
			s.executeUpdate("DELETE FROM jugador WHERE id=2");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
