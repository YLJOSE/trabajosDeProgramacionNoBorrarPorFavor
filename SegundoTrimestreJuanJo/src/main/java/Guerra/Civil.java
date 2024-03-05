package Guerra;

import java.util.Random;

public class Civil extends Personaje implements Huida {

	public Civil(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Civil [Nombre:" + getNombre() + ", Vida:" + getVida() + "]";
	}

	@Override
	public void huye() {
		int probabilidad;
		Random rnd = new Random();
		probabilidad = rnd.nextInt(1);
		if (probabilidad == 0) {
			this.setCalzado(false);
			System.out.println("Perdiste el calzado");
		}
	}

}
