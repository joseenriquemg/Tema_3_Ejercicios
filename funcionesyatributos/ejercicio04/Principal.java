package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
				// Solicitar al usuario que ingrese el radio y la altura
				double radio = pideRadioBase();
				double h = pideAltura();
		
				// Crear un objeto Cilindro
				Cilindro cilindro = new Cilindro(radio, h);
		
				// Menú de opciones
				int opcion;
				do {
					opcion = menu();
					switch (opcion) {
					case 1:
						System.out.println("Volumen del cilindro: " + cilindro.volumen());
						break;
					case 2:
						System.out.println("Área del cilindro: " + cilindro.area());
						break;
					case 0:
						System.out.println("Saliendo...");
						break;
					default:
						System.out.println("Ingrese un valor correcto");
					}
				} while (opcion < 0 || opcion > 2);
			}
		
			public static int menu() {
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. Volumen");
				System.out.println("2. Área");
				System.out.println("0. Salir");
				System.out.print("Ingrese su opción: ");
				int opcion = scanner.nextInt();
				return opcion;
			}
		
			public static double pideRadioBase() {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Ingrese el radio de la base: ");
				return scanner.nextDouble();
			}
		
			public static double pideAltura() {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Ingrese la altura del cilindro: ");
				return scanner.nextDouble();
		}
	

	}

