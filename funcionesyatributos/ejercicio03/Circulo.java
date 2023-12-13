package ejercicio03;

public class Circulo {
	    double radio;

	    // Constructor sin parámetros
	    public Circulo() {
	        this.radio = 0;
	    }

	    // Constructor con parámetros
	    public Circulo(double radio) {
	        this.radio = radio;
	    }

	    // Método para calcular la circunferencia
	    public double circunferencia() {
	        return 2 * Math.PI * radio;
	    }

	    // Método para calcular el área
	    public double area() {
	        return Math.PI * Math.pow(radio, 2);
	    }
	}



