package tryCatch;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class TryCatch {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int edad;
		boolean correcto = false;

		do {
			System.out.println("Ingresar edad:");
			try {
				edad = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("Error en la entrada de datos");
				sc.nextLine();
			}

		} while (!correcto);
		System.out.println("FIN");

		Image imagen;
		try {
			imagen = ImageIO.read(new File("C:\\dir1\\imagen.bmp"));
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
			e.printStackTrace();
		}
	}
}
