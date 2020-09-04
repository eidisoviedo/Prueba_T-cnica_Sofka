package co.com.prueba_tecnica.pasaje;

import static javax.swing.JOptionPane.DEFAULT_OPTION;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import co.com.prueba_tecnica.front.VentanaCotizador;

import static co.com.prueba_tecnica.util.ValidarCadena.esDigito;

public class CotizadorDeVuelos extends VentanaCotizador {

	private PrecioVuelo valorPasaje;

	public PrecioVuelo cotizar() {

		String distancia;
		String estancia;

		do {
			showConfirmDialog(null, getVentana(), "Cotizador", DEFAULT_OPTION, PLAIN_MESSAGE);

			distancia = jTxtDistancia.getText().trim();
			estancia = jTxtEstancia.getText().trim();

			if ((!distancia.isEmpty() && !estancia.isEmpty()) && (esDigito(distancia) && esDigito(estancia))) {

				valorPasaje = new PrecioVuelo(Integer.parseInt(estancia), Integer.parseInt(distancia));
			} else {

				showMessageDialog(null, "Debe ingresar valores validos ", "Error", ERROR_MESSAGE);
			}

		} while (distancia.isEmpty() || estancia.isEmpty());

		return valorPasaje;
	}
}