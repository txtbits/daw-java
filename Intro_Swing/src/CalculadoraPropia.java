// ConvertidorDeEuros
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class CalculadoraPropia implements ActionListener {
	
	JFrame ventana;
	JPanel panelUno, panelDos;
	JTextField operando;
	int valor1, valor2, resultado;
	JButton botonIgual, botonMas, botonMenos, botonMultiplica, botonDivide;
	
	char botones[] = {'0','1','2','3','4','5','6','7','8','9'};
	JButton botonCero, botonUno, botonDos, botonTres, botonCuatro, botonCinco, botonSeis, botonSiete, botonOcho, botonNueve;
	
	public CalculadoraPropia(){
		// Configura la ventana principal
		ventana = new JFrame("Calculora Propia");
		ventana.setSize(new Dimension(400, 400));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelUno = new JPanel(new GridLayout(1, 1));
		panelDos = new JPanel(new GridLayout(4, 4));
		
		// Crea / inicializa componentes
		componentesPanelUno();
		componentesPanelDos();
		panelUno.setBorder(BorderFactory.createEmptyBorder(10,10,5,10));
		ventana.getContentPane().add(panelUno, BorderLayout.NORTH);
		panelDos.setBorder(BorderFactory.createEmptyBorder(10,10,5,10));
		ventana.getContentPane().add(panelDos, BorderLayout.CENTER);
		ventana.pack();
		ventana.setVisible(true);
	}
	
	private void componentesPanelUno(){
		operando = new JTextField(20);
		panelUno.add(operando);
	}
	
	private void componentesPanelDos(){
		botonIgual = new JButton("=");
		botonIgual.setMnemonic(KeyEvent.VK_I);
		botonIgual.addActionListener(this);
		
		botonMas = new JButton("+");
		botonMas.setMnemonic(KeyEvent.VK_I);
		botonMas.addActionListener(this);
		
		botonMenos = new JButton("-");
		botonMenos.setMnemonic(KeyEvent.VK_I);
		botonMenos.addActionListener(this);
		
		botonMultiplica = new JButton("*");
		botonMultiplica.setMnemonic(KeyEvent.VK_I);
		botonMultiplica.addActionListener(this);
		
		botonDivide = new JButton("/");
		
		/*
		for(int i=0;i<=9;i++){
			 
		}
		*/
		
		botonCero = new JButton("0");

		
		botonUno = new JButton("1");
		botonUno.setMnemonic(KeyEvent.VK_I);
		botonUno.addActionListener(this);
		
		botonDos = new JButton("2");
		botonTres = new JButton("3");
		botonCuatro = new JButton("4");
		botonCinco = new JButton("5");
		botonSeis = new JButton("6");
		botonSiete = new JButton("7");
		botonOcho = new JButton("8");
		botonNueve = new JButton("9");
		
		panelDos.add(botonSiete);
		panelDos.add(botonOcho);
		panelDos.add(botonNueve);
		panelDos.add(botonDivide);
		
		panelDos.add(botonCuatro);
		panelDos.add(botonCinco);
		panelDos.add(botonSeis);
		panelDos.add(botonMultiplica);
		
		panelDos.add(botonUno);
		panelDos.add(botonDos);
		panelDos.add(botonTres);
		panelDos.add(botonMenos);
		
		panelDos.add(botonCero);
		panelDos.add(botonMas);
		panelDos.add(botonIgual);	
	}
	
	public void actionPerformed(ActionEvent event) {
		try{
			operando.setText("ERROR");
		}
		catch (Exception e) {
			
		}
	}
	
	private static void creaGUI() {
		CalculadoraPropia calculadora = new CalculadoraPropia();
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				creaGUI();
			}
		});
	}
}