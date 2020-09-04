package co.com.prueba_tecnica.util;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class TestValidarCadenas {

	@Test
	public void validarCadenaSiEsDigito() {
		String numero = "45874";
		boolean resultadoEsperado = true;
		boolean resultadoObtenido;
		
		resultadoObtenido = ValidarCadena.esDigito(numero);
		
		assertThat(resultadoEsperado).isEqualTo(resultadoObtenido);
	}

	@Test
	public void validarCadenaSiNoEsDigito() {
		String cadena = "7Hola453";
		boolean resultadoEsperado = false;
		boolean resultadoObtenido;
		
		resultadoObtenido = ValidarCadena.esDigito(cadena);
		
		assertThat(resultadoEsperado).isEqualTo(resultadoObtenido);
	}
}


