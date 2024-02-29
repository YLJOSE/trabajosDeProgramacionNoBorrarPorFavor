
package metodosRecursivos;

import java.util.Scanner;

public class Fibonacci {
	public static Scanner sc = new Scanner(System.in);
	private static int numAnterior = 0;
	private static int numSiguiente = 1;
	private static int sumaTotal = 1;

	public static void main(String[] args) {
		System.out.println("ingresa el tamaño:");
		int size = sc.nextInt();
		recorrer(size);
		System.out.println("\n********************************************************************");
		recorrerRecursivo(size);

	}

	static void recorrer(int number) {
		int num1 = 0, num2 = 1, sumaTotal = 1;

		for (int i = 1; i <= number; i++) {

			System.out.print(sumaTotal+ " ");

			// suma primero
			sumaTotal = num1 + num2;
			// guarda el numero anterior
			num1 = num2;
			// guarda el numero siguiente
			num2 = sumaTotal;

		}
	}

	static void recorrerRecursivo(int number) {


		if (number > 0) {
			System.out.print(sumaTotal+ " ");
			sumaTotal = numAnterior + numSiguiente;
			numAnterior = numSiguiente;
			numSiguiente = sumaTotal;
			recorrerRecursivo(number - 1);

		}

	}

}
