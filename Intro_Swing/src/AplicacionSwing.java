
// AplicacionSwing.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AplicacionSwing implements ActionListener {
	private static String texto = "Numero de pulsaciones de boton: ";
	private int numero = 0;
	final JLabel etiqueta = new JLabel(texto + "0 ");
	
	public Component creacionComponentes() {
		JButton boton = new JButton("Soy un boton Swing!");
		boton.setMnemonic(KeyEvent.VK_I);
		boton.addActionListener(this);
		etiqueta.setLabelFor(boton);
		JPanel panel = new JPanel(new GridLayout(0, 1));
		panel.add(boton);
		panel.add(etiqueta);
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		return panel;
	}
	
	public void actionPerformed(ActionEvent e) {
		numero++;
		etiqueta.setText(texto + numero);
	}
	
	private static void creaGUI() {
		JFrame ventana = new JFrame("Aplicacion Swing");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AplicacionSwing apli = new AplicacionSwing();
		Component contenido = apli.creacionComponentes();
		ventana.getContentPane().add(contenido, BorderLayout.CENTER);
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
