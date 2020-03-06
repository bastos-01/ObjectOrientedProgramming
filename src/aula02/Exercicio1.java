package aula02;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("Introduza o valor em Kilómetros: ");
		Scanner sc = new Scanner(System.in);
		double dist = sc.nextDouble();
		double res = dist/1.609;
		System.out.println("O valor colocado em milhas é: " + res);
		sc.close();
		

	}

}
