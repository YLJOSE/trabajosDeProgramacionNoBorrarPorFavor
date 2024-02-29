package variableStatic;

import java.util.Date;
import java.util.GregorianCalendar;
import trabajosProgramacion.Empleado;

public class empleado implements Comparable, Trabajador {
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;

	/**
	 * @param nombre
	 * @param sueldo
	 * @param altaContrato
	 * @param id
	 */
	public empleado(String nombre, double sueldo, int año, int mes, int dia, int id) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar alta = new GregorianCalendar(año, mes, dia);
		this.altaContrato = alta.getTime();
		this.id = idSiguiente++;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo el sueldo a establecer
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @return el altaContrato
	 */
	public Date getAltaContrato() {
		return altaContrato;
	}

	/**
	 * @param altaContrato el altaContrato a establecer
	 */
	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}

	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return el idSiguiente
	 */
	public static int getIdSiguiente() {
		return idSiguiente;
	}

	/**
	 * @param idSiguiente el idSiguiente a establecer
	 */
	public static void setIdSiguiente(int idSiguiente) {
		empleado.idSiguiente = idSiguiente;
	}

	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", altaContrato=" + altaContrato + ", id=" + id
				+ "]";
	}

	// interfas
	@Override
	public int compareTo(Object o) {
		Empleado otroEmpleado = (Empleado) o;

		if (this.sueldo < otroEmpleado.getSueldo()) {
			return 1;
		}
		if (this.sueldo > otroEmpleado.getSueldo()) {
			return -1;

		}
		return 0;
	}
	@Override
	public double establecerBonus(double gratificacion) {
		return Trabajador.bonusBase + gratificacion;
	}
}
