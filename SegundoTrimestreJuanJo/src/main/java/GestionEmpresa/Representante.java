package GestionEmpresa;

import java.time.LocalDate;

public class Representante extends EmpleadoAbstractHerencia {
	private double totalVentas;

	/**
	 * @param name
	 * @param lastName
	 * @param years
	 * @param dateAdmission
	 * @param totalVentas
	 */
	public Representante(String name, String lastName, int years, LocalDate dateAdmission, double totalVentas) {
		super(name, lastName, years, dateAdmission);
		this.totalVentas = totalVentas;
	}

	@Override
	public double calcSalary() {
		return (20 * (totalVentas / 100)) + 800;
	}

	@Override
	public String getNamecomplet() {
		return this.getClass().getSimpleName() +": "+ this.getName().concat(" "+this.getLastName());
	}

}
