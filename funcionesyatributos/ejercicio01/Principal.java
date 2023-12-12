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
		
		if (eleccion != 0) {

		// Pedir los números al usuario
		num1 = pideNumero();
		num2 = pideNumero();

		Operaciones op = new Operaciones(num1, num2);

		switch (eleccion) {
		case 1 -> System.out.println("La suma resulta: " + op.suma());
		case 2 -> System.out.println("La resta resulta: " + op.resta());
		case 3 -> System.out.println("La multiplicacion resulta: " + op.multiplicacion());
		case 4 -> System.out.println("La division resulta: " + op.division());
		case 5 -> System.out.println("El maximo resulta: " + op.maximo());
		case 6 -> System.out.println("El minimo resulta: " + op.minimo());
		}
		
		} else {
			System.out.println("Saliendo...");
		}

		sc.close();

	}

	static int menu() {

		int eleccion;

		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Maximo");
		System.out.println("6.Minimo");
		System.out.println("0.Salir");
		
		do {
			System.out.println("Seleccione la operación que desea realizar:");
			
			eleccion = sc.nextInt();
		}while (eleccion > 6 || eleccion < 0 ) ;
		
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

		} while (seguir);

		return num;
	}

}
