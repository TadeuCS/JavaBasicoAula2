package br.com.tcs.jba.calculadora;

public class ValidadorDisplay {

	public void validarSeCabeNoDisplay(double valor) {
		if(valor>1000000.00) {
			throw new NumberFormatException("Tamanho do N�mero excede o tamanho do display!");
		}
	}
}
