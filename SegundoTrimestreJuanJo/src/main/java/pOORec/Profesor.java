package pOORec;

public class Profesor extends Informatico {
	private String asignatura;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param id
	 * @param especialidad
	 * @param asignatura
	 */
	public Profesor(String nombre, String apellidos, int id, String especialidad, String asignatura) {
		super(nombre, apellidos, id, especialidad);
		this.asignatura = asignatura;
	}

	/**
	 * @return el asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura el asignatura a establecer
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", getEspecialidad()=" + getEspecialidad() + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getId()=" + getId() + "]";
	}

}