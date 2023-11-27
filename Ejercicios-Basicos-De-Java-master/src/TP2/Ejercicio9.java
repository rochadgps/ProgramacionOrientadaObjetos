package TP2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e1, e2, e3, e4, e5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la 1 edad: ");
		
		e1 = sc.nextInt();
		
		if(e1>=1 && e1 < 12) {
			System.out.println("Es un niño");
		} else 
			if (e1 >=13 && e1 <= 20){
		    System.out.println("Es un joven");
		} else
			if (e1 >=21 && e1 <= 100) {
		    System.out.println("Es un adulto");
		} else{
		    System.out.println("Edad no permitida");
		}
		System.out.println("Ingrese la 2 edad: ");
		e2 = sc.nextInt();
		if(e2>=1 && e2 < 12) {
			System.out.println("Es un niño");
		} else 
			if (e2 >=13 && e2 <= 20){
		    System.out.println("Es un joven");
		} else
			if (e2 >=21 && e2 <= 100) {
		    System.out.println("Es un adulto");
		} else{
		    System.out.println("Edad no permitida");
		}
		System.out.println("Ingrese la 3 edad: ");
		e3 = sc.nextInt();
		if(e3>=1 && e3 < 12) {
			System.out.println("Es un niño");
		} else 
			if (e3 >=13 && e3 <= 20){
		    System.out.println("Es un joven");
		} else
			if (e3 >=21 && e3 <= 100) {
		    System.out.println("Es un adulto");
		} else{
		    System.out.println("Edad no permitida");
		}
		System.out.println("Ingrese la 4 edad: ");
		e4 = sc.nextInt();
		if(e4>=1 && e4 < 12) {
			System.out.println("Es un niño");
		} else 
			if (e4 >=13 && e4 <= 20){
		    System.out.println("Es un joven");
		} else
			if (e4 >=21 && e4 <= 100) {
		    System.out.println("Es un adulto");
		} else{
		    System.out.println("Edad no permitida");
		}
		System.out.println("Ingrese la 5 edad: ");
		e5 = sc.nextInt();
		if(e5>=1 && e5 < 12) {
			System.out.println("Es un niño");
		} else 
			if (e5 >=13 && e5 <= 20){
		    System.out.println("Es un joven");
		} else
			if (e5 >=21 && e5 <= 100) {
		    System.out.println("Es un adulto");
		} else{
		    System.out.println("Edad no permitida");
		}
		
		sc.close();
	}

}
