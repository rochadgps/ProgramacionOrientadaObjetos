package TP2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int an;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el a�o para determinar si es bisiesto: ");
		an = sc.nextInt();
		
		if ((an % 4 == 0) && (an % 100 != 0) || ( an % 400 == 0)) {
            System.out.println("El a�o " + an + " es bisiesto");
        } 
		
		else {
            System.out.println("El a�o " + an + " no es bisiesto");
        }
		
		sc.close();
	}

}
