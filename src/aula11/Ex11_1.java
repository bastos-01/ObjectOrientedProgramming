package aula11;

import java.io.*;
import java.util.*;

public class Ex11_1 {
	
	static ArrayList<String> palavras = new ArrayList<>();
	static TreeMap <String, HashMap<String, Integer>> words = new TreeMap<>();
	
	public static void main(String[] args){
	
		try { //se o ficheiro existir
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(new File("teste.txt")); 
			
			while (input.hasNextLine()) { //percorrer cada linha do texto
				String linha = input.nextLine(); 
				String[] lista = linha.split("\\W"); //separar as palavras da linha
				for(String x: lista) //percorrer cada palavra da linha
					if(x.length()>=3) 
						palavras.add(x); 
			}
			
			fillMap();
			
		}
		
		catch(FileNotFoundException e) { //se não existir ficheiro
			System.out.println("File not found!");
		}
		}
		public static void fillMap() {
		for(int i = 0; i<palavras.size(); i++) { //percorre a lista de palavras
			HashMap<String, Integer> temporario = new HashMap<>();
			if(!words.containsKey(palavras.get(i))) { 
				if(i<palavras.size()-1) {
					temporario.put(palavras.get(i+1).toLowerCase(), 1);
					words.put(palavras.get(i).toLowerCase(), temporario);
				}
			}
			else {
				temporario.putAll(words.get(palavras.get(i)));  
				temporario.put(palavras.get(i+1).toLowerCase(), 1);
				words.put(palavras.get(i).toLowerCase(), temporario);
			}
			
		}
		
		for (String key : words.keySet()) { //iterator do treemap
			System.out.println(key + "=" + words.get(key));
		}
	}

}
