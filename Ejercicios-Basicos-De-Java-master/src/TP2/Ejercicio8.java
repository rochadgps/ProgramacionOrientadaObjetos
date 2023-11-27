package TP2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,cont=0,result;
		Scanner sc = new Scanner(System.in);
		
		while(cont!=5) {
		System.out.println("ingresar numero");
		num=sc.nextInt();
		result=num%2;
		if(result==1) {
			System.out.println("el numero es impar");
		}else {
			System.out.println("el numero es par");
		}
		cont++;
		}
		sc.close();
	}

}
