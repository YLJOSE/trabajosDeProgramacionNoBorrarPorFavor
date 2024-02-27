package variableStatic;

public class jefatura extends empleado {
	private double insentivo;

	/**
	 * @param nombre
	 * @param sueldo
	 * @param año
	 * @param mes
	 * @param dia
	 * @param id
	 * @param insentivo
	 */
	public jefatura(String nombre, double sueldo, int año, int mes, int dia, int id, double insentivo) {
		super(nombre, sueldo, año, mes, dia, id);
		this.insentivo = insentivo;
	}

	/**
	 * @return el insentivo
	 */
	public double getInsentivo() {
		return insentivo;
	}

	/**
	 * @param insentivo el insentivo a establecer
	 */
	public void setInsentivo(double insentivo) {
		this.insentivo = insentivo;
	}

	@Override
	public double getSueldo() {
		return (super.getSueldo() + insentivo);
	}

	@Override
	public String toString() {
		return "jefatura [getInsentivo()=" + getInsentivo() + ", getSueldo()=" + getSueldo() + ", getNombre()="
				+ getNombre() + ", getAltaContrato()=" + getAltaContrato() + ", getId()=" + getId() + "]";
	}

}
