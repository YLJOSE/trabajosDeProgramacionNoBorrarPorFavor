package GestionEmpresa;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.*;

public class EmpresaMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<EmpleadoAbstractHerencia> plantilla = new ArrayList<>();
		menu(plantilla);
	}

	static void insertEmploy(ArrayList<EmpleadoAbstractHerencia> plantilla) {
		sc.nextLine();
		boolean verdadero = false;
		String nombre, apellido;
		int edad, año, mes, dia, opcion, totalVentas, totalProduccion;
		double totalHoras;
		do {
			System.out.println("Ingresa el nombre:");
			nombre = sc.nextLine();
			System.out.println("Ahora ingresa el apellido:");
			apellido = sc.nextLine();
			System.out.println("Ingresa tu edad:");
			edad = sc.nextInt();
			System.out.println("Ingresa el año de ingreso:");
			año = sc.nextInt();
			System.out.println("Ahora ingresa el mes:");
			mes = sc.nextInt();
			System.out.println("Finalizando ingresa el dia:");
			dia = sc.nextInt();
			System.out.println("Usted es de?");
			System.out.println("1. Ventas.");
			System.out.println("2. Representantes.");
			System.out.println("3. Producción.");
			System.out.println("4. Mantenimiento.");
			System.out.println("Ingresa la opcion (1)(2)(3)(4):");
			try {

				opcion = sc.nextInt();
				verdadero = true;
				if (opcion == 1 || opcion == 2) {
					System.out.println("Ingresa el total de ventas:");
					totalVentas = sc.nextInt();
					if (opcion == 1) {
						Venta v1 = new Venta(nombre, apellido, edad, LocalDate.of(año, mes, dia), totalVentas);
						plantilla.add(v1);
					}
					if (opcion == 2) {

						Representante r1 = new Representante(nombre, apellido, edad, LocalDate.of(año, mes, dia),
								totalVentas);
						plantilla.add(r1);
					}

				}
				if (opcion == 3) {
					System.out.println("Ingresa el total de unidades producidas al mes:");
					totalProduccion = sc.nextInt();
					Produccion p1 = new Produccion(nombre, apellido, edad, LocalDate.of(año, mes, dia),
							totalProduccion);
					plantilla.add(p1);

				}
				if (opcion == 4) {
					System.out.println("Ingresa el total de horas trabajadas al mes :");
					totalHoras = sc.nextDouble();
					Mantenimiento m1 = new Mantenimiento(nombre, apellido, edad, LocalDate.of(año, mes, dia),
							totalHoras);
					plantilla.add(m1);

				}

			} catch (InputMismatchException e) {
				System.out.println("Ingresa un numero por favor!");
				sc.nextLine();
			}

		} while (verdadero != true);
	}

	static void menu(ArrayList<EmpleadoAbstractHerencia> plantilla) {
		boolean verdadero = false;
		boolean ayuda = false;
		do {
			int opcion;
			System.out.println("Ingresa lo que deseas realizar:\n");
			System.out.println("********MENU*********");
			System.out.println("1. Ingresar empleados.");
			System.out.println("2. Visualizar sueldos.");
			System.out.println("3. Calcular media de los sueldos por tipo de empleado.");
			System.out.println("0. Ingresa 0 si deseas salir.");
			try {
				opcion = sc.nextInt();
				verdadero = true;
				switch (opcion) {
				case 1:
					insertEmploy(plantilla);
					break;
				case 2:
					viewSalary(plantilla);
					break;
				case 3:
// terminar
					break;
				default:
					ayuda = true;
					System.out.println("Saliendo delprograma");

				}
			} catch (InputMismatchException e) {
				System.out.println("Ingresa un numero por favor!");
				sc.nextLine();
			}
		} while (verdadero != true || ayuda != true);
	}

	static void viewSalary(ArrayList<EmpleadoAbstractHerencia> plantilla) {
		plantilla.forEach(objetos -> System.out.println(objetos.getNamecomplet() + " " + objetos.calcSalary()));

	}
}
