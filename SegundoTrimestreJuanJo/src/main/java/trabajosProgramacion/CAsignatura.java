package trabajosProgramacion;

public class CAsignatura {
	private int piCodigo;
	private String psNombre;
	private CProfesor profesorNuevo;
	private int piHorasSemanales;

	/**
	 * @param piCodigo
	 * @param psNombre
	 * @param profesorNuevo
	 * @param piHorasSemanales
	 */
	public CAsignatura(int piCodigo, String psNombre, CProfesor profesorNuevo, int piHorasSemanales) {
		super();
		this.piCodigo = piCodigo;
		this.psNombre = psNombre;
		this.profesorNuevo = profesorNuevo;
		this.piHorasSemanales = piHorasSemanales;
	}

	/**
	 * @return el piCodigo
	 */
	public int getPiCodigo() {
		return piCodigo;
	}

	/**
	 * @param piCodigo el piCodigo a establecer
	 */
	public void setPiCodigo(int piCodigo) {
		this.piCodigo = piCodigo;
	}

	/**
	 * @return el psNombre
	 */
	public String getPsNombre() {
		return psNombre;
	}

	/**
	 * @param psNombre el psNombre a establecer
	 */
	public void setPsNombre(String psNombre) {
		this.psNombre = psNombre;
	}

	/**
	 * @return el profesorNuevo
	 */
	public CProfesor getProfesorNuevo() {
		return profesorNuevo;
	}

	/**
	 * @param profesorNuevo el profesorNuevo a establecer
	 */
	public void setProfesorNuevo(CProfesor profesorNuevo) {
		this.profesorNuevo = profesorNuevo;
	}

	/**
	 * @return el piHorasSemanales
	 */
	public int getPiHorasSemanales() {
		return piHorasSemanales;
	}

	/**
	 * @param piHorasSemanales el piHorasSemanales a establecer
	 */
	public void setPiHorasSemanales(int piHorasSemanales) {
		this.piHorasSemanales = piHorasSemanales;
	}

	@Override
	public String toString() {
		return "CAsignatura [Codigo=" + piCodigo + ", Nombre=" + psNombre + ", profesor=" + profesorNuevo
				+ ", HorasSemanales=" + piHorasSemanales + "]";
	}

}
