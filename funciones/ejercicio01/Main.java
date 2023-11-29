package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Creamos la variable que vamos a utiizar para recoger el número.
		int numero;
		
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		
		try {
		//Pedimos el número al usuario y lo leemos del teclado.
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();
		Eco.eco(numero);

    } catch (java.util.InputMismatchException e) {
        System.out.println("Por favor, introduce un número entero válido.");
    }

	}

}
