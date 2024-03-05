package Guerra;

public class Cirujano extends Sanitario {

	public Cirujano(String nombre) {
		super(nombre);
	}

	@Override
	public void cura(Personaje personaje) {
		if (personaje.isAcuchillado() || personaje.isDisparo() && this.getMaterial() >= 2) {
			this.setMaterial(this.getMaterial() - 1.3);
			personaje.setAcuchillado(false);
			personaje.setDisparo(false);
			personaje.setTiempo(null);
			personaje.setVida(personaje.getVida() + 1);
			System.out.println(personaje.getNombre() + " " + personaje.getVida() + " ha sido curado!");
		}
	}

	@Override
	public void huye() {
		super.huye();
	}

	@Override
	public String toString() {
		return "Cirujano [Material:" + getMaterial() + ", Nombre:" + getNombre() + ", Calzado:" + isCalzado()
				+ ", Vida:" + getVida() + ", Acuchillado:" + isAcuchillado() + ", Disparo:" + isDisparo() + "]";
	}

}
