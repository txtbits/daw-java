
// HolaMundo con Swing
import javax.swing.*;
public class HolaMundo {
	/**
	* El siguiente método crea una interfaz grafica y la muestra.
	* Para seguridad de hilos, este método debería llamarse desde
	* un hilo administrador de eventos
	*/
	private static void creaGUI() {
		// Crea la ventana. -> Contenedor
		JFrame ventana = new JFrame("HolaMundo");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Añade el texto "Hola Mundo"
		JLabel texto = new JLabel("Hola Mundo");
		ventana.getContentPane().add(texto);
		
		// Visualiza la ventana
		ventana.pack();
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		// Crea y muestra la interfaz de usuario a traves de un
		// hilo que administra la correcta gestion de eventos
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				creaGUI();
			}
		});
	}
}