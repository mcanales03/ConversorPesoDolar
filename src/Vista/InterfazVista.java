package Vista;
import Control.ControlConversor;

public interface InterfazVista {

	//Constantes para manejar las diferentes operaciones que se  pueden realizar
	static final String ADOLARES= "Pesos a dolares";
	static final String APESOS= "Dolares a Pesos";
	
	void setControl(ControlConversor c);
	
	void arrancar(); //para iniciar la visualizacion de la ventana
	
	double getCantidad(); //cantidad de dinero que se  desea convertir
	
	void escribeCambio(String s); //cadena con la conversion realizada
	
	
}
