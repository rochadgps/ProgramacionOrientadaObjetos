package TP2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		boolean band;
		band=false;

		while (band == false) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		a=sc.nextInt();
		sc.close();
		switch (a){
		case 1:
			System.out.println("1 es enero");
			band=true;
		break;

		case 2:
			System.out.println("2 es febrero");
			band=true;
		break;

		case 3:
			System.out.println("3 es marzo");
			band=true;
		break;

		case 4:
			System.out.println("4 es abril");
			band=true;
		break;

		case 5:
			System.out.println("5 es mayo");
			band=true;
		break;

		case 6:
			System.out.println("6 es junio");
			band=true;
		break;

		case 7:
			System.out.println("7 es julio");
			band=true;
		break;
		case 8:
			System.out.println("8 es agosto");
			band=true;
		break;
		case 9:
			System.out.println("9 es septiembre");
			band=true;
		break;
		case 10:
			System.out.println("10 es octubre");
			band=true;
		break;
		case 11:
			System.out.println("11 es noviebre");
			band=true;
		break;
		case 12:
			System.out.println("12 es diciembre");
			band=true;
		break;
		default:
			System.out.println("ese numero no corresponde a ningun mes");
			break;
		}




		}
	}

}
