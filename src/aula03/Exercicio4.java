package aula03;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduza um número :");
		double numeroInicial = input.nextDouble();
		double numero2 = 0;
		double maior = numeroInicial;
		double menor = numeroInicial;
		double soma = 0;
		double contador = 0;
		
		
		do {
			numero2 = input.nextDouble();
			
			if(numero2 < menor) {
				menor = numero2;
			}
			if(numero2 > maior){
				maior = numero2;
			}
			soma = soma + numero2;
			contador++;
			
		}while(numeroInicial != numero2);
		
		double media = soma/contador;
		
		System.out.println("O número maior é: " + maior);
		System.out.println("O número menor é: " + menor);
		System.out.println("A média dos números é de: " + media);
		System.out.println("Foram lidos " + contador + " números");
		
		
		input.close();

	}

}
