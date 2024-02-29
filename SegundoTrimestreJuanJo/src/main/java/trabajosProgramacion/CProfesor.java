package trabajosProgramacion;

import java.util.Date;

public class CProfesor extends CPersona {
	private double puSueldo;
	private String psTitulo;

	/**
	 * @param psNombre
	 * @param psApellido1
	 * @param año
	 * @param mes
	 * @param dia
	 * @param piDni
	 * @param puSueldo
	 * @param psTitulo
	 */
	public CProfesor(String psNombre, String psApellido1, int año, int mes, int dia, int piDni, double puSueldo,
			String psTitulo) {
		super(psNombre, psApellido1, año, mes, dia, piDni);
		this.puSueldo = puSueldo;
		this.psTitulo = psTitulo;
	}

	/**
	 * @return el puSueldo
	 */
	public double getPuSueldo() {
		return puSueldo;
	}

	/**
	 * @param puSueldo el puSueldo a establecer
	 */
	public void setPuSueldo(double puSueldo) {
		this.puSueldo = puSueldo;
	}

	/**
	 * @return el psTitulo
	 */
	public String getPsTitulo() {
		return psTitulo;
	}

	/**
	 * @param psTitulo el psTitulo a establecer
	 */
	public void setPsTitulo(String psTitulo) {
		this.psTitulo = psTitulo;
	}

	@Override
	public String toString() {
		return "CProfesor [Sueldo=" + puSueldo + ", Titulo=" + psTitulo + ", Nombre=" + getPsNombre()
				+ ", Apellido1=" + getPsApellido1() + ", Nacimiento=" + getPdNacimiento()
				+ ", PiDni=" + getPiDni() + "]";
	}

}
