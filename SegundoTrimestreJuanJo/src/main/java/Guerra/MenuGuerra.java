package Guerra;

import java.util.*;

public class MenuGuerra {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Personaje bandoBlanco[] = new Personaje[8];
		Personaje bandoNegro[] = new Personaje[8];
		setObject(bandoBlanco, bandoNegro);
		menu(bandoBlanco, bandoNegro);
	}

	static void menu(Personaje bandoBlanco[], Personaje bandoNegro[]) {
		boolean verdadero = false;
		boolean ayuda = false;
		do {
			int opcion;
			System.out.println("\n\t********* MENU **********");
			System.out.println("1. Curar.");
			System.out.println("2. Atacar.");
			System.out.println("3. Robar.");
			System.out.println("4. Huir.");
			System.out.println("5. Visualizar informacion.");
			System.out.println("0. Ingresa 0 si deseas salir.");
			try {
				opcion = sc.nextInt();
				verdadero = true;
				switch (opcion) {
				case 1:
					chooseObject(bandoBlanco, bandoNegro, 1);
					break;
				case 2:
					chooseObject(bandoBlanco, bandoNegro, 2);
					break;
				case 3:
					chooseObject(bandoBlanco, bandoNegro, 3);
					break;
				case 4:
					chooseObject(bandoBlanco, bandoNegro, 4);
					break;
				case 5:
					viewArray(bandoBlanco, bandoNegro);
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

	static void setObject(Personaje bandoBlanco[], Personaje bandoNegro[]) {
		/***************** BANDO**BLANCO ********************/
		bandoBlanco[0] = new Medico("MedicoBlanco");
		bandoBlanco[1] = new Cirujano("CirujanoBlanco");
		bandoBlanco[2] = new Guerrero("GuerreroBlanco");
		bandoBlanco[3] = new Sniper("SniperBlanco");
		bandoBlanco[4] = new Civil("CivilUnoBlanco");
		bandoBlanco[5] = new Civil("CivilDosBlanco");
		bandoBlanco[6] = new Civil("CivilTresBlanco");
		bandoBlanco[7] = new Civil("CivilCuatroBlanco");
		/****************************************************/
		/***************** BANDO**NEGRO *********************/
		bandoNegro[0] = new Medico("MedicoNegro");
		bandoNegro[1] = new Cirujano("CirujanoNegro");
		bandoNegro[2] = new Guerrero("GuerreroNegro");
		bandoNegro[3] = new Sniper("SniperNegro");
		bandoNegro[4] = new Civil("CivilUnoNegro");
		bandoNegro[5] = new Civil("CivilDosNegro");
		bandoNegro[6] = new Civil("CivilTresNegro");
		bandoNegro[7] = new Civil("CivilCuatroNegro");
		/***************************************************/

	}

	static void viewArray(Personaje bandoBlanco[], Personaje bandoNegro[]) {
		System.out.println("\t\t\t BANDO BLANCO");
		for (int i = 0; i < bandoNegro.length; i++) {
			System.out.println("(" + (i) + ") " + bandoBlanco[i].toString());
		}
		System.out.println("\t\t\t BANDO NEGRO");
		for (int i = 0; i < bandoNegro.length; i++) {
			System.out.println("(" + (i) + ") " + bandoNegro[i].toString());
		}
	}

	static void chooseObject(Personaje bandoBlanco[], Personaje bandoNegro[], int opcion) {
		viewArray(bandoBlanco, bandoNegro);
		System.out.println("Que bando eres: \n\t (1)Bando Negro? \n\t (2)Bando Blanco?");
		int opcionBando = sc.nextInt();
		if (opcionBando == 1 || opcionBando == 2) {
			System.out.println("Ingresa el numero del personaje que quieres utilizar:");
			int opcionPersonaje = sc.nextInt();
			if (opcion == 1) {
				System.out.println("Ingresa el nº del personaje que deseas curar:");
				int personajeCurar = sc.nextInt();
				if (opcionBando == 2) {
					((Sanitario) bandoBlanco[opcionPersonaje]).cura(bandoBlanco[personajeCurar]);
				}
				if (opcionBando == 1) {
					((Sanitario) bandoNegro[opcionPersonaje]).cura(bandoNegro[personajeCurar]);
				}
			}

			if (opcion == 2) {
				System.out.println("Ingresa el nº del personaje que deseas atacar:");
				int personajeAtacar = sc.nextInt();
				if (opcionBando == 2) {
					((Combate) bandoBlanco[opcionPersonaje]).ataca(bandoNegro[personajeAtacar]);
				}
				if (opcionBando == 1) {
					((Combate) bandoNegro[opcionPersonaje]).ataca(bandoBlanco[personajeAtacar]);
				}
			}

			if (opcion == 3) {
				System.out.println("Ingresa el nº del personaje que deseas robarle material:");
				int personajeRobar = sc.nextInt();
				if (opcionBando == 2) {
					((Combate) bandoBlanco[opcionPersonaje]).roba(bandoNegro[personajeRobar]);
				}
				if (opcionBando == 1) {
					((Combate) bandoNegro[opcionPersonaje]).roba(bandoBlanco[personajeRobar]);
				}

			}
			if (opcion == 4) {
				if (opcionBando == 2) {
					((Huida) bandoBlanco[opcionPersonaje]).huye();

				}
				if (opcionBando == 1) {
					((Huida) bandoBlanco[opcionPersonaje]).huye();
				}
			}
		} else {
			System.out.println("Número mal ingresado.");
		}

	}
}
