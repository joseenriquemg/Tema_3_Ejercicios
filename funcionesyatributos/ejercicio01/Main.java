package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Operaciones operaciones = new Operaciones();
		
		int eleccion;
		double num1, num2;
		
		do {
			menu();
			System.out.println("Elija una opción:");
			eleccion = sc.nextInt();
			
			if ( eleccion >= 0 && eleccion <= 6) {
				try {
					System.out.println("Introduzca el primer dígito: ");
					num1 = sc.nextDouble();
					System.out.println("Introduzca el segundo dígito: ");
					num2 = sc.nextDouble();
					
					switch (eleccion) {
					
					}
				}
			}
		}

	}
	
	
	private static int menu() {
		
		int eleccion;
		
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Maximo");
		System.out.println("6.Minimo");
		System.out.println("0.Salir");
	}


}
