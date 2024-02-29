package InterfacesAbstract;

public class Rectangulo implements Forma {
	private double alto;
	private double ancho;

	/**
	 * @param alto
	 * @param ancho
	 */
	public Rectangulo(double alto, double ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public double calcularArea() {
		return (ancho * alto);
	}

	@Override
	public double calcularPerimetro() {
		return (2 * (ancho + alto));
	}

}
