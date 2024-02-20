package bidimensionalesRec;

import java.util.Scanner;

public class bidimensional3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nEstudiantes = 3;
		int nNotas = 4;

		double calificaciones[][] = new double[nEstudiantes][nNotas];

		for (int i = 0; i < nEstudiantes; i++) {
			System.out.println("Ingresar calificaciones para el estudiante : " + (i + 1) + " :");
			for (int j = 0; j < nNotas; j++) {
				System.out.println("Calificacion del estudiante " + (i + 1) + " en la asignatura " + (j + 1) + " :");
				calificaciones[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < nEstudiantes; i++) {

			double suma = 0;
			for (int j = 0; j < nNotas; j++) {

				suma += calificaciones[i][j];

			}
			System.out.println("Promedi9o del alumno " + (i + 1) + " = " +(suma / nNotas));

		}
	}

}
