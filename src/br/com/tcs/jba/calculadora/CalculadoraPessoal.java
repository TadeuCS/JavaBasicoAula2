package br.com.tcs.jba.calculadora;

public class CalculadoraPessoal extends CalculadoraPessoalAbstract{
	private double imc;
	private String statusIMC;
	
	public double getImc() {
		return imc;
	}

	@Override
	public String calcularImc(double altura, double peso) {
		this.imc = peso / (altura * altura);
		this.statusIMC = "--";
		if (this.imc <= 18.5) {
			this.statusIMC = "A BAIXO DO PESO";
		} else if (this.imc >= 18.6 && this.imc < 25) {
			this.statusIMC = "PESO NORMAL";
		} else if (imc >= 25 && imc < 30) {
			this.statusIMC = "SOBREPESO";
		} else if (imc >= 30 && imc < 35) {
			this.statusIMC = "OBESIDADE DE GRAU I";
		} else if (imc >= 35 && imc < 40) {
			this.statusIMC = "OBESIDADE DE GRAU II";
		} else if (imc > 40) {
			this.statusIMC = "OBESIDADE DE GRAU III";
		}
		return "IMC: " + decimalFormat.format(this.imc) + " (" + this.statusIMC + ")";
	}

	@Override
	public String calcularAgua(double peso) {
		setMlAgua(Double.valueOf(peso * 0.5 * 100).intValue());
		return "Beba " + getMlAgua() + " ml de água por dia";
	}

	public String calcularImc(String algura, String peso) throws Exception {
		double alturaDouble = 0;
		double pesoDouble = 0;
		try {
			alturaDouble = Double.parseDouble(algura.replaceAll(",", "."));
		} catch (Exception e) {
			throw new Exception("Altura inválida, informe um número válido.");
		}
		
		try {
			pesoDouble = Double.parseDouble(peso.replaceAll(",", "."));
		} catch (Exception e) {
			throw new Exception("Peso inválido, informe um número válido.");
		}
		return calcularImc(alturaDouble, pesoDouble);
	}
}
