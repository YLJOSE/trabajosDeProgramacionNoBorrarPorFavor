
package metodosRecursivos;

import java.util.Scanner;

public class Factorial {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingresa un numero entero:");
		int numero = sc.nextInt();

		// System.out.println(numero + "!= " + factorialCalc(numero));
		System.out.println(numero + "!= " + factorialCalcRecursivo(numero));

	}

	static int factorialCalc(int number) {
		int resultado = 1;
		// importa si se le pone 2 o 1¿?
		for (int i = number; i >= 2; i--) {

			resultado *= i;

		}
		return resultado;

	}

	static int factorialCalcRecursivo(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * factorialCalcRecursivo(number - 1);
		}

	}
}
