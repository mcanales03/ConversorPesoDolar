package Vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.ControlConversor;

public class VentanaConversor extends JFrame implements InterfazVista {
	
	private JButton convertirApesos;
	private JButton convertirAdolares;
	private JTextField cantidad;
	private JLabel resultado;
	
	public VentanaConversor(){
		// definir aspecto que tendra la ventana a partir del diseño
		super("Conversor de Dolares y Pesos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout(10,10));
		
		cantidad = new JTextField(8);
		JPanel panelaux = new JPanel();
		panelaux.add(cantidad);
		panelPrincipal.add(panelaux, BorderLayout.NORTH);
		
		resultado = new JLabel("Indique una cantidad y pulse uno de los botones");
		JPanel panelaux2 = new JPanel();
		panelaux2.add(resultado);
		panelPrincipal.add(panelaux2, BorderLayout.CENTER);
		
		convertirApesos = new JButton("A Pesos");
		convertirApesos.setActionCommand(APESOS);
		convertirAdolares = new JButton("A Dolares");
		convertirAdolares.setActionCommand(ADOLARES);
		
		JPanel botonera = new JPanel();
		botonera.add(convertirApesos);
		botonera.add(convertirAdolares);
		panelPrincipal.add(botonera, BorderLayout.SOUTH);
		getContentPane().add(panelPrincipal);
		
		
		}
	public void escribeCambio(String s){
		resultado.setText(s);
	}
	
	public double getCantidad(){
			try{
				return Double.parseDouble(cantidad.getText());
			}
			catch (NumberFormatException e){
				return 0.0;
				
			}
	}
	public void setControl(ControlConversor c){
		convertirApesos.addActionListener(c);
		convertirAdolares.addActionListener(c);
		}
	public void arrancar(){
		pack(); //ubicar los elementos graficos
		setLocationRelativeTo(null); //Ventana Centrada
		setVisible(true); // hacer visible la ventana
		
		

	}
		

}
