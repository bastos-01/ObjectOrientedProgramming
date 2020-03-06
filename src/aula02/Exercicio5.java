package aula02;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduza o valor da velocidade média da primeira metade do caminho: ");
		double v1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Introduza o valor da velocidade média da segunda metade do caminho: ");
		double v2 = Double.parseDouble(input.nextLine());
		
		int dist = 10;
		
		double tempo = (dist/v1 + dist/v2);
		
		double vfinal = 2*dist/tempo;
		
		System.out.println("A velocidade média final é de: " + vfinal);
		input.close();

	}

}
