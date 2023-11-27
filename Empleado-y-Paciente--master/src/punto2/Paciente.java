package punto2;

public class Paciente implements Comparable<Paciente> {
	private long dni;
	private String nombre;
	private String apellido;
	private int nroHistoriaClinica;
	private String obraSocial;

	public Paciente() {
		super();
	}


	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNroHistoriaClinica() {
		return nroHistoriaClinica;
	}

	public void setNroHistoriaClinica(int nroHistoriaClinica) {
		this.nroHistoriaClinica = nroHistoriaClinica;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}


	@Override
	public int compareTo(Paciente o) {
		if (this.nroHistoriaClinica < o.getNroHistoriaClinica()) {
			return -1;
		} else if (this.nroHistoriaClinica > o.getNroHistoriaClinica()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Paciente (dni:" + dni + ", nombre:" + nombre + ", apellido:" + apellido + ", nroHistoriaClinica:"
				+ nroHistoriaClinica + ", obraSocial:" + obraSocial + ")";
	}
}
