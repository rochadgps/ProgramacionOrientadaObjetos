package TP2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte radio;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del radio: ");
		
		radio = sc.nextByte();
		
		area =  Math.PI * Math.pow(radio,2);
		
		System.out.println("El area del circulo : "+area);
		sc.close();
	}

}
