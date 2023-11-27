package TP2;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7, b=5, c=-14;
		String mostrar;
		
		mostrar = (a>3) ? "verdadero" : "falso";
		System.out.println("a>3 es "+ mostrar);
		mostrar = (a>c) ? "verdadero" : "falso";
		System.out.println("a>c es "+ mostrar);
		mostrar = (a<c) ? "verdadero" : "falso";
		System.out.println("a<c es "+ mostrar);
		mostrar = (b<c) ? "verdadero" : "falso";
		System.out.println("b<c es "+ mostrar);
		mostrar = (b!=c) ? "verdadero" : "falso";
		System.out.println("b!=c es "+ mostrar);
		mostrar = (a == 3) ? "verdadero" : "falso";
		System.out.println("a == 3 es "+ mostrar);
		mostrar = ( a * b == 15 ) ? "verdadero" : "falso";
		System.out.println(" a * b == 15  es "+ mostrar);
		mostrar = (a * b == -30 ) ? "verdadero" : "falso";
		System.out.println("a * b == -30  "+ mostrar);
		mostrar = (c / b < a) ? "verdadero" : "falso";
		System.out.println("c / b < a es "+ mostrar);
		mostrar = (c / b == -10 ) ? "verdadero" : "falso";
		System.out.println("c / b == -10  es "+ mostrar);
		mostrar = (c / b == -4 ) ? "verdadero" : "falso";
		System.out.println("c / b == -4  es "+ mostrar);
		mostrar = (a + b + c == 5) ? "verdadero" : "falso";
		System.out.println("a + b + c == 5 es "+ mostrar);
		mostrar = ((a+b == 8 ) && (a-b == 2) ) ? "verdadero" : "falso";
		System.out.println("(a+b == 8 ) && (a-b == 2)  es "+ mostrar);
		mostrar =  (a+b == 8 ) || (a-b == 6) ? "verdadero" : "falso";
		System.out.println("a + b + c == 5 es "+ mostrar);
		mostrar =  a > 3 && b > 3 && c < 3 ? "verdadero" : "falso";
		System.out.println("a > 3 && b > 3 && c < 3 es "+ mostrar);
		mostrar =  a > 3 && b >= 3 && c < -3 ? "verdadero" : "falso";
		System.out.println("a > 3 && b >= 3 && c < -3 es "+ mostrar);
	}

}
