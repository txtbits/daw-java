
// ConvertidorDeEuros
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConvertidorDeEuros implements ActionListener {
	JFrame Ventana;
	JPanel Panel;
	JTextField Euros;
	JLabel textoEuros, textoPesetas;
	JButton convertidorEuros;
	public ConvertidorDeEuros() {
		// Configura la ventana principal
		Ventana = new JFrame("Convierte Euros en Pesetas");
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana.setSize(new Dimension(180, 60));
		Panel = new JPanel(new GridLayout(2, 2));
		
		// Crea / inicializa componentes
		componentes();
		Ventana.getRootPane().setDefaultButton(convertidorEuros);
		Ventana.getContentPane().add(Panel, BorderLayout.CENTER);
		Ventana.pack();
		Ventana.setVisible(true);
	}
	
	private void componentes() {
		Euros = new JTextField(10);
		textoEuros = new JLabel("Euros", SwingConstants.LEFT);
		convertidorEuros = new JButton("Convertir");
		textoPesetas = new JLabel("Pesetas", SwingConstants.LEFT);
		convertidorEuros.addActionListener(this);
		Panel.add(Euros);
		Panel.add(textoEuros);
		Panel.add(convertidorEuros);
		Panel.add(textoPesetas);
		textoEuros.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		textoPesetas.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	}
	
	public void actionPerformed(ActionEvent event) {
		try{
			double pesetas = Double.parseDouble(Euros.getText()) * 166.386;
			textoPesetas.setText(pesetas + " Pesetas");
		}
		catch (Exception e) {
			textoPesetas.setText("ERROR");
		}
	}
	
	private static void creaGUI() {
		ConvertidorDeEuros convertidor = new ConvertidorDeEuros();
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				creaGUI();
			}
		});
	}
}
