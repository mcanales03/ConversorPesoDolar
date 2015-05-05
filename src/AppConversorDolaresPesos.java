import Control.ControlConversor;
import Modelo.ConversorDolaresPesos;
import Vista.InterfazVista;
import Vista.VentanaConversor;


public class AppConversorDolaresPesos {
	
	public static void main(String[]args){
		// instansacion de un  objeto del modelo
		ConversorDolaresPesos modelo = new ConversorDolaresPesos();
		// instanciacion de unobjeto de la vista
		InterfazVista vista = new VentanaConversor();
		// Instanciacion de un objeto del controlador
		ControlConversor control = new ControlConversor(vista,modelo);
		
		// Configuracion e inicializacion de la vista
		
		vista.setControl(control);
		vista.arrancar();
 		
	}
}
