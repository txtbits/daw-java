
// ComponentesSwing.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ComponentesSwing {
	private static void creaGUI() {
		// Contenedor
		JFrame ventana = new JFrame("Componentes de Swing");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Elementos gráficos
		JButton boton = new JButton("Soy un boton Swing!");
		JLabel leyenda = new JLabel("Hola, soy una etiqueta Swing!");
		String[] nombres = {"Melchor","Gaspar","Baltasar"};
		JComboBox lista = new JComboBox(nombres);
		JTextField campoTexto = new JTextField(40);
		JProgressBar barra = new JProgressBar(0,24);
		barra.setValue(10);
		barra.setStringPainted(true);
		
		// Panel
		JPanel panel = new JPanel(new GridLayout(0,1));
		panel.add(boton);
		panel.add(leyenda);
		panel.add(lista);
		panel.add(campoTexto);
		panel.add(barra);
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,5,10));
		ventana.getContentPane().add(panel, BorderLayout.CENTER);
		ventana.pack();
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				creaGUI();
			}
		});
	}
}