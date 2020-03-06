package aula03;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double investimento = 0;
		double percentagemJuros = 0;
		double juros = 0;
		int mes = 1;
		double valor = 0;
		
		System.out.println("Introduza um valor inicial de investimento (múltiplo se 1000 e positivo): ");
		investimento = input.nextDouble();
		
		while(investimento%1000 != 0 || investimento<=0 ){
		
			System.out.println("Introduza um valor VÁLIDO inicial de investimento: ");
			investimento = input.nextDouble();
		};
		
		System.out.println("Introduza um valor de juros (entre 0% e 5%): ");
		percentagemJuros = input.nextDouble();
		
		while(percentagemJuros>5 || percentagemJuros<0 ){
		
			System.out.println("Introduza um valor VÁLIDO de juros: ");
			percentagemJuros = input.nextDouble();
		};
		
		juros = percentagemJuros * 0.01;
		
		while(mes<=12) {
			valor = investimento + juros*investimento;
			investimento = valor;
			System.out.println("Fundos do mês " + mes + " :" + investimento);
			mes++;
		}
		input.close();
		

	}

}
