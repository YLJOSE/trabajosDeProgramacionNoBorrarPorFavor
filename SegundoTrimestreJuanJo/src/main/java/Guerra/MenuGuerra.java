package Guerra;

import java.time.LocalTime;

public class MenuGuerra {
	public static void main(String[] args) {
		Personaje bandoBlanco[] = new Personaje[8];
		Personaje bandoNegro[] = new Personaje[8];
		setObject(bandoBlanco, bandoNegro);
		menu(bandoBlanco, bandoNegro);

	}

	static void menu(Personaje bandoBlanco[], Personaje bandoNegro[]) {
		viewArray(bandoBlanco, bandoNegro);
	}

	static void setObject(Personaje bandoBlanco[], Personaje bandoNegro[]) {
		/***************** BANDO**BLANCO *************************/
		bandoBlanco[0] = new Medico("MedicoBlanco");
		bandoBlanco[1] = new Cirujano("CirujanoBlanco");
		bandoBlanco[2] = new Guerrero("GuerreroBlanco");
		bandoBlanco[3] = new Sniper("SniperBlanco");
		bandoBlanco[4] = new Civil("CivilUnoBlanco");
		bandoBlanco[5] = new Civil("CivilDosBlanco");
		bandoBlanco[6] = new Civil("CivilTresBlanco");
		bandoBlanco[7] = new Civil("CivilCuatroBlanco");
		/*******************************************************/
		/***************** BANDO**NEGRO *************************/
		bandoNegro[0] = new Medico("MedicoNegro");
		bandoNegro[1] = new Cirujano("CirujanoNegro");
		bandoNegro[2] = new Guerrero("GuerreroNegro");
		bandoNegro[3] = new Sniper("SniperNegro");
		bandoNegro[4] = new Civil("CivilUnoNegro");
		bandoNegro[5] = new Civil("CivilDosNegro");
		bandoNegro[6] = new Civil("CivilTresNegro");
		bandoNegro[7] = new Civil("CivilCuatroNegro");
		/*******************************************************/
	}

	static void updateLife(Personaje bandoBlanco[], Personaje bandoNegro[]) {

		for (int i = 0; i < bandoNegro.length; i++) {

			if (bandoBlanco[i].getTiempo().isAfter(LocalTime.now().plusMinutes(5))) {
				bandoBlanco[i].setVida(0);
			}
			if (bandoNegro[i].getTiempo().isAfter(LocalTime.now().plusMinutes(5))) {
				bandoNegro[i].setVida(0);
			}

		}
	}

	static void viewArray(Personaje bandoBlanco[], Personaje bandoNegro[]) {
		System.out.println("\t\t\t BANDO BLANCO");
		for (int i = 0; i < bandoNegro.length; i++) {
			System.out.println(bandoBlanco[i].toString());
		}
		System.out.println("\t\t\t BANDO NEGRO");
		for (int i = 0; i < bandoNegro.length; i++) {
			System.out.println(bandoNegro[i].toString());
		}
	}
}
