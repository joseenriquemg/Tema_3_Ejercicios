package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Llamada a la función para obtener el radio
        double radio = pideRadio();
        

        // Creación del objeto Circulo
        Circulo circulo = new Circulo(radio);
        //Variable para recoger el la opcion elegida
        int opcion;
        //Creamos un do while para expresar el resultado
        do {
            opcion = menu();
            

            switch (opcion) {
                case 1:
                    // Calcular y mostrar la circunferencia
                    System.out.println("Circunferencia: " + circulo.circunferencia());
                    break;
                case 2:
                    // Calcular y mostrar el área
                    System.out.println("Área: " + circulo.area());
                    break;
                case 0:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion < 0 || opcion > 2);
        //Cerramos el Scanner
        scanner.close();
    }
    // Función para mostrar el menú y obtener la opción seleccionada
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
        return scanner.nextInt();
    }

    // Función para pedir el radio al usuario
    public static double pideRadio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        return scanner.nextDouble();
    }
}
