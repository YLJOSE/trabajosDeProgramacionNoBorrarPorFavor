package Guerra;

import java.time.LocalTime;

public class Sniper extends Personaje implements Combate {
	private final int NUMERO_BALAS = 20;
	private int numeroBalas = NUMERO_BALAS;

	public Sniper(String nombre) {
		super(nombre);
	}

	@Override
	public void roba(Personaje personaje) {
		if (personaje instanceof Sniper && personaje.getVida() == 0) {
			this.numeroBalas = (this.getNumeroBalas() + ((Sniper) personaje).getNumeroBalas());
			((Sniper) personaje).setNumeroBalas(0);
		}

	}

	@Override
	public void ataca(Personaje personaje) {
		this.numeroBalas -= 1;
		personaje.setVida(personaje.getVida() / 2);
		personaje.setDisparado(true);
		personaje.setTiempo(LocalTime.now());

	}

	/**
	 * @return el numeroBalas
	 */
	public int getNumeroBalas() {
		return numeroBalas;
	}

	/**
	 * @param numeroBalas el numeroBalas a establecer
	 */
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	@Override
	public String toString() {
		return "Sniper [ Nombre:" + getNombre() + ", numeroBalas:" + numeroBalas + ", Calzado:=" + isCalzado()
				+ ", Vida:" + getVida() + "]";
	}

}
