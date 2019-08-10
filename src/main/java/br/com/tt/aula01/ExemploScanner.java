package br.com.tt.aula01;

import java.util.Scanner;

public class ExemploScanner {
public static void main(String[] args) {
	
	System.out.println("digite um texto: ");
	Scanner scanner = new Scanner(System.in);
	String texto = scanner.nextLine();
	System.out.println("O texto digitado foi: " + texto);
	
}

}
