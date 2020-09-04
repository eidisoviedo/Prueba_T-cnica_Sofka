package co.com.prueba_tecnica.util;

public class ValidarCadena {

	private ValidarCadena() {}

	public static boolean esDigito(String cadena) {

		boolean bandera = false;

		for (int j = 0; j < cadena.length(); j++) {
			if (Character.isDigit(cadena.charAt(j))) {
				bandera = true;
			} else {
				bandera = false;
				break;
			}
		}
		return bandera;
	}
}
