package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class prueba4 {

	public static void main(String[] args) {
		int maximo[] = { 5, 3, 3, 6, 7, 8, 9, 12 };
		int ayuda = 0;

		for (int num : maximo) {
			System.out.println(num + " l j " + ayuda);
			ayuda++;
		}

		String paises[] = new String[7];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < paises.length; i++) {
			System.out.println("Introducir pais " + i);
			// paises[i] = sc.nextLine();
			paises[i] = JOptionPane.showInputDialog("Pais");
		}
		System.out.println("\nImprimir  paises\n");
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Pais " + i + ": " + paises[i]);

		}
		for (String pais : paises) {
			System.out.println(pais);

		}

		sc.close();

	}

}
