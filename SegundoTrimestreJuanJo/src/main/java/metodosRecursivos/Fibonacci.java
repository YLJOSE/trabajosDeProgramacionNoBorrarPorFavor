
package metodosRecursivos;

import java.util.Scanner;

public class Fibonacci {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("ingresa el tamaño:");
		int size= sc.nextInt();
		recorrer(size);
		
	}
	static void recorrer(int number) {
		int ayuda=0;
	int anterior=0;
		for (int i = 1; i <= number; i++) {
			ayuda=ayuda + anterior;
			System.out.print(ayuda);
			anterior =i;
		
			
		}
		
		
	}

}
