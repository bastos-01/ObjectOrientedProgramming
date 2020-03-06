package aula03;
import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduza o mês: ");
		int mes = input.nextInt();
		
		while(mes <= 0 || mes > 12) {
			System.out.println("introduza um mês válido (entre 1 e 12): ");
			mes = input.nextInt();
		}
		
		System.out.println("Introduza o ano: ");
		int ano = input.nextInt();
		
		while( ano <= 0 || ano > 2019) {
			System.out.println("introduza um ano válido (entre 1 e 2019): ");
			ano = input.nextInt();
		}
		
		boolean bissexto = isAnoBissexto(ano);
		int dias = 0;
		if(bissexto == true) {
			if(mes == 2) {
				dias = 29;
			}
			else if( mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				dias = 30;
			}
			else {
				dias = 31;
			}
		}
		
		if(bissexto == false) {
			if(mes == 2) {
				dias = 28;
			}
			else if( mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				dias = 30;
			}
			else {
				dias = 31;
			}
		}
		
		System.out.println("O mês " + mes + " do ano " + ano + " tem " + dias + " dias" );
		
		input.close();
		
	}
	
	public static boolean isAnoBissexto(int ano) {
        if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
            return true;
        }
        else{
            return false;
        }
}

}
