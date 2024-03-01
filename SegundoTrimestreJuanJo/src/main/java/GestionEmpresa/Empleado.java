package GestionEmpresa;

import java.time.LocalDate;

abstract class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaIngreso;
	/**
	 * @return el nombre
	 */
	public String getNombreCompleto() {
		return this.getClass().getSimpleName() + this.nombre+ this.apellido;
	}
	static void calcularSueldo(Empleado empleado) {
		
	}

}
