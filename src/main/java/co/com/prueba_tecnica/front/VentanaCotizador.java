package co.com.prueba_tecnica.front;

import static co.com.prueba_tecnica.util.Constantes.DIAS_DE_ESTANCIA;
import static co.com.prueba_tecnica.util.Constantes.DISTANCIA;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaCotizador {

		protected JTextField jTxtDistancia = new JTextField(5);
		protected JTextField jTxtEstancia = new JTextField(5);
	
		public JPanel getVentana() {

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalStrut(10));

		panel.add(new JLabel(DISTANCIA));
		panel.add(jTxtDistancia);

		panel.add(new JLabel(DIAS_DE_ESTANCIA));
		panel.add(jTxtEstancia);

		return panel;
	}
}
