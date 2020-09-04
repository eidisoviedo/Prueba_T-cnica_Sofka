package co.com.prueba_tecnica.gestion;

import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DecimalFormat;

import co.com.prueba_tecnica.pasaje.CotizadorDeVuelos;
import co.com.prueba_tecnica.pasaje.PrecioVuelo;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Inicio {

	public static void main(String[] args) {

		int opcion = -1;

		do {
			try {
				opcion = Integer.parseInt(
						showInputDialog(null, "Cotizador de vuelos" + "\n\n1. Cotizar vuelo " + "\n0. Salir \n", "Menú",
								INFORMATION_MESSAGE));

				switch (opcion) {
				case 0:
					showMessageDialog(null, "Hasta luego ", "Hasta luego", INFORMATION_MESSAGE);
					break;
				case 1:
					cotizarVuelo();
					break;

				default:
					showMessageDialog(null, "Debe ingresar una opción válida ", "Error", ERROR_MESSAGE);
					break;
				}
			} catch (NumberFormatException e) {
				showMessageDialog(null, "Debe ingresar una opción válida ", "Error", ERROR_MESSAGE);
			}

		} while (opcion != 0);
	}

	private static void cotizarVuelo() {
		DecimalFormat formato = new DecimalFormat("#,###.###");
		PrecioVuelo precio = new CotizadorDeVuelos().cotizar();
		showMessageDialog(null,
				"\nSu vuelo tiene un valor de $" + formato.format(precio.calcularPrecioVuelo())
						+ "\nDescuento aplicado: $" + formato.format(precio.getDescuento()),
				"Precio de vuelo", INFORMATION_MESSAGE);
	}
}
