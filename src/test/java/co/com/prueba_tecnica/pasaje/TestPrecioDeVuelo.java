package co.com.prueba_tecnica.pasaje;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static co.com.prueba_tecnica.util.Constantes.PRECIO_POR_KILOMETRO;

public class TestPrecioDeVuelo {

	@Test
	public void precioSinDescuentoTest() {
		int distancia = 500;
		int estancia = 5;
		float precioEsperado = PRECIO_POR_KILOMETRO * distancia;
		float precioObtenido;	
		PrecioVuelo precio = new PrecioVuelo();
		precio.setDistanciaVuelo(distancia);
		precio.setEstancia(estancia);
		
		precioObtenido = precio.calcularPrecioVuelo();
		
		assertThat(precioEsperado).isEqualTo(precioObtenido);
	}

	@Test
	public void precioConDescuentoTest() {
		int distancia = 3000;
		int estancia = 15;
		float precioEsperado =  (PRECIO_POR_KILOMETRO * distancia) - (0.3f * (PRECIO_POR_KILOMETRO * distancia));
		float precioObtenido;	
		PrecioVuelo precio = new PrecioVuelo();
		precio.setDistanciaVuelo(distancia);
		precio.setEstancia(estancia);
		
		precioObtenido = precio.calcularPrecioVuelo();
		
		assertThat(precioEsperado).isEqualTo(precioObtenido);
	}

	@Test
	public void descuentoTest() {
		int distancia = 2000;
		int estancia = 8;
		float descuentoEsperado = 0.3f * (PRECIO_POR_KILOMETRO * distancia);
		float descuentoObtenido;
				
		PrecioVuelo precio = new PrecioVuelo();
		precio.setDistanciaVuelo(distancia);
		precio.setEstancia(estancia);
		precio.calcularPrecioVuelo();
		
		descuentoObtenido = precio.getDescuento();
		
		assertThat(descuentoEsperado).isEqualTo(descuentoObtenido);	
	}

	@Test
	public void descuentoCeroTest() {
		int distancia = 500;
		int estancia = 5;
		float descuentoEsperado = 0;
		float descuentoObtenido;
				
		PrecioVuelo precio = new PrecioVuelo();
		precio.setDistanciaVuelo(distancia);
		precio.setEstancia(estancia);
		precio.calcularPrecioVuelo();
		
		descuentoObtenido = precio.getDescuento();
		
		assertThat(descuentoEsperado).isEqualTo(descuentoObtenido);	
	}

}


