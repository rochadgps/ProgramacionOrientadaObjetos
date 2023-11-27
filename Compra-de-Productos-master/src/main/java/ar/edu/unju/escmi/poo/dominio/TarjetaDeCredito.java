package ar.edu.unju.escmi.poo.dominio;

import java.time.LocalDate;

public class TarjetaDeCredito {
	private String nombreTitular;
	private long numTarjeta;
	private String banco;
	private LocalDate fechaExpiracion;
	private int codSeguridad;
	
	public TarjetaDeCredito() {
		
	}

	



	public TarjetaDeCredito(String nombreTitular, long numTarjeta, String banco, LocalDate fechaExpiracion,
			int codSeguridad) {
		super();
		this.nombreTitular = nombreTitular;
		this.numTarjeta = numTarjeta;
		this.banco = banco;
		this.fechaExpiracion = fechaExpiracion;
		this.codSeguridad = codSeguridad;
	}





	public String getNombreTitular() {
		return nombreTitular;
	}





	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}





	public long getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(long numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public LocalDate getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(LocalDate fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public int getCodSeguridad() {
		return codSeguridad;
	}

	public void setCodSeguridad(int codSeguridad) {
		this.codSeguridad = codSeguridad;
	}





	@Override
	public String toString() {
		return "TarjetaDeCredito [nombreTitular=" + nombreTitular + ", numTarjeta=" + numTarjeta + ", banco=" + banco
				+ ", fechaExpiracion=" + fechaExpiracion + ", codSeguridad=" + codSeguridad + "]";
	}


	
	


}
