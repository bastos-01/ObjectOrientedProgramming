package aula02;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduza o montante investido: ");
		double investido = Double.parseDouble(input.nextLine());
		
		System.out.println("Introduza a taxa de juro mensal: ");
		double juro = Double.parseDouble(input.nextLine());
		
		double mes_1 = investido + juro/100 * investido;
		double mes_2 = mes_1 + juro/100 * mes_1;
		double mes_3 = mes_2 + juro/100 * mes_2;
		
		System.out.println("O montante no banco ao fim de 3 meses é de: " + mes_3);
		input.close();
		
		
	}

}
