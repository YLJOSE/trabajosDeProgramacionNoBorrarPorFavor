package Guerra;

public class Medico extends Sanitario {

	public Medico(String nombre) {
		super(nombre);

	}

	@Override
	public void cura(Personaje personaje) {
		if (personaje.isAcuchillado() && this.getMaterial() >= 2) {
			this.setMaterial(this.getMaterial() - 1.3);
			personaje.setAcuchillado(false);
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
		return "Medico [Nombre:" + getNombre() + ", Calzado:" + isCalzado() + ", Vida:" + getVida() + ", Tiempo:"
				+ getTiempo() + "]";
	}

}
