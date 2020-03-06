package aula02;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Introduza o valor em graus Célcius: ");
		Scanner sc = new Scanner(System.in);
		double cel = sc.nextDouble();
		double fahr = 1.8*cel + 32;
		System.out.println("O valor introduzido em Fahrenheit é: " + fahr);
		sc.close();

	}

}
