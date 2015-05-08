/*
* CalculadoraSwing.java
* agarcia@etsii.upm.es. Enero de 2007
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CalculadoraSwing implements ActionListener {
	private JFrame ventana;
	private JPanel panel;
	private JLabel instrucciones;
	private JTextField operando1;
	private JComboBox operador;
	private JTextField operando2;
	private JButton igualA;
	private JLabel textoResultado;
	private JTextField resultado;
	private JMenuBar barraMenu;
	private JMenu programa;
	private JMenuItem salir;
	private JMenu ayuda;
	private JMenuItem acerca;
	public CalculadoraSwing() {
		ventana = new JFrame("Calculadora aritm�tica");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		componentes();
		ventana.setJMenuBar(barraMenu);
		ventana.getRootPane().setDefaultButton(igualA);
		ventana.getContentPane().add(panel,BorderLayout.CENTER);
		Insets borde = panel.getInsets();
		ventana.setSize(500+borde.left+borde.right,200+borde.top+borde.bottom);
		ventana.setVisible(true);
	}
	public void componentes() {
		instrucciones = new JLabel("Introduce los operandos, " + "selecciona el operador aritm�tico " + "y pulsa el boton '='");
		operando1 = new JTextField(10);
		operador = new JComboBox();
		operando2 = new JTextField(10);
		igualA = new JButton("=");
		textoResultado = new JLabel("Resultado: ");
		resultado = new JTextField(15);
		barraMenu = new JMenuBar();
		programa = new JMenu("Programa");
		salir = new JMenuItem("Salir");
		programa.add(salir);
		barraMenu.add(programa);
		ayuda = new JMenu("Ayuda");
		acerca = new JMenuItem("Acerca");
		ayuda.add(acerca);
		barraMenu.add(ayuda);
		igualA.addActionListener(this);
		panel.add(instrucciones);
		panel.add(operando1);
		panel.add(operador);
		operador.addItem("+");
		operador.addItem("-");
		operador.addItem("*");
		operador.addItem("/");
		panel.add(operando2);
		panel.add(igualA);
		panel.add(textoResultado);
		panel.add(resultado);
		operando1.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		operando2.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		resultado.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		Insets bor = panel.getInsets();
		Dimension tam = instrucciones.getPreferredSize();
		instrucciones.setBounds(25+bor.left, 10+bor.top, tam.width, tam.height);
		tam = operando1.getPreferredSize();
		operando1.setBounds(25+bor.left, 40+bor.top, tam.width, tam.height);
		tam = operador.getPreferredSize();
		operador.setBounds(160+bor.left, 40+bor.top, tam.width, tam.height);
		tam = operando2.getPreferredSize();
		operando2.setBounds(225+bor.left, 40+bor.top, tam.width, tam.height);
		tam = igualA.getPreferredSize();
		igualA.setBounds(350+bor.left, 40+bor.top, tam.width, tam.height);
		tam = textoResultado.getPreferredSize();
		textoResultado.setBounds(25+bor.left, 80+bor.top,tam.width, tam.height);
		tam = resultado.getPreferredSize();
		resultado.setBounds(100+bor.left, 80+bor.top, tam.width, tam.height);
	}
	public void actionPerformed(ActionEvent event) {
		try {
			Double op1, op2;
			op1 = new Double(operando1.getText());
			op2 = new Double(operando2.getText());
			if (operador.getSelectedItem().equals("+") )
			resultado.setText(Double.toString(op1+op2));
			if (operador.getSelectedItem().equals("-") )
			resultado.setText(Double.toString(op1-op2));
			if (operador.getSelectedItem().equals("*") )
			resultado.setText(Double.toString(op1*op2));
			if (operador.getSelectedItem().equals("/") )
			resultado.setText(Double.toString(op1/op2));
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Por favor, introdce solo numeros","Error",JOptionPane.ERROR_MESSAGE);
			if (e.toString().endsWith("\""+operando1.getText()+"\"") ){
				operando1.requestFocus();
				operando1.selectAll();
			}
			else {
				operando2.requestFocus();
				operando2.selectAll();
			}
		}
	}
	public static void creaGUI() {
		CalculadoraSwing calcula = new CalculadoraSwing();
	}
	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				creaGUI();
			}
		});
	}
}
