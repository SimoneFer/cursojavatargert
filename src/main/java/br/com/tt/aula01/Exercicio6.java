package br.com.tt.aula01;

public class Exercicio6 {
	public static void main (String[] args) {
		
		double valorHora = 100.0;
		int horasTrabalhadas = 10;
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		
		System.out.println("a) Salário Bruto             = " + salarioBruto);
		System.out.println("b) Quanto pagou ao INSS      = " + inss);
		System.out.println("c) Quanto pagou ao Sindicato = " + sindicato);
		System.out.println("d) Salário líquido           = " + (salarioBruto - ir - sindicato));
		System.out.println("e) Total de descontos        = " + (ir + sindicato));

}
}