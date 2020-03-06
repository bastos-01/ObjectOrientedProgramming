package aula02;
import java.util.Scanner;


public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduza o tempo(s): ");
		int tempo = input.nextInt();
		
		int horas = tempo / 3600;
		int resto_horas = tempo % 3600;
		
		int minutos = resto_horas / 60;
		int resto_minutos = resto_horas % 60;
		
		int segundos = resto_minutos % 60;
		
		System.out.printf("%02d:%02d:%02d",horas,minutos,segundos);
		input.close();
		
		
	}

}
