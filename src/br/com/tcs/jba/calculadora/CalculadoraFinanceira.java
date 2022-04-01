package br.com.tcs.jba.calculadora;

public class CalculadoraFinanceira extends CalculadoraPadrao{
	
	private ValidadorDisplay validadorDisplay;
	
	public CalculadoraFinanceira() {
		this.validadorDisplay = new ValidadorDisplay();
	}

	public double jurosSimples(double taxa, int incidencia) {
		 return this.somar(jurosSimples(this.resultado(), taxa, incidencia));
	}
	
	public double jurosSimples(double principal, double taxa, int incidencia) {
		double somar = this.somar(principal*taxa*incidencia);
		validadorDisplay.validarSeCabeNoDisplay(somar);
		return somar;
	}
	
	public double jurosComposto(double taxa, int incidencia) {
		return this.somar(jurosComposto(this.resultado(), taxa, incidencia));
	}
	
	public double jurosComposto(double principal, double taxa, int incidencia) {
		double montante = 0;
		for(int i = 1; i <= incidencia; i++){
	      montante = principal * Math.pow((1 + taxa), i);
	    } 
		return this.somar(montante);
	}
}
