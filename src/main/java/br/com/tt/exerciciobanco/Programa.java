package br.com.tt.exerciciobanco;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		//Pedir para o usuário digitar:
		// - tipo
		// - valor
		//- descricao
		// criar um objeto da classe movimento e setar os valores nele
		// imprimir objeto criado
		
		System.out.println("Digite o tipo do movimento (Débito ou Crédito):");
		Scanner scanner = new Scanner(System.in);
		String tipo = scanner.nextLine();
		
		System.out.println("Digite o valor do movimento");
		Double valor = scanner.nextDouble();
		
		System.out.println("Digite a descricao do movimento");
		scanner.nextLine();
		String descricao = scanner.nextLine();
		
		scanner.close();
		
		Movimento movimento = new Movimento();
		movimento.setTipo(tipo);
		movimento.setValor(valor);
		movimento.setDescricao(descricao);
		
	System.out.println(movimento);
		
		
		
		
	}

}
