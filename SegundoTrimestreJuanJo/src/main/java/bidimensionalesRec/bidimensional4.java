
package bidimensionalesRec;

import java.util.Scanner;

public class bidimensional4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nEstudiantes = 3;
		int nNotas = 4;

		String nombres[] = new String[nEstudiantes];
		double calificaciones[][] = new double[nEstudiantes][nNotas];

		for (int i = 0; i < nEstudiantes; i++) {
			System.out.println("Ingresar el nombre del alumno " + (i + 1) + " :");
			nombres[i] = sc.nextLine();
			System.out.println("Ingresar calificaciones para el estudiante : " + nombres[i] + " :");
			for (int j = 0; j < nNotas; j++) {
				System.out.println("Calificacion del estudiante " + nombres[i] + " en la asignatura " + (j + 1) + " :");
				calificaciones[i][j] = sc.nextDouble();
			}
			sc.nextLine();
		}
		for (int i = 0; i < nEstudiantes; i++) {

			double suma = 0;
			for (int j = 0; j < nNotas; j++) {

				suma += calificaciones[i][j];

			}
			System.out.println("Promedio del alumno " + nombres[i] + " = " + (suma / nNotas));

		}
		sc.close();
	}

}
