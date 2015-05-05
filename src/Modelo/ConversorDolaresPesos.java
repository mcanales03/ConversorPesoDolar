package Modelo;

public class ConversorDolaresPesos extends ConversorMonedas {

	public ConversorDolaresPesos(){
		super(651.45D);
		
	}
	public double dolaresApesos(double cantidad){
		return dolaresAmonedas(cantidad);
		
	}
	public double pesosAdolares(double cantidad){
		return monedaAdolares(cantidad);
		
	}

	
}
