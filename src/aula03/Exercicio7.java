package aula03;

import java.util.Scanner;
import java.util.Random;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char resposta='S';
		
		while(resposta=='S') {
			
		Random rand= new Random();
		int randomnumero = rand.nextInt(100)+1;
		int numero;
		int contador =0;
		
		System.out.println("Introduza um numero: ");
		
		do {
			numero = input.nextInt();
			
			if( numero>randomnumero) {
				System.out.println("Demasiado alto!!");
			} 
			
			if(numero<randomnumero) {
				System.out.println("Demasiado baixo!!");
			}
			contador++;
		}while (numero!=randomnumero);
		
		System.out.format("Parabéns, acertou com %02d tentativas \n",contador);
		System.out.println("Pretende continuar? Prima (S)im");
		resposta= input.next().toUpperCase().charAt(0);
		}
		input.close();
		System.out.println("Fim :)");
	}

}
