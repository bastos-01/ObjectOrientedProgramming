package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduza o valor x e y do primeiro ponto: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Introduza o valor x e y do segundo ponto: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		System.out.println("A distância dos dois pontos é de: " + distancia);
		input.close();
		
	}

}
