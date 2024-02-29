package InterfacesAbstract;

public class Circulo implements Forma{
	private double radio;
	

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return (Math.PI * Math.pow(radio, 2));
	}

	@Override
	public double calcularPerimetro() {
		return (2* Math.PI*radio);
	}

}
