package aula10;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Random;

public class Ex10_3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		TreeMap <String, Set<String>> dicionario = new TreeMap<String, Set<String>>();
		
		//criar TreeMap com + do que 1 value para cada key
		HashSet<String> lista1 = new HashSet<String>();
		String s1 = "branco";
		lista1.add("Que tem cor da neve");
		lista1.add("Cor do leite");
		lista1.add("Pálido");
		dicionario.put(s1, lista1);
		
		HashSet<String> lista2 = new HashSet<String>();
		String s2 = "bolo";
		lista2.add("Massa à base de farinha");
		lista2.add("cozida numa forma");
		dicionario.put(s2, lista2);
		
		HashSet<String> lista3 = new HashSet<String>();
		String s3 = "entrada";
		lista3.add("Abertura");
		dicionario.put(s3, lista3);
		
		HashSet<String> lista4 = new HashSet<String>();
		String s4 = "saída";
		lista4.add("Lugar ou ponto por onde se sai");
		dicionario.put(s4, lista4);
		
		HashSet<String> lista5 = new HashSet<String>();
		String s5 = "letra";
		lista5.add("Carácter escrito");
		lista5.add("impresso ou gravado do alfabeto");
		dicionario.put(s5, lista5);
		
		for (Entry<String, Set<String>> entry : dicionario.entrySet()) {
            
			System.out.println("[" + entry.getKey() + " = " + entry.getValue() + "]");
        }
		//alinea b)
		System.out.println("Introduza a key que pretende remover um valor aleatoriamente: ");
		String chave = input.next();
		System.out.println("Valor aleatório da key " + chave + " : " + ValorAleatorio(dicionario,chave));
		input.close();
		
	
		
		
	}
	
	public static String ValorAleatorio(TreeMap<String, Set<String>> x, String y) {
		String aleatoria = "";
		Random rand = new Random();
		int r = rand.nextInt(x.get(y).size());
		int k = 0;
		for(String s: x.get(y)) {
			if(r==k) {
				aleatoria = s;
			}
			k++;
		}
		return aleatoria;
	}


}