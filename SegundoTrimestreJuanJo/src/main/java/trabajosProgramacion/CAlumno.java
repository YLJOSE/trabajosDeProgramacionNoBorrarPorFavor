package trabajosProgramacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class CAlumno extends CPersona {
	private ArrayList<CAsignatura> paoAsignatura = new ArrayList<>();
	private ArrayList<Double> paiNota = new ArrayList<>();

	/**
	 * @param psNombre
	 * @param psApellido1
	 * @param año
	 * @param mes
	 * @param dia
	 * @param piDni
	 * @param paoAsignatura
	 * @param paiNota
	 */
	public CAlumno(String psNombre, String psApellido1, int año, int mes, int dia, int piDni,
			ArrayList<CAsignatura> paoAsignatura, double paiNota) {
		super(psNombre, psApellido1, año, mes, dia, piDni);
		this.paoAsignatura = paoAsignatura;
		this.paiNota.add(paiNota);
	}

	/**
	 * @return el paoAsignatura
	 */
	public ArrayList<CAsignatura> getPaoAsignatura() {
		return paoAsignatura;
	}

	/**
	 * @param paoAsignatura el paoAsignatura a establecer
	 */
	public void setPaoAsignatura(ArrayList<CAsignatura> paoAsignatura) {
		this.paoAsignatura = paoAsignatura;
	}

	/**
	 * @return el paiNota
	 */
	public ArrayList<Double> getPaiNota() {
		return paiNota;
	}

	/**
	 * @param paiNota el paiNota a establecer
	 */
	public void setPaiNota(ArrayList<Double> paiNota) {
		this.paiNota = paiNota;
	}

	@Override
	public String toString() {
		return "CAlumno [Asignatura:" + paoAsignatura + ",\n\t paiNota:" + paiNota + ",\n\t gNombre:"
				+ getPsNombre() + ",\n\t Apellido1:" + getPsApellido1() + ",\n\t Nacimiento:"
				+ getPdNacimiento() + "]";
	}

}
