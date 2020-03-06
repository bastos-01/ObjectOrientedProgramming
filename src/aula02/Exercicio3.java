package aula02;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduza o valor de água(kg): ");
		double agua = Double.parseDouble(input.nextLine());
		
		System.out.println("Introduza o valor de temperatura inicial(C): ");
		double tempInicial = Double.parseDouble(input.nextLine());
		
		System.out.println("Introduza o valor de temperatura final(C): ");
		double tempFinal = Double.parseDouble(input.nextLine());
		
		double energia = agua * (tempFinal - tempInicial) * 4184;
		System.out.println("O valor da energia em Joules é de: " + energia);
		input.close();
		
	
	}
}
