package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDos {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Opciones:\n1.Introducir datos\n2. Salir");
		int opcion = sc.nextInt();

		if (opcion == 1) {
			try {
			insertInfo();
			} catch(InputMismatchException e) {
				System.out.println("debes ingresar un numero");
			}
		} else {
			System.out.println("ADIOS");
			System.exit(opcion);
		}

	}

	static void insertInfo() throws InputMismatchException{
		sc.nextLine();
		
	// try {

			System.out.println("Nombre:");
			String nombre = sc.nextLine();
			System.out.println("Edad:");
			int edad = sc.nextInt();

			System.out.println("Hola soy: " + nombre + " Y tengo : " + edad);
//		} catch (InputMismatchException e) {
//			System.out.println("debes ingresar un numero");
//
//		}
		System.out.println("fin");

	}
	

}
