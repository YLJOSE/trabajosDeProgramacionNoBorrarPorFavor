package trabajosProgramacion;

import java.util.Scanner;

public class CocheMain {
	public static void main(String[] args) {
		Coche coche1 = new Coche("Toyota", "Fox", "LP5209Y");
		Coche coche2 = new Coche("Hyundai", "Sentra", "WR2909P");
		Coche coche3 = new Coche("Chevrolet", "Camaro", "UJ5068O");
		menu(coche1, coche2, coche3);
	}

	// metodo menu al que se le pasan los coches
	public static void menu(Coche coche1, Coche coche2, Coche coche3) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		// bucle que controla la opcion sea valida o no correspondiente
		do {
			System.out.println("MENÚ ALQUILER DE COCHES");
			System.out.println("------------------------");
			System.out.println("1. ALQUILAR UN COCHE");
			System.out.println("2. DEVOLVER UN COCHE");
			System.out.println("0. SALIR");
			System.out.println("\n INGRESA EL NUMERO DE LO QUE DESEAS REALIZAR");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println(coche1.toString());
				System.out.println(coche2.toString());
				System.out.println(coche3.toString());
				CocheMain.escogerCocheAlquilar(coche1, coche2, coche3);
				break;
			case 2:
				CocheMain.escogerCocheDevolver(coche1, coche2, coche3);
				break;
			case 0:
				System.out.println("SALIENDO DEL PROGRAMA");
				break;
			default:
				System.out.println("OPCION NO VALIDA, PORFAVOR INGRESA UNA CORRECTA");
			}
		} while (opcion != 0);
	}

	// METODO DONDE INGRESAS LA MATRICULA DEL COCHE Y TE DIRIJE CON EL DETERMINADO
	// METODO DE ACUERDO AL COCHE A ALQUILAR

	public static void escogerCocheAlquilar(Coche coche1, Coche coche2, Coche coche3) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INGRESA LA MATRICULA DEL COCHE DEL QUE DESEAS ALQUILAR");
		String matricula1 = sc.nextLine();
		if (matricula1.equalsIgnoreCase(coche1.getMatricula())) {
			System.out.println("CUANTOS DIAS: ");
			coche1.alquilarCoche(coche1, sc.nextInt());
		}
		if (matricula1.equalsIgnoreCase(coche2.getMatricula())) {
			System.out.println("CUANTOS DIAS: ");
			coche1.alquilarCoche(coche2, sc.nextInt());
		}
		if (matricula1.equalsIgnoreCase(coche3.getMatricula())) {
			System.out.println("CUANTOS DIAS: ");
			coche1.alquilarCoche(coche3, sc.nextInt());
		}
	}

	// METODO DONDE INGRESAS LA MATRICULA DEL COCHE Y TE DIRIJE CON ELDETERMINADO

	// METODO DE ACUERDO AL COCHE A DEVOLVER
	public static void escogerCocheDevolver(Coche coche1, Coche coche2, Coche coche3) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INGRESA LA MATRICULA DEL COCHE DEL QUE DESEAS DEVOLVER");
		String matricula1 = sc.nextLine();
		if (matricula1.equalsIgnoreCase(coche1.getMatricula())) {
			coche1.devolverCoche(coche1);
		}
		if (matricula1.equalsIgnoreCase(coche2.getMatricula())) {
			coche2.devolverCoche(coche2);
		}
		if (matricula1.equalsIgnoreCase(coche3.getMatricula())) {
			coche3.devolverCoche(coche3);
		}
	}

}
