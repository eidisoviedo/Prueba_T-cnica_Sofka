package co.com.prueba_tecnica.front;

import static co.com.prueba_tecnica.util.Constantes.DIAS_DE_ESTANCIA;
import static co.com.prueba_tecnica.util.Constantes.DISTANCIA;

import static org.assertj.core.api.Assertions.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Test;

public class TestVentanaCotizador {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void ventanaCotizadortestCasoExitoso() {
		JTextField jTxtDistancia = new JTextField(5);
		JTextField jTxtEstancia = new JTextField(5);
		JPanel resultadoEsperado = new JPanel();
		resultadoEsperado.setLayout(new BoxLayout(resultadoEsperado, BoxLayout.Y_AXIS));
		resultadoEsperado.add(Box.createVerticalStrut(10));
		resultadoEsperado.add(new JLabel(DISTANCIA));
		resultadoEsperado.add(jTxtDistancia);
		resultadoEsperado.add(new JLabel(DIAS_DE_ESTANCIA));
		resultadoEsperado.add(jTxtEstancia);
		
		JPanel resultadoObtenido = new VentanaCotizador().getVentana();

		assertThat(resultadoEsperado).info.equals(resultadoObtenido);
	}

	@Test
	public void ventanaCotizadortestCasoAlterno() {
		JTextField jTxtDistancia = new JTextField(10);
		JTextField jTxtEstancia = new JTextField(30);
		JPanel resultadoEsperado = new JPanel();
		resultadoEsperado.setLayout(new BoxLayout(resultadoEsperado, BoxLayout.Y_AXIS));
		resultadoEsperado.add(Box.createVerticalStrut(40));
		resultadoEsperado.add(new JLabel(DISTANCIA));
		resultadoEsperado.add(jTxtDistancia);
		resultadoEsperado.add(new JLabel(DIAS_DE_ESTANCIA));
		resultadoEsperado.add(jTxtEstancia);
		
		JPanel resultadoObtenido = new VentanaCotizador().getVentana();

		assertThat(resultadoEsperado).isNotEqualTo(resultadoObtenido);
	}
}


