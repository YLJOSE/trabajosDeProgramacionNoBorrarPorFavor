package pOORec;

import java.util.ArrayList;
import java.util.Scanner;

public class MainHerencia {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Persona p1 = new Persona("pedro", "alvarez", 1);
		Persona p2 = new Persona("ramon", "gutierrez", 2);
		/***********************************************************/
		Informatico p3 = new Informatico("Alejandra", "RAMOS", 565, "programador");
		/******************************************************************/
		Alumno al1 = new Alumno("Carlos", "Perez", 12544, "programador", "CCC");
		/**********************************************************************/
		Profesor profesor1 = new Profesor("Artudito", "saenz", 1452, "administrador", "sistemas");

		ArrayList<Persona> personas = new ArrayList<>();

		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(al1);
		personas.add(profesor1);

		personas.forEach(persona -> System.out.println(persona.toString()));

	}
}
