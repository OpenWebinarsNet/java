
public class Main {

	public static void main(String[] args) {
		Empleado e = new Empleado("Juan", "Perez García", 10000, "11223344Y", "ES4200011198761234567890");

		System.out.println("Info. del empleado: "+e);
		
		System.out.println("\n*********************");
		
		Comercial c = new Comercial("María","Sánchez Fernández", 9000, "44556677U", "ES4200011198761234567890",100);
		System.out.println("Info. del comercial: "+c);
		
		System.out.println("\n*********************");
		
		Jefe j = new Jefe("Ana","Díaz Fernández", 15000, "44534677U", "ES4200011198761234567820",5,1000);
		System.out.println("Info. del jefe: "+j);


	}

}
