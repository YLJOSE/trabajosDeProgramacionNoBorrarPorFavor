package Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class PokemonMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Pokemon> pokemones = new ArrayList<>();
		setPokemon(pokemones);
		movimientos(pokemones);
	}

	static void setPokemon(ArrayList<Pokemon> pokemonesO) {
		PokemonFuego pokeFire = new PokemonFuego("Furioso", 10, 5);
		PokemonPlanta pokesito = new PokemonPlanta("Plantasaurus", 9, 4);
		PokemonAgua pokeAguita = new PokemonAgua("Megalodon", 8, 4);
		PokemonFuego pokeFuego2 = new PokemonFuego("Capo", 10, 6);
		PokemonPlanta pokesito2 = new PokemonPlanta("Grood", 7, 4);
		PokemonAgua pokeAguita2 = new PokemonAgua("Aquaman", 9, 3);
		pokemonesO.add(pokeFire);
		pokemonesO.add(pokesito);
		pokemonesO.add(pokeAguita);
		pokemonesO.add(pokeFuego2);
		pokemonesO.add(pokesito2);
		pokemonesO.add(pokeAguita2);
	}

	static void movimientos(ArrayList<Pokemon> pokemonesO) {

		int opcion2;
		char opcion;
		do {
			System.out.println("¿Que pokemon vas a utilizar?\n****************************");
			System.out.println("Ingresa el nombre:\n");
			pokemonesO.forEach(poke -> System.out.println(poke.toString()));
			opcion = sc.nextLine().toUpperCase().charAt(0);
			System.out.println("Indica el nombre del pokemon que vas a atacar: ");
			String pokemonAtacado = sc.nextLine();

			for (int i = 0; i < pokemonesO.size(); i++) {
				if (pokemonAtacado.equals(pokemonesO.get(i).getNombre())) {
					opcion2 = i;
					switch (opcion) {
					case 'F':
						pokemonesO.get(0).atacar(pokemonesO.get(opcion2));
						break;
					case 'P':
						pokemonesO.get(1).atacar(pokemonesO.get(opcion2));
						break;

					case 'M':
						pokemonesO.get(2).atacar(pokemonesO.get(opcion2));
						break;

					}
				}

			}
		} while (opcion != 'S');

	}

}
