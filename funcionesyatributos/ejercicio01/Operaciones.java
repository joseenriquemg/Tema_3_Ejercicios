package ejercicio01;
public class Operaciones {
	 // Atributos de la clase
   double num1;
   double num2;
   // Constructor por defecto
   public Operaciones() {
       super(); // Llamada al constructor de la clase padre (Object en este caso)
   }
   // Constructor con parámetros
   public Operaciones(double num1, double num2) {
       super(); // Llamada al constructor de la clase padre (Object en este caso)
       this.num1 = num1;
       this.num2 = num2;
   }
   // Método para realizar la operación de suma
   public double suma() {
       return num1 + num2;
   }
   // Método para realizar la operación de resta
   public double resta() {
       return num1 - num2;
   }
   // Método para realizar la operación de multiplicación
   public double multiplicación() {
       return num1 * num2;
   }
   // Método para realizar la operación de división
   public double división() {
       double resultado = 0;
       // Verificar si el denominador (num2) es diferente de cero antes de realizar la división
       if (num2 != 0) {
           resultado = num1 / num2;
       }
       return resultado;
   }
   // Método para encontrar el valor mínimo entre los dos números
   public double minimo() {
       return Math.min(num2, num1);
   }
   // Método para encontrar el valor máximo entre los dos números
   public double maximo() {
       return Math.max(num2, num1);
   }
}
