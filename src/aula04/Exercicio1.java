package aula04;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduza uma frase: ");
		String frase = input.nextLine();
		System.out.println("Frase em minúsculas: " + frase.toLowerCase());
		
		int tamanho = frase.length();
		
		System.out.println("Último caracter da frase: " + frase.charAt(tamanho-1));
		System.out.println("Três primeiro caracteres da frase: " + frase.substring(0,3));
		System.out.println("Frase com pontos de exclamação no final: " + frase.concat("!!!"));
		System.out.println("Frase em maiúsculas: " + frase.toUpperCase());
		
		input.close();
		
		
		

	}

}
