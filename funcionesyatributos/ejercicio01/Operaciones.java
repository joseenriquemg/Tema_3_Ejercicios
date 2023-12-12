package ejercicio01;

public class Operaciones {

	double num1;
	double num2;

	public Operaciones() {
		super();

	}

	public Operaciones(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double suma() {
		return num1 + num2;
	}

	public double resta() {
		return num1 - num2;
	}

	public double multiplicacion() {
		return num1 * num2;
	}

	public double division() {
		double resultado = 0;
		if (num2 != 0) {
			resultado = num1 / num2;
		}
		return resultado;

	}

	public double minimo() {
		return Math.min(num2, num1);
	}

	public double maximo() {
		return Math.max(num2, num1);
	}

}
