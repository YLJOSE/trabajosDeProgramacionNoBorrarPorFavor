package pruebas33;

import java.time.LocalDate;

public class Venta extends EmpleadoAbstractHerencia {
	private double totalVentas;

	/**
	 * @param name
	 * @param lastName
	 * @param years
	 * @param dateAdmission
	 * @param porcentajeVentas
	 */
	public Venta(String name, String lastName, int years, LocalDate dateAdmission, double porcentajeVentas) {
		super(name, lastName, years, dateAdmission);
		this.totalVentas = porcentajeVentas;
	}

	@Override
	public double calcSalary() {
		return (20 * (totalVentas / 100)) + 400;
	}

	@Override
	public String getNamecomplet() {
		return this.getClass().getSimpleName() +": "+ this.getName().concat(" "+this.getLastName());
	}

}
