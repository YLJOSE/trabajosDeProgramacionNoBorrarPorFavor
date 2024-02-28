package trabajosProgramacion;

public class Jefe extends Empleado {
	private double prima;

	/**
	 * @param nombre
	 * @param sueldo
	 * @param prima
	 */
	public Jefe(String nombre, double sueldo, double prima) {
		super(nombre, sueldo);
		this.prima = prima;
	}

	/**
	 * @return el prima
	 */
	public double getPrima() {
		return prima;
	}

	/**
	 * @param prima el prima a establecer
	 */
	public void setPrima(double prima) {
		this.prima = prima;
	}

	@Override
	public String toString() {
		return "jefes [prima=" + prima + ", getNombre()=" + getNombre() + ", getSueldo()=" + getSueldo() + "]";
	}

}
