
package metodosRecursivos;

import java.util.Scanner;

public class Fibonacci {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ingresa el tamaño:");
		int size = sc.nextInt();
		recorrer(size);

	}

	static void recorrer(int number) {
		int num1 = 0, num2 = 1, suma = 1;

		for (int i = 1; i <= number; i++) {
			System.out.print(suma);

			// primero sumamos
			suma = num1 + num2;
			// guarda el numero anterior
			num1 = num2;
			// se guarda el numero siguiente
			num2 = suma;

		}

	}

}
