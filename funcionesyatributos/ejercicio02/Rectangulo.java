package ejercicio02;

public class Rectangulo {
	double alto;
	double ancho;

	// Constructor sin parámetros
	public Rectangulo() {
		this.alto = 0;
		this.ancho = 0;
	}

	// Constructor con parámetros
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	// Método para calcular el perímetro
	double perimetro() {
		return 2 * (alto + ancho);
	}

	// Método para calcular el área
	double area() {
		return alto * ancho;
	}
}