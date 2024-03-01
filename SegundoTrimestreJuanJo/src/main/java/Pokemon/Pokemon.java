package Pokemon;

public class Pokemon {
	private String nombre;
	private double healthPoints;
	private double fuerzaDeAtaque;

	/**
	 * @param nombre
	 * @param healthPoints
	 * @param fuerzaDeAtaque
	 */
	public Pokemon(String nombre, double healthPoints, double fuerzaDeAtaque) {
		super();
		this.nombre = nombre;
		this.healthPoints = healthPoints;
		this.fuerzaDeAtaque = fuerzaDeAtaque;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el healthPoints
	 */
	public double getHealthPoints() {
		return healthPoints;
	}

	/**
	 * @param healthPoints el healthPoints a establecer
	 */
	public void setHealthPoints(double healthPoints) {
		this.healthPoints = healthPoints;
	}

	/**
	 * @return el fuerzaDeAtaque
	 */
	public double getFuerzaDeAtaque() {
		return fuerzaDeAtaque;
	}

	/**
	 * @param fuerzaDeAtaque el fuerzaDeAtaque a establecer
	 */
	public void setFuerzaDeAtaque(double fuerzaDeAtaque) {
		this.fuerzaDeAtaque = fuerzaDeAtaque;
	}

	public boolean isDead() {
		if (this.healthPoints <= 0) {
			return true;
		}
		return false;
	}

	public void atacar(Pokemon pokemon) {

		if (this.getClass().getSimpleName().equalsIgnoreCase("PokemonFuego")) {
			if (pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonPlanta")) {
				pokemon.healthPoints = pokemon.healthPoints - (2 * this.fuerzaDeAtaque);
				if (pokemon.isDead()) {
					System.out.println(pokemon.toString());
					System.out.println("Está muerto");
				}
				System.out.println(pokemon.toString());
			}
			if (pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonAgua")
					|| pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonFuego")) {
				pokemon.healthPoints = pokemon.healthPoints - (0.5 * this.fuerzaDeAtaque);
				if (pokemon.isDead() == true) {
					System.out.println(pokemon.toString());
					System.out.println("Está muerto");
				}
				System.out.println(pokemon.toString());
			}

		}
		/*******************************************************************/
		if (this.getClass().getSimpleName().equalsIgnoreCase("PokemonAgua")) {
			if (pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonFuego")) {
				pokemon.healthPoints = pokemon.healthPoints - (2 * (2 * this.fuerzaDeAtaque));
				if (pokemon.isDead() == true) {
					System.out.println(pokemon.toString());
					System.out.println("Está muerto");
				}
				System.out.println(pokemon.toString());
			}
			if (pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonAgua")
					|| pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonPlanta")) {
				pokemon.healthPoints = pokemon.healthPoints - (0.5 * this.fuerzaDeAtaque);
				if (pokemon.isDead() == true) {
					System.out.println(pokemon.toString());
					System.out.println("Está muerto");
				}
				System.out.println(pokemon.toString());
			}

		}
		/*******************************************************************/
		if (this.getClass().getSimpleName().equalsIgnoreCase("PokemonPlanta")) {
			if (pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonAgua")) {
				pokemon.healthPoints = pokemon.healthPoints - (2 * (2 * this.fuerzaDeAtaque));
				if (pokemon.isDead() == true) {
					System.out.println(pokemon.toString());
					System.out.println("Está muerto");
				}
				System.out.println(pokemon.toString());
			}
			if (pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonFuego")
					|| pokemon.getClass().getSimpleName().equalsIgnoreCase("PokemonPlanta")) {
				pokemon.healthPoints = pokemon.healthPoints - (0.5 * this.fuerzaDeAtaque);
				if (pokemon.isDead() == true) {
					System.out.println(pokemon.toString());
					System.out.println("Está muerto");
				}
				System.out.println(pokemon.toString());
			}

		}

	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "\n\t nombre=" + nombre + "\n\t healthPoints=" + healthPoints
				+ "\n\t fuerzaDeAtaque=" + fuerzaDeAtaque + "\n\t ";
	}
}
