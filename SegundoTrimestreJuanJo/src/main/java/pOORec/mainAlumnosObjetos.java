package pOORec;

import java.util.Arrays;
import java.util.Scanner;

public class mainAlumnosObjetos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM_ALUMNOS = 4;
		final int NUM_ASIGNATURAS = 3;
		Alumnos alumnos[] = new Alumnos[NUM_ALUMNOS];

		alumnos[0] = new Alumnos("pepe");
		System.out.println("Nombre : " + alumnos[0].nombre);

		for (int i = 0; i < alumnos.length; i++) {

			System.out.print("Ingresa el nombre del alumno:");
			alumnos[i] = new Alumnos(sc.nextLine());
			alumnos[i].notas = new int[NUM_ASIGNATURAS];
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {

				System.out.print("INGRESA LA NOTA:");
				alumnos[i].notas[j] = sc.nextInt();

			}
			sc.nextLine();

		}

		for (int i = 0; i < alumnos.length; i++) {
			System.out.print(alumnos[i].nombre + " ");
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				System.out.print("NOTA: " + alumnos[i].notas[j]);

			}
			System.out.println();

		}

		for (Alumnos alumnos2 : alumnos) {

			System.out.print(alumnos2.nombre + " ");
			System.out.print(Arrays.toString(alumnos2.notas));
			System.out.println();

		}
	}
}