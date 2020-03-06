package aula04;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int[] valores = lerNumeros();
		int ano = valores[1];
		int mes = valores[0];
		int diaSemana = valores[2];
		int diasMes = diasDoMes(ano,mes);
		imprimirResultados(diasMes, diaSemana, mes, ano);
		


	}
	
	public static int[] lerNumeros () {	
		
			Scanner input = new Scanner(System.in);

			System.out.println("Mês? ");
			int mes = input.nextInt();
			System.out.println("Ano? ");
			int ano = input.nextInt();
			System.out.println(
					"Dia da semana? 1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo");
			int diaSemana = input.nextInt();

			int[] array = { mes, ano, diaSemana };
			
			input.close();
			return array;
		
	}
	
	public static int diasDoMes(int ano, int mes) {
		
		int dias = 0;
		int anoBis = 0;
		 if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
	            anoBis = 1;
	        }
		 if(anoBis == 1) {
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
			
			if(anoBis == 0) {
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
		
		return dias;
	}
	
	public static void imprimirResultados( int diasMes, int diaSemana, int numeroMes, int ano) {
		
		
		int[][] resultados;
		resultados = new int[6][7];
		String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		String mes = meses[numeroMes-1];
		String mes_ano = mes + " " + ano;
		
		int counter = 1;

		
		for (int c = diaSemana-1; c < 7; c++) {
			resultados[0][c] = counter;
			counter++;
		}

		
		for (int l = 1; l < 6; l++) {
			for (int c = 0; c < 7; c++) {
				if (counter > diasMes)
					break;
				resultados[l][c] = counter;
				counter++;
			}
		}

		System.out.printf("%17s", mes_ano);
		System.out.println();
		System.out.printf("%3s%3s%3s%3s%3s%3s%3s", "Se", "Te", "Qu", "Qi", "Se", "Sa", "Do");
		System.out.println();
		
		
		
		for (int l = 0; l < 6; l++) {
			
			for (int c = 0; c < 7; c++) {
				if (resultados[l][c] == 0) {
					
					System.out.print("   ");
				} else {
	
					System.out.printf("%3d", resultados[l][c]);
				}
			}
			
			System.out.println();
		}
		
		
	}

}
