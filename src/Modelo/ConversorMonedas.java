package Modelo;

public class ConversorMonedas {

	private double cambio;
	
	public ConversorMonedas(double valorCambio){
		//valor en la moneda de 1 dolar
		cambio =valorCambio;
		
	}
	public double dolaresAmonedas(double cantidad){
		return cantidad * cambio;
	}
	
	public double monedaAdolares(double cantidad){
		return cantidad/cambio;
		
		
	}
	
	
}
