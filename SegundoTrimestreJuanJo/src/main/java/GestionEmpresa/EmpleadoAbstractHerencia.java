package GestionEmpresa;

import java.time.LocalDate;

public abstract class EmpleadoAbstractHerencia {
	private String name;
	private String lastName;
	private int years;
	private LocalDate dateAdmission;

	/**
	 * @return the name and lastName
	 */
	public String getNamecomplet() {
		return this.getClass().getSimpleName() + name.concat(lastName);
	}

	/**
	 * @param name
	 * @param lastName
	 * @param years
	 * @param dateAdmission
	 */
	public EmpleadoAbstractHerencia(String name, String lastName, int years, LocalDate dateAdmission) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.years = years;
		this.dateAdmission = dateAdmission;
	}

	public abstract double calcSalary();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the years
	 */
	public int getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(int years) {
		this.years = years;
	}

	/**
	 * @return the dateAdmission
	 */
	public LocalDate getDateAdmission() {
		return dateAdmission;
	}

	/**
	 * @param dateAdmission the dateAdmission to set
	 */
	public void setDateAdmission(LocalDate dateAdmission) {
		this.dateAdmission = dateAdmission;
	}

}
