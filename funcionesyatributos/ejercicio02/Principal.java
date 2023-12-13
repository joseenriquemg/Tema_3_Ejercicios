package ejercicio02;

import java.util.Scanner;

public class Principal {
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Variables para pedir los numeros y elccion al usuario
		int opcion;
		double ancho;
		double alto;
		//Pedimos los valores al usuario
		ancho = pideAncho();
		alto = pideAlto();
		//Sacamos de aqui la opcion elegida del menu 
		opcion = menu();
		//Scanner para los numeros del usuario 
		Rectangulo rectangulo = new Rectangulo(alto, ancho);
		//Distintos resultados segun la opcuion elegida por el usuario
		switch (opcion) {
		case 1:
			System.out.println("El resultado es: " + rectangulo.perimetro());
			break;
		case 2:
			System.out.println("El resultado es: " + rectangulo.area());
			break;
		case 0:
			System.out.println("");
			break;
		}
		//Cerramos el Scanner 
		sc.close();
	}
	//Estatico para el menu
	public static int menu() {
		//Variable para recoger la opcion del usuario 
		int opcion;
		//Creamos un do while para que la opcion seleccionada sea correcta
		do {
			//Menu ofrecido al usuario 
			System.out.println("El elige una opción");
			System.out.println("1. Perímetro");
			System.out.println("2. Área");
			System.out.println("0. Salir");
			//Recoger numero del usuario 
			opcion = sc.nextInt();
		} while (opcion < 0 || opcion > 2);
		//Devuelve el numero 
		return opcion;
	}
	//Estatico para pedir el ancho
	public static double pideAncho() {
		//Variable para recoger el ancho  
		double ancho = 0;
		//Pedimos el numero al usuario
		System.out.println("Introduzca el ancho");
		//Leemos del teclado el numero
		ancho = sc.nextDouble();
		//Devolvemos el numero 
		return ancho;
	}
	//Estatico para pedir el alto
	public static double pideAlto() {
		//Variable para recoger el alto 
		double alto = 0;
		//Pedimos el numero al usuario 
		System.out.println("Introduzca el alto");	
		//Leemos del teclado el numero
		alto = sc.nextDouble();
		//Devolvemos el numero 
		return alto;
	}
}
