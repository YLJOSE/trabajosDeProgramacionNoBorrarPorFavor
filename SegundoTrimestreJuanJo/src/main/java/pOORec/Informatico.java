package pOORec;

public class Informatico extends Persona {
	private String especialidad;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param id
	 * @param especialidad
	 */
	public Informatico(String nombre, String apellidos, int id, String especialidad) {
		super(nombre, apellidos, id);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Informatico [especialidad=" + especialidad + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getId()=" + getId() + "]";
	}

}
