import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		String nombreJugador1, nombreJugador2;
		Juego j;
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[:\\s]");
		
		System.out.println("*** NUEVA PARTIDA ***\n"
				+ "1) 2 jugadores\n"
				+ "2) Jugar contra la máquina\n"
		);
		
		System.out.print("Indique el tipo de juego:");
		int tipoJuego = Integer.parseInt(sc.next());
		
		if(tipoJuego==1) {
			System.out.print("Indique nombre jugador 1:");
			nombreJugador1 = sc.next();
			
			System.out.print("\nIndique nombre jugador 2:");
			nombreJugador2 = sc.next();
			
			j = new Juego(nombreJugador1,nombreJugador2);
			
		} else {
			System.out.print("Indique su nombre:");
			nombreJugador1 = sc.nextLine();
			
			// En este caso utilizamos el constructor que sólo
			// recibe el nombre de un jugador
			j = new Juego(nombreJugador1);
		}
		
		j.siguienteTurno();
		
		
	}

}
