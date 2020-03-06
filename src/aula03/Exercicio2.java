package aula03;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Insira um número: ");
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		
		while(numero>=0) {
			System.out.println(numero);
			numero = numero - 1;
		}
		input.close();
	}

}
