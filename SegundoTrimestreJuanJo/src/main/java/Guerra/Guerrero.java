package Guerra;

public class Guerrero extends Personaje implements Combate {
	private final double FUERZA_ATAQUE = 0;
	private double fuerzaAtaque = FUERZA_ATAQUE;

	public Guerrero(String nombre) {
		super(nombre);
	}

	@Override
	public void roba(Personaje personaje) {
		// falta terminar de llenar este metodo

	}

	@Override
	public void ataca(Personaje personaje) {
		// falta terminar de llenar este metodo

	}

	@Override
	public String toString() {
		return "Guerrero [fuerzaAtaque:" + fuerzaAtaque + ", Nombre:" + getNombre() + ", Calzado:" + isCalzado()
				+ ", Vida:" + getVida() + "]";
	}

}
