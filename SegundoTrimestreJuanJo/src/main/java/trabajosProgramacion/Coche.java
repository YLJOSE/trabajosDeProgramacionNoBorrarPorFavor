package trabajosProgramacion;

import java.time.LocalDate;

public class Coche {
	private String marca;
	private String modelo;
	private String matricula;
	private boolean disponible;
	private LocalDate fechaDisponible;

	public Coche(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.fechaDisponible = null;
		this.disponible = true;
	}

	public void alquilarCoche(Coche coche, int nDiasAlquiler) {
		if (this.disponible) {
			System.out.println("\nCOCHE ALQUILADO");
			this.disponible = false;
			this.fechaDisponible = LocalDate.now().plusDays(nDiasAlquiler);
		} else {
			System.out.println("\nCOCHE NO DISPONIBLE");
		}
	}

	@Override
	public String toString() {
		return "coches [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", disponible="
				+ disponible + ", fechaDisponible=" + fechaDisponible + "]";
	}

	public void devolverCoche(Coche coche) {
		if (this.disponible == false) {
			this.disponible = true;
			this.fechaDisponible = null;
		} else {
			System.out.println("\nCOCHE NO ESTÁ ALQUILADO\n");
		}
	}

	/**
	 * @return el marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return el modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo el modelo a establecer
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return el matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula el matricula a establecer
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return el disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible el disponible a establecer
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	/**
	 * @return el fechaDisponible
	 */
	public LocalDate getFechaDisponible() {
		return fechaDisponible;
	}

	/**
	 * @param fechaDisponible el fechaDisponible a establecer
	 */
	public void setFechaDisponible(LocalDate fechaDisponible) {
		this.fechaDisponible = fechaDisponible;
	}

}
