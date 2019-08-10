package br.com.tt.aula01;

import java.util.Scanner;



public class Exercicio16 {
	public static void main(String[] args) {
		
	
		System.out.println("Digite um texto");
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		scanner.close();
		
		
	    
		
		System.out.println("O texto digitado foi: " + texto);
	
		
		System.out.println("a) n de caracter: " + texto.length());
		
		System.out.println("b) letra maisculas: " + texto.toUpperCase());
		
		System.out.println("c) n vogais: " + vogais(texto));
		
		 System.out.println("d) Começa com UNI? "+ texto.toLowerCase().startsWith("uni"));
		 
		 System.out.println("e) Termina com RIO? "+ texto.toLowerCase().endsWith("rio"));
		 
		 System.out.println("Numero de numeros "+numeroDeDigitos(texto));
		  
		 System.out.println("é um palindromo "+texto.equals(new StringBuilder(texto).reverse().toString()));
		  
		
	}

private static int vogais (String texto){
    int contarVogais = 0;
    texto.toLowerCase();
    char vogais[]  = {'a', 'e', 'i', 'o', 'u'};

    texto.toLowerCase();

    for (int i = 0; i < texto.length(); i++){
        char c = texto.charAt(i);
        if (c== 'a' || c =='e' || c =='i' || c== 'o' || c=='u')
            contarVogais++;
    }

    return contarVogais;
}


public static int contaVogaisDaStringComExpressaoRegular(String texto) {
	return texto.replaceAll("[^aeiouAEIOU]", "").length();
}

public static int numeroDeDigitos(String texto){
	  int contador=0;
	  for(int i=0;i<texto.length();i++){
	  char r=texto.charAt(i);
	  
	  if (r=='0'){
	   contador++;
	  }
	  if (r=='1'){
	   contador++;
	  }
	  if (r=='2'){
	   contador++;
	  }
	  if (r=='3'){
	   contador++;
	  }
	  if (r=='4'){
	   contador++;
	  }
	  if (r=='5'){
	   contador++;
	  }
	  if (r=='6'){
	   contador++;
	  }
	  if (r=='7'){
	   contador++;
	  }
	  if (r=='8'){
	   contador++;
	  }
	  
	  if (r=='9'){
	   contador++;
	  }
	  }
	  
	  return contador;
	 }

}
