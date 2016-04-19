
public class Jefe extends Empleado {
	private int numPersonasACargo;
	private int complementoProductividad;
	
	public Jefe(String nombre, String apellidos, int salario, String nif, String codigoIban, int numPersonasACargo, int complementoProductividad) {
		super(nombre, apellidos, salario, nif, codigoIban);
		this.numPersonasACargo = numPersonasACargo;
		this.complementoProductividad = complementoProductividad;
	}

	public int getNumPersonasACargo() {
		return numPersonasACargo;
	}

	public void setNumPersonasACargo(int numPersonasACargo) {
		this.numPersonasACargo = numPersonasACargo;
	}

	public int getComplementoProductividad() {
		return complementoProductividad;
	}

	public void setComplementoProductividad(int complementoProductividad) {
		this.complementoProductividad = complementoProductividad;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"
				+ "Nº de personas a cargo: "+this.numPersonasACargo+"\n"
				+ "Complemento productividad: "+this.complementoProductividad+"€/año\n";
	}

}
