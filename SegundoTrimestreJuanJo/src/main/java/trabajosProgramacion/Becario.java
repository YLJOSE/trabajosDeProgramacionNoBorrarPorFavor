package trabajosProgramacion;

public class Becario extends Empleado {
	private String contrato;

	/**
	 * @param nombre
	 * @param sueldo
	 * @param contrato
	 */
	public Becario(String nombre, double sueldo, String contrato) {
		super(nombre, sueldo);
		this.contrato = contrato;
	}

	/**
	 * @return el contrato
	 */
	public String getContrato() {
		return contrato;
	}

	/**
	 * @param contrato el contrato a establecer
	 */
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "becarios [contrato=" + contrato + ", getNombre()=" + getNombre() + ", getSueldo()=" + getSueldo() + "]";
	}

}
