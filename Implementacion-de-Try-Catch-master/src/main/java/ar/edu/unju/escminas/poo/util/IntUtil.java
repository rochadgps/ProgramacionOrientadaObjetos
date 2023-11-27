package ar.edu.unju.escminas.poo.util;

import java.util.InputMismatchException;
import java.util.Scanner;
public class IntUtil {
	public static int pedirInt() throws Exception {
		Scanner sc = new Scanner(System.in);
		int respuesta2 ;
		try {
			respuesta2 = sc.nextInt();
			
		}catch(InputMismatchException ex) {
			throw ex;
		}
		return respuesta2;
	}
	
}
