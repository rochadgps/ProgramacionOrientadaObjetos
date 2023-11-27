package ar.edu.unju.escmi.poo.dominio;

public class Linea2 {

	public static final double LIMITE_CREDITO = 500000;
	public static final int LIMITE_CUOTAS = 12;
	public static final int INTERES = 20;
	
	public Linea2() {
		
	}

	public static double getLimiteCredito() {
		return LIMITE_CREDITO;
	}

	public static int getLimiteCuotas() {
		return LIMITE_CUOTAS;
	}

	public static int getInteres() {
		return INTERES;
	}
}
