package TP2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int an;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el año para determinar si es bisiesto: ");
		an = sc.nextInt();
		
		if ((an % 4 == 0) && (an % 100 != 0) || ( an % 400 == 0)) {
            System.out.println("El año " + an + " es bisiesto");
        } 
		
		else {
            System.out.println("El año " + an + " no es bisiesto");
        }
		
		sc.close();
	}

}
