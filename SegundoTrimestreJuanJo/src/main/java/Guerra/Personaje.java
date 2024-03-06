package Guerra;

import java.time.LocalTime;

public abstract class Personaje {
	private final double VIDA_INICIAL = 10;
	private final double MINUTOS = 5;

	private String nombre;
	private boolean calzado = true;
	private double vida = VIDA_INICIAL;
	private boolean acuchillado = false;
	private boolean disparado = false;
	private LocalTime tiempo = null;

	/**
	 * @param nombre
	 */
	public Personaje(String nombre) {
		super();
		this.nombre = nombre;
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
	 * @return el calzado
	 */
	public boolean isCalzado() {
		return calzado;
	}

	/**
	 * @param calzado el calzado a establecer
	 */
	public void setCalzado(boolean calzado) {
		this.calzado = calzado;
	}

	/**
	 * @return el vida
	 */
	public double getVida() {
		return vida;
	}

	/**
	 * @param vida el vida a establecer
	 */
	public void setVida(double vida) {
		this.vida = vida;
	}

	/**
	 * @return el acuchillado
	 */
	public boolean isAcuchillado() {
		return acuchillado;
	}

	/**
	 * @param acuchillado el acuchillado a establecer
	 */
	public void setAcuchillado(boolean acuchillado) {
		this.acuchillado = acuchillado;
	}

	/**
	 * @return el disparo
	 */
	public boolean isDisparado() {
		return disparado;
	}

	/**
	 * @param disparo el disparo a establecer
	 */
	public void setDisparado(boolean disparo) {
		this.disparado = disparo;
	}

	/**
	 * @return el tiempo
	 */
	public LocalTime getTiempo() {
		return tiempo;
	}

	/**
	 * @param tiempo el tiempo a establecer
	 */
	public void setTiempo(LocalTime tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "nombre:" + nombre + ", calzado:" + calzado + ", vida:" + vida + ", acuchillado:" + acuchillado
				+ ", disparo:" + disparado + ", tiempo:" + tiempo + "]";
	}

}
