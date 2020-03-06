package aula04;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduza a frase: ");
		String frase = input.nextLine();
		System.out.println("O acrónimo da frase é: " + acronimo(frase));
		
		input.close();

	}
	
	public static String acronimo(String s) {
		String acronimo = "";
		String[] textoSeparado = s.split(" ");
		
		for(int i=0; i<textoSeparado.length; i++) {
			if(textoSeparado[i].length() > 3 ) {
				acronimo = acronimo + textoSeparado[i].toUpperCase().charAt(0);
			}
		}
		return acronimo;
	}

}
