package TP2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1,nota2,nota3,nota4,nota5,prom;
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresar primer nota");
		nota1=sc.nextFloat();
		System.out.println("ingresar segunda nota");
		nota2=sc.nextFloat();
		System.out.println("ingresar tercer nota");
		nota3=sc.nextFloat();
		System.out.println("ingresar cuarta nota");
		nota4=sc.nextFloat();
		System.out.println("ingresar quinta nota");
		nota5=sc.nextFloat();
		
		prom=(nota1+nota2+nota3+nota4+nota5)/5;
		
		System.out.println("el promedio es= "+prom);
		sc.close();
	}

}
