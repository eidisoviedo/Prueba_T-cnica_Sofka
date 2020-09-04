package co.com.prueba_tecnica.util;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class TestConstantes {


	@Test
	public void contantePrecioPorKilometro() {
		float precioPorKilometro = 35;
		
		float obtenido = Constantes.PRECIO_POR_KILOMETRO;

		assertThat(precioPorKilometro).isEqualTo(obtenido);
	}

	@Test
	public void contanteDistancia() {
		String distancia = "Distancia:";
		
		String obtenido = Constantes.DISTANCIA;
		
		assertThat(distancia).isEqualTo(obtenido);
	}

	@Test
	public void contanteDiaDeEstancia() {
		String diasDeEstancia = "Días de estancia";
		
		String obtenido = Constantes.DIAS_DE_ESTANCIA;
		
		assertThat(diasDeEstancia).isEqualTo(obtenido);
	}
}


