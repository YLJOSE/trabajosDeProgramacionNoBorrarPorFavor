package arrays;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class prueba2 {
	public static void main(String[] args) {
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
		sc.close();

	}
}
