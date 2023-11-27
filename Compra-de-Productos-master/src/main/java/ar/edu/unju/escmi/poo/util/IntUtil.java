package ar.edu.unju.escmi.poo.util;

import java.util.Scanner;
public class IntUtil {
	public static int pedirInt() throws Exception {
		Scanner sc = new Scanner(System.in);
		int respuesta2 ;
		try {
			respuesta2 = sc.nextInt();
			
		}catch(Exception ex) {
			throw ex;
		}
		return respuesta2;
	}
	
}
