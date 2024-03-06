package Guerra;

public class Cirujano extends Sanitario {

	public Cirujano(String nombre) {
		super(nombre);
	}

	@Override
	public void cura(Personaje personaje) {
		if (personaje.isAcuchillado() || personaje.isDisparado() && this.getMaterial() >= 2) {
			this.setMaterial(this.getMaterial() - 1.3);
			personaje.setAcuchillado(false);
			personaje.setDisparado(false);
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
		return "Cirujano [Nombre:" + getNombre() + ", Material:" + getMaterial() + ", Calzado:" + isCalzado()
				+ ", Vida:" + getVida() + "]";
	}

}
