package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	// Estatico para que funcione en las funciones
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int eleccion;
		double num1, num2;
		
		eleccion = menu();
		
				
				// Pedir los números al usuario
				num1 = pideNumero();
				num2 = pideNumero();
				
				Operaciones op = new Operaciones(num1, num2);
				
				switch(eleccion) {
				case 1: op.suma();
				}
		
		
		sc.close();

	}
	
	static int menu() {
		
		int eleccion;
		
		System.out.println("Seleccione la operación que desea realizar:");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Maximo");
		System.out.println("6.Minimo");
		System.out.println("0.Salir");
		
		eleccion = sc.nextInt();
		
		return eleccion;
	}
	
	static double pideNumero() {
		double num = 0;
		boolean seguir = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Introduzca un número");
				num = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido es decimal");
			} finally {
				sc.nextLine();
			}
			
		}while(seguir);
		
		sc.close();
		return num;
	}


}
