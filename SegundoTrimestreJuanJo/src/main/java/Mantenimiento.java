package pruebas33;

import java.time.LocalDate;

public class Mantenimiento extends EmpleadoAbstractHerencia {
	private double totalHorasMes;

	/**
	 * @param name
	 * @param lastName
	 * @param years
	 * @param dateAdmission
	 * @param totalHorasMes
	 */
	public Mantenimiento(String name, String lastName, int years, LocalDate dateAdmission, double totalHorasMes) {
		super(name, lastName, years, dateAdmission);
		this.totalHorasMes = totalHorasMes;
	}

	@Override
	public double calcSalary() {
		return totalHorasMes * 5;
	}

	@Override
	public String getNamecomplet() {
		return this.getClass().getSimpleName() +": "+ this.getName().concat(" "+this.getLastName());
	}
}
