package ejercicio04;

public class letraVocal {

	public static boolean letraVocal (String caracter) {

		boolean resultado = false;

		switch (caracter.toLowerCase()) {

		case "a", "e", "i", "o", "u":
			resultado = true;
		}
		return resultado;
	}
}
