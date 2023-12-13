package ejercicio04;

class Cilindro {
		double radioBase;
		double altura;
	
		// Constructores
		public Cilindro() {
			this.radioBase = 0.0;
			this.altura = 0.0;
		}
	
		public Cilindro(double radio, double h) {
			this.radioBase = radio;
			this.altura = h;
		}
	
		// Métodos para calcular volumen y área
		public double volumen() {
			return Math.PI * Math.pow(radioBase, 2) * altura;
		}
	
		public double area() {
			return 2 * Math.PI * radioBase * (altura + radioBase);
		}
	
		// Getters y setters
		public double getRadioBase() {
			return radioBase;
		}
	
		public void setRadioBase(double radio) {
			radioBase = radio;
		}
	
		public double getAltura() {
			return altura;
		}
	
		public void setAltura(double h) {
			altura = h;
		}
	}
	
	