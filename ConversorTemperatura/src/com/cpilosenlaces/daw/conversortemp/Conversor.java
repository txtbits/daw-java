package com.cpilosenlaces.daw.conversortemp;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class Conversor extends JFrame {
	
	JLabel etiqueta;
	JTextField pantallaEntrada, pantallaSalida;
	JPanel panelBotones;
	double resultado;
	
	public Conversor(){
		super(); // Constructor clase madre
		setSize(300, 300); // Tama�o de la ventana
		setTitle("Conversor de temperatura"); // T�tulo de la ventana
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		// Vamos a dibujar sobre el panel
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new GridLayout(4, 1)); // Layout del panel principal
		
		// etiqueta de titulo
		etiqueta = new JLabel("Conversor Temperatura");
		etiqueta.setFont(new Font("Arial", Font.BOLD, 20));
		etiqueta.setHorizontalAlignment(JTextField.CENTER);
		panel.add(etiqueta);
		
		// pantallaEntrada == display de entrada en F�
		pantallaEntrada = new JTextField(20);
		pantallaEntrada.setFont(new Font("Arial", Font.BOLD, 30));
		pantallaEntrada.setHorizontalAlignment(JTextField.RIGHT);
		pantallaEntrada.setBackground(Color.WHITE);
		pantallaEntrada.setBorder(new LineBorder(Color.black, 2));
		panel.add(pantallaEntrada);
		
		// pantallaSalida == display de salida en C� (no editable)
		pantallaSalida = new JTextField(20);
		pantallaSalida.setFont(new Font("Arial", Font.BOLD, 30));
		pantallaSalida.setHorizontalAlignment(JTextField.RIGHT);
		pantallaSalida.setEditable(false);
		pantallaSalida.setBackground(Color.WHITE);
		pantallaSalida.setBorder(new LineBorder(Color.black, 2));
		panel.add(pantallaSalida);

		// Botones de los n�meros
		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(1, 2));
		BtnConvertir();
		BtnBorrar();
		panel.add(panelBotones);

	}
		
		/**
		 * Crea un bot�n para hacer la conversi�n
		 * 
		 */
		private void BtnConvertir() {
			JButton btnConvertir = new JButton();
			btnConvertir.setText("Convertir");
			btnConvertir.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseReleased(MouseEvent evt) {
					resultado = new Double(pantallaEntrada.getText());
					pantallaSalida.setText("" + (resultado - 32) / 1.8 );
				}
			});
			// Coloca bot�n en panel (gridlayout)
			panelBotones.add(btnConvertir);
		}
		
		/**
		 * Crea un bot�n para borrar el contenido de las pantallas
		 * 
		 */
		private void BtnBorrar() {
			JButton btnConvertir = new JButton();
			btnConvertir.setText("Borrar");
			btnConvertir.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseReleased(MouseEvent evt) {
					pantallaEntrada.setText("");
					pantallaSalida.setText("");
				}
			});
			// Coloca bot�n en panel (gridlayout)
			panelBotones.add(btnConvertir);
		}
}
