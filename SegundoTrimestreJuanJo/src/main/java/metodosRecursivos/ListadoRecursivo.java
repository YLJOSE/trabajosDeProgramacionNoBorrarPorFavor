package metodosRecursivos;

import java.io.File;

public class ListadoRecursivo {
	public static void main(String[] args) {

		File newFile = new File("c:\\dir1");
		listarDirectorio(newFile);

	}

	public static void listarDirectorio(File directorio) {
		File[] ficheros = directorio.listFiles();
		if (ficheros != null) {
			for (File file : ficheros) {
				if (file.isDirectory()) {
					System.out.println("directorio: " + file.getAbsolutePath());
					listarDirectorio(file);

				} else {
					System.out.println("fichero: " + file.getAbsolutePath());
				}
			}

		}

	}

}
