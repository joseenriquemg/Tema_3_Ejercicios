package ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable
		String caracter;
		
		boolean esVocal;
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero al usuario.
		System.out.println("Introduzca una letra:");
		caracter = sc.next();
		
		esVocal = letraVocal.letraVocal(caracter);
		
		if (esVocal) {
			System.out.println("Es una vocal.");
		}else {
			System.out.println("No es vocal.");
		}
		
		
		
	
}

}
