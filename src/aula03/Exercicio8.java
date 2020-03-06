package aula03;
import java.util.Random;
public class Exercicio8 {

	public static void main(String[] args) {
		
		double[][] notas= new double[16][2];
		double inicio = 0;
		double fim = 20;
		
		for (int i=0;i<=15;i++) {
			double random = new Random().nextDouble();
			double result = inicio + (random * (fim - inicio));
			double random2 = new Random().nextDouble();
			double result2 = inicio + (random2 * (fim - inicio));
			notas[i][0]=result;
			notas[i][1]=result2;
		}
		System.out.format("%10s%10s%10s\n","NotaT","NotaP","Pauta");
		
		for(int c=0;c<=15;c++) {
			double media = notas[c][0]*0.4+0.6*notas[c][1];
			if (notas[c][0]<7 || notas[c][1]<7) {
				media = 66;
			}
			System.out.format("%10.2f%10.2f%10.0f \n", notas[c][0] , notas[c][1] , media );
		}
		
		

	}

}

