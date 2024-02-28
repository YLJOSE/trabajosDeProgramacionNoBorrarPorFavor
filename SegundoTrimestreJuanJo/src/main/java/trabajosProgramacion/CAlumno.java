package trabajosProgramacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class CAlumno extends CPersona {
	private CAsignatura paoAsignatura[] = new CAsignatura[3];
	private ArrayList<Integer> paiNota = new ArrayList<>();

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
	public CAlumno(String psNombre, String psApellido1, int año, int mes, int dia, int piDni, CAsignatura paoAsignatura,
			int paiNota) {
		super(psNombre, psApellido1, año, mes, dia, piDni);
		this.paoAsignatura[0] = paoAsignatura;
		this.paiNota.add(paiNota);
	}

	/**
	 * @return el paoAsignatura
	 */
	public CAsignatura[] getPaoAsignatura() {
		return paoAsignatura;
	}

	/**
	 * @param paoAsignatura el paoAsignatura a establecer
	 */
	public void setPaoAsignatura(CAsignatura[] paoAsignatura) {
		this.paoAsignatura = paoAsignatura;
	}

	/**
	 * @return el paiNota
	 */
	public ArrayList<Integer> getPaiNota() {
		return paiNota;
	}

	/**
	 * @param paiNota el paiNota a establecer
	 */
	public void setPaiNota(ArrayList<Integer> paiNota) {
		this.paiNota = paiNota;
	}

	@Override
	public String toString() {
		return "CAlumno [paoAsignatura=" + Arrays.toString(paoAsignatura) + ", paiNota=" + paiNota + ", getPsNombre()="
				+ getPsNombre() + ", getPsApellido1()=" + getPsApellido1() + ", getPdNacimiento()=" + getPdNacimiento()
				+ ", getPiDni()=" + getPiDni() + "]";
	}

}
