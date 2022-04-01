package br.com.tcs.jba.calculadora;

import java.text.DecimalFormat;

public class CalculadoraPadrao implements ICalculadora{
	private final DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
	private double valor = 0.0;
	
	@Override
	public String resultadoToString() {
		return decimalFormat.format(valor);
	}
	
	@Override
	public double resultado() {
		return valor;
	}
	
	@Override
	public void zerar() {
		valor=0.0;
	}

	@Override
	public double somar(double valor){
		return this.valor+=valor;
	}
	
	@Override
	public double subtrair(double valor){
		return this.valor-=valor;
	}
	
	@Override
	public double dividir(double valor){
		return this.valor/=valor;
	}
	
	@Override
	public double multiplicar(double valor){
		return this.valor*=valor;
	}
	
	@Override
	public double aoQuadrado(){
		return valor = Math.pow(valor, 2);
	}
	
	@Override
	public double raizQuadrada(){
		return valor = Math.sqrt(valor);
	}

	@Override
	public double porcentagem(double valor) {
		return this.valor*valor/100;
	}

}
