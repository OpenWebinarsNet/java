
public class Comercial extends Empleado {
	private int comision;

	// Constructor
	public Comercial(String nombre, String apellidos, int salario, String nif, String codigoIban, int comision) {
		super(nombre, apellidos, salario, nif, codigoIban);
		this.comision = comision;
	}

	// Getters y Setters
	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"
				+ "Comisión: "+this.comision+"€/venta";
	}
	
	

}
