package Guerra;

import java.util.Random;

public abstract class Sanitario extends Personaje implements Huida {
	private final double MATERIAL_INICIAL = 0;
	private double material = MATERIAL_INICIAL;

	public Sanitario(String nombre) {
		super(nombre);
	}

	public abstract void cura(Personaje personaje);

	@Override
	public void huye() {
		int probabilidad;
		Random rnd = new Random();
		probabilidad = rnd.nextInt(2);
		if (probabilidad == 0) {
			this.setCalzado(false);
			System.out.println("Perdiste el calzado");
		}

	}

	/**
	 * @return el material
	 */
	public double getMaterial() {
		return material;
	}

	/**
	 * @param material el material a establecer
	 */
	public void setMaterial(double material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Sanitario [material:" + material + ", Nombre:" + getNombre() + ", Calzado:" + isCalzado() + ", Vida:"
				+ getVida() + "]";
	}

}
