package aula12;
import java.util.*;
import java.io.*;

public class Ex12_1 {

	public static void main(String[] args) {
		
		try {
			
			Scanner input = new Scanner(new File("words.txt"));
			int palavrasTotal = 0;
			Set<String> set = new HashSet<>();
			
			while(input.hasNextLine()) {
				String linha = input.nextLine();
				String[] palavrasLinha = linha.split("\\W");
				palavrasTotal += palavrasLinha.length;
				for(String s: palavrasLinha) {
					set.add(s);
				}
				
			}
			
			System.out.println("Número total de palavras: " + palavrasTotal);
			System.out.println("Número de palavras diferentes: " + set.size());
			input.close();
		}
		catch(FileNotFoundException e){
			System.err.println("Erro: Ficheiro não encontrado!");
		}

	}

}
