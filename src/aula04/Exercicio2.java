package aula04;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduza uma frase: ");
		String frase = input.nextLine();
		System.out.println("A frase tem " + countDigits(frase) + " dígitos");
		System.out.println("A frase tem " + countSpaces(frase) + " espaços");
		
		if(isLower(frase)) {
			System.out.println("A frase é só em minúsculas!");
		}
		else {
			System.out.println("A frase contém maiúsculas!");
		}
		System.out.println("Frase com espaços únicos: " + spaceReplace(frase));
		if(isPalindromo(frase)) {
			System.out.println("A frase é um palindromo!");
		}
		else {
			System.out.println("A frase não é um palindromo");
		}
		input.close();
	}
	
	public static int countDigits(String s) {
		int contador = 0;
		int i = 0;
		
		for(i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				contador++;
			}
		}
		
		return contador;
		
	}
	
	public static int countSpaces(String s) {
		int contador = 0;
		int i = 0;
		
		for(i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static boolean isLower(String s) {
		boolean verificador = false;
		String s2 = s.toLowerCase();
		if(s2.contentEquals(s)) {
			verificador = true;
		}
		
		
		return verificador;
		
	}
	
	public static String spaceReplace(String s) {
		String s2 = s.replaceAll("\\s+", " ");
		return s2;
		
	}
	public static boolean isPalindromo(String s) {
		boolean verificador = false;
		String fraseInvertida = new StringBuilder(s).reverse().toString();
		if(fraseInvertida.contentEquals(s)) {
			verificador = true;
		}
		return verificador;
	}
}
