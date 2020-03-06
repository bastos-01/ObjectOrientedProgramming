package aula10;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

public class Ex10_4 {

	public static void main(String[] args) throws IOException{ 
		
		Scanner input = new Scanner(new FileReader("words.txt")); 
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		
		while (input.hasNext()) {
			String word = input.next();
			boolean d = true;
			//alinea d)
			for(int i = 0; i < word.length(); i++) {
				// cria um array de char
				char[] c = word.toCharArray();
			    for ( int k = 0; k < c.length; k++ )
			        // verifica se o char não é um dígito
			        if (!Character.isAlphabetic(c[i])) {
			            d = false;
			        }
			}
			if(d) {	
			System.out.println(word);
			}
			//alinea b)
			if(word.length()>2) {
				lista.add(word);
			}
			//alinea c)
			if(word.charAt(word.length()-1) == 's') {
				lista2.add(word);
			}
			
		}
		System.out.println("\nlista de palavras com mais de 2 caracteres : ");
		System.out.println(lista);
		System.out.println("\nlista de palavras terminadas em 's' : ");
		System.out.println(lista2);
		input.close();
	}
	
	

}
