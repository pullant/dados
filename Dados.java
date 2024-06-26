// 1. Compile the class file
//
// 	The main class in Dados.java has to have the same name as the file.
//
// 	$ javac Dados.java
//
// 2. Run the class file
//
// 	$ java Dados
//

import java.util.Scanner;

public class Dados {
	public static void main(String[] args) {
		// - Dos jugadores
		// - La tirada es con dos dados
		// - Uno de ellos gana

		// INPUT:
		// 	Ingresar el nombre de cada jugador
		// 	Ingresar valor de cada dado
		// OUTPUT:
		// 	Nombre y puntaje del Ganador

		Scanner scanner = new Scanner(System.in);

		for (int partida = 1; partida <= 3; partida++) {
			System.out.println("\n====== Partida " + partida + " ======");
			System.out.print("Jugador 1: ");
			String jugador1 = scanner.next(); // only captures until first blank char
			System.out.print("Dado A: ");
			int dado1A = esDado(scanner.nextInt()); // error if the value it is not an int
			System.out.print("Dado B: ");
			int dado1B = esDado(scanner.nextInt());

			System.out.print("Jugador 2: ");
			String jugador2 = scanner.next();
			System.out.print("Dado A: ");
			int dado2A = esDado(scanner.nextInt());
			System.out.print("Dado B: ");
			int dado2B = esDado(scanner.nextInt());

			int puntaje1 = calcularPuntaje(dado1A, dado1B);
			int puntaje2 = calcularPuntaje(dado2A, dado2B);

			if (puntaje1 > puntaje2) {
				System.out.println("++ Ganador: " + jugador1 + " Puntaje: " + puntaje1 + " ++");
			}
			else {
				System.out.println("+++ Ganador: " + jugador2 + " Puntaje: " + puntaje2 + " +++");
			}
		}

		//
		// Hacer un lote de pruebas con los valores para 3 jugadas
		//
		// Juan 3 3 Finn 2 4 -> Ganador Finn 8!
		// Keny 4 5 Maxy 1 6 -> Ganador Keny 9!
		// Lufy 8 3 Gabi 1 1 -> Ganador Lufy 3!
	}
	// Módulos:
	// 	validar dado:
	// 		input: número entero
	// 		criterio: 1 <= n <= 6
	// 		output:
	// 			verdadero: devuelve n
	// 			falso: devuelve 0
	//
	// 	validar par:
	// 		input: número entero
	// 		criterio: es par
	// 		output: verdadero o falso
	//
	// 	cálculo de puntaje:
	// 		input: dos números enteros
	// 		proceso:
	// 			puntaje de la tirada:
	// 				si dado1 y dado2 son pares:
	// 					dado1 * dado2
	// 				sino:
	// 				dado1 + dado2
	// 		output: puntaje de acuerdo a reglas
	//
	public static int esDado(int dado) {
		return dado >= 1 && dado <= 6 ? dado : 0;
	}
	public static boolean esPar(int dado) {
		return dado == 0 ? false : dado % 2 == 0;
	}
	public static int calcularPuntaje(int dadoA, int dadoB) {
		return esPar(dadoA) && esPar(dadoB) ?
			dadoA * dadoB :
			dadoA + dadoB;
	}
}
