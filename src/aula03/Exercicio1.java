package aula03;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		System.out.println("Introduza o valor da nota da componente prática: ");
		double notaPratica = input.nextDouble();
		
		while(x == 0) {
			
			if(notaPratica <0 || notaPratica > 20) {
				x = 0;
				System.out.println("Valor deve estar entre 0 e 20, introduza outro: ");
				notaPratica = input.nextDouble();
			}
			else {
				x=1;
				}
			}
		
		System.out.println("Introduza o valor da nota da componente teórica: ");
		double notaTeorica = input.nextDouble();
		
		while(x == 0) {
			
			if(notaTeorica <0 || notaTeorica > 20) {
				x = 0;
				System.out.println("Valor deve estar entre 0 e 20, introduza outro: ");
				notaTeorica = input.nextDouble();
			}
			else {
				x=1;
				}
			}
		
		if(notaPratica < 7 || notaTeorica < 7) {
			System.out.println("66");
		}
		else {
			double notaFinal = 0.4*notaTeorica + 0.6*notaPratica; 
			System.out.println(notaFinal);
		}
		
		
		input.close(); 
	}

}
