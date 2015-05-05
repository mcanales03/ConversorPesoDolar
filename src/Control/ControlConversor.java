package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ConversorDolaresPesos;
import Vista.InterfazVista;

public class ControlConversor implements ActionListener {
	private InterfazVista vista;
	private ConversorDolaresPesos modelo;
	
	public ControlConversor(InterfazVista vista, ConversorDolaresPesos modelo){
		this.vista = vista;
		this.modelo = modelo;
		
	}
	public void actionPerformed(ActionEvent evento){
		double cantidad = vista.getCantidad();
		
		if(evento.getActionCommand().equals(InterfazVista.ADOLARES)){
			vista.escribeCambio(cantidad + "Pesos son:"+ modelo.pesosAdolares(cantidad) + "Dolares");
			
		}
		else if(evento.getActionCommand().equals(InterfazVista.APESOS)){
			vista.escribeCambio(cantidad + "dolares son:"+ modelo.dolaresApesos(cantidad)+ "pesos");
			
		}
		else
			vista.escribeCambio("ERROR");
	}

}
