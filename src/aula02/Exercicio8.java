package aula02;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduza os valores dos catetos A e B: ");
		double catetoA = input.nextDouble();
		double catetoB = input.nextDouble();
		
		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		
		double angulo = Math.toDegrees(Math.acos(catetoA/hipotenusa));
		
		System.out.println("O valor da hipotenusa é: " + hipotenusa + ", e o valor do angulo é: " + angulo);
		
		input.close();
		

	}

}
