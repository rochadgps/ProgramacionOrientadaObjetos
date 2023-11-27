package TP2;

import java.util.Scanner;

public class Ejercicio11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    byte r,l;
	    int d, h=0, y=0,o=0;
		String arreglo[];
        arreglo = new String[5];
  
        Scanner sc = new Scanner(System.in) ; 
            for(d=0;d<5;d++)
            {
                System.out.println("Ingrese nombre: ");
                arreglo[h] = sc.next();
                h++;
            }
        while(y<5)
        {
            System.out.println(arreglo[y]);
            y++;
        }
        System.out.println("hay  "+arreglo.length+" personas en el arreglo");





            System.out.println("ingrese la posocion del vector que desee borrar");
            r = sc.nextByte();

        l = r;

        do{
           arreglo[l] = arreglo [l+1];
            l++;


        }while(l<4);
           
        while(o<4)
        {
            System.out.println(arreglo[o]);
            o++;
        }

    }
	}


