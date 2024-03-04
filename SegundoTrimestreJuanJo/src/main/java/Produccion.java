package pruebas33;

import java.time.LocalDate;

public class Produccion extends EmpleadoAbstractHerencia {
	private double totalUnidadesMes;

	/**
	 * @param name
	 * @param lastName
	 * @param years
	 * @param dateAdmission
	 * @param totalUnidadesMes
	 */
	public Produccion(String name, String lastName, int years, LocalDate dateAdmission, double totalUnidadesMes) {
		super(name, lastName, years, dateAdmission);
		this.totalUnidadesMes = totalUnidadesMes;
	}

	@Override
	public double calcSalary() {
		return totalUnidadesMes * 5;
	}

	@Override
	public String getNamecomplet() {
		return this.getClass().getSimpleName() +": "+ this.getName().concat(" "+this.getLastName());
	}
}
