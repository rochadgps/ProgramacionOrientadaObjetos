package ar.edu.unju.escmi.poo.dominio;

import java.util.List;

public class Plan {
	private String titular;
	private int cantCuotas;
	private double montoTotal;
	private double montoPorCuota;
	private List<Carrito> carritos;
	private TarjetaDeCredito tarjeta;
	public Plan() {
		
	}

	public Plan(String titular, int cantCuotas, double montoTotal, double montoPorCuota, List<Carrito> carritos,
			TarjetaDeCredito tarjeta) {
		super();
		this.titular = titular;
		this.cantCuotas = cantCuotas;
		this.montoTotal = montoTotal;
		this.montoPorCuota = montoPorCuota;
		this.carritos = carritos;
		this.tarjeta = tarjeta;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}

	public List<Carrito> getCarritos() {
		return carritos;
	}

	public void setCarritos(List<Carrito> carritos) {
		this.carritos = carritos;
	}



	public TarjetaDeCredito getTarjeta() {
		return tarjeta;
	}



	public void setTarjeta(TarjetaDeCredito tarjeta) {
		this.tarjeta = tarjeta;
	}



	public int getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public double getMontoPorCuota() {
		return montoPorCuota;
	}

	public void setMontoPorCuota(double montoPorCuota) {
		this.montoPorCuota = montoPorCuota;
	}







	@Override
	public String toString() {
		return "Plan [titular=" + titular + ", cantCuotas=" + cantCuotas + ", montoTotal=" + montoTotal
				+ ", montoPorCuota=" + montoPorCuota + ", carritos=" + carritos + ", tarjeta=" + tarjeta + "]";
	}



	



	

	
	
}
