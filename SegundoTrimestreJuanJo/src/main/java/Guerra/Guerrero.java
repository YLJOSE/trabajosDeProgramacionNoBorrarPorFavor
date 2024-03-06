package Guerra;

import java.time.LocalTime;

public class Guerrero extends Personaje implements Combate {
	private final double FUERZA_ATAQUE = 3;
	private double fuerzaAtaque = FUERZA_ATAQUE;
	double materialRobado;

	public Guerrero(String nombre) {
		super(nombre);
	}

	@Override
	public void roba(Personaje personaje) {
		if (personaje instanceof Sanitario && personaje.getVida() == 0) {
			materialRobado = ((Sanitario) personaje).getMaterial();
			((Sanitario) personaje).setMaterial(0);
		}
	}

	public void darMaterial(Sanitario sanitario) {
		sanitario.setMaterial(materialRobado + sanitario.getMaterial());
	}

	@Override
	public void ataca(Personaje personaje) {
		personaje.setVida(personaje.getVida() - this.fuerzaAtaque);
		personaje.setAcuchillado(true);
		personaje.setTiempo(LocalTime.now());
	}

	@Override
	public String toString() {
		return "Guerrero [Nombre:" + getNombre() + ", fuerzaAtaque:" + fuerzaAtaque + ", Calzado:" + isCalzado()
				+ ", Vida:" + getVida() + "]";
	}

}
