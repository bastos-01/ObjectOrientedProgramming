package aula03;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduza um número: ");
		int numero = input.nextInt();
		while(numero < 0) {
			System.out.println("número inválido, introduza outro número: ");
			numero = input.nextInt();
		}
		if(numero==0) {
			System.out.println("Número não primo :(");
		}
		else if(numero==1 || numero==2 || numero==3 || numero==5) {
			System.out.println("Número primo :)");
		}
		else if(numero%2==0 || numero%3==0 || numero%4==0 || numero%5==0) {
			System.out.println("Número não primo :(");
		}
		else {
			System.out.println("Número primo :)");
		}
		input.close();
	}

}
