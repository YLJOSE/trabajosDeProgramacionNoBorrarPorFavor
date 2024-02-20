package pOORec;

public class Alumno extends Informatico {

	private String centro;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param id
	 * @param especialidad
	 * @param centro
	 */
	public Alumno(String nombre, String apellidos, int id, String especialidad, String centro) {
		super(nombre, apellidos, id, especialidad);
		this.centro = centro;
	}

	/**
	 * @return el centro
	 */
	public String getCentro() {
		return centro;
	}

	/**
	 * @param centro el centro a establecer
	 */
	public void setCentro(String centro) {
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "Alumno [centro=" + centro + ", getEspecialidad()=" + getEspecialidad() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getId()=" + getId() + "]";
	}

}
