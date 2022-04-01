package br.com.tcs.jba.calculadora;

public interface ICalculadora {
	
	public String resultadoToString();
	public double resultado();
	public void zerar();
	public double somar(double valor);
	public double subtrair(double valor);
	public double dividir(double valor);
	public double multiplicar(double valor);
	public double aoQuadrado();
	public double raizQuadrada();
	public double porcentagem(double valor);
}
