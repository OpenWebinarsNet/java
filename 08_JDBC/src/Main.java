
public class Main {
	

	public static void main(String[] args) {
		Conexion c = new Conexion("openwebinars","root","");
		c.conectar();
		c.insertar();
		
		c.update();
		
		c.delete();
	}

}
