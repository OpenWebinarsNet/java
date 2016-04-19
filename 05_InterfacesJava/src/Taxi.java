
public class Taxi implements IVehiculo {
	String matricula;
	int velocidadActual;
	int plazasVehiculo;
	public static final int VELOCIDAD_MAX_TAXI = 120;
	
	public Taxi() {
		matricula = "";
		velocidadActual = 0;
		plazasVehiculo = 0;
	}

	public Taxi(String matricula, int velocidadActual, int plazasVehiculo) {
		super();
		this.matricula = matricula;
		this.velocidadActual = velocidadActual;
		this.plazasVehiculo = plazasVehiculo;
	}

	@Override
	public int getVelocidad() {
		return velocidadActual;
	}

	@Override
	public void acelerar(int velocidadIncremento) {
		this.velocidadActual += velocidadIncremento;
		
		if(this.velocidadActual>VELOCIDAD_MAX_TAXI) {
			System.out.println("Ha superado la velocidad máxima permitida en el Taxi ("+VELOCIDAD_MAX_TAXI+"km/h)");
		}
		
		System.out.println("El taxi va a "+velocidadActual+"km/h");
	}

	@Override
	public void frenar(int velocidadDeFrenada) {
		this.velocidadActual -= velocidadDeFrenada;
	
		
		if(this.velocidadActual<=0) {
			this.velocidadActual = 0;
			System.out.println("El Taxi se ha parado completamente");
		} else {
			System.out.println("El taxi va a "+velocidadActual+"km/h");

		}
	}

	@Override
	public int getNumPlazas() {
		return plazasVehiculo;
	}

	@Override
	public int getVelocidadMaxima() {
		return VELOCIDAD_MAX_TAXI;
	}
	
	@Override
	public String getMatricula() {
		return this.matricula;
	}
	
	
}
