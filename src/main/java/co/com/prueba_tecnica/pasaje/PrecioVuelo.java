package co.com.prueba_tecnica.pasaje;

import static co.com.prueba_tecnica.util.Constantes.PRECIO_POR_KILOMETRO;

public class PrecioVuelo {

	private int estancia;
	private int distanciaVuelo;
	private float descuento;

	public PrecioVuelo() {}

	public PrecioVuelo(int estancia, int distanciaVuelo) {
		this.estancia = estancia;
		this.distanciaVuelo = distanciaVuelo;
	}

	private void calcularDescuento() {

		if (distanciaVuelo > 1000 && estancia > 7) {

			descuento = 0.3f * (PRECIO_POR_KILOMETRO * distanciaVuelo);
		}
	}

	public float calcularPrecioVuelo() {

		calcularDescuento();

		if (descuento > 0) {
			return (PRECIO_POR_KILOMETRO * distanciaVuelo) - descuento;
		} else {
			return PRECIO_POR_KILOMETRO * distanciaVuelo;
		}
	}

	public int getEstancia() {
		return estancia;
	}

	public void setEstancia(int estancia) {
		this.estancia = estancia;
	}

	public int getDistanciaVuelo() {
		return distanciaVuelo;
	}

	public void setDistanciaVuelo(int distanciaVuelo) {
		this.distanciaVuelo = distanciaVuelo;
	}

	public float getDescuento() {
		return descuento;
	}
}
