package ar.edu.unju.escmi.poo.dominio;

public class Linea1 {
	public static final double LIMITE_CREDITO = 200000;
	public static final int LIMITE_CUOTAS = 24;
	
	public Linea1() {
		
	}

	public static double getLimiteCredito() {
		return LIMITE_CREDITO;
	}

	public static int getLimiteCuotas() {
		return LIMITE_CUOTAS;
	}
}
