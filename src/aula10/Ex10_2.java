package aula10;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex10_2 {

	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
	
		dic.put("Branco", "Que tem a cor da neve");
		dic.put("Preto", "Que tem a cor do escuro");
		dic.put("Castanho", "Que tem a cor do outono");
		dic.put("Amarelo", "Que tem a cor do Sol");
		dic.put("Rosa", "Que tem a cor das rosas");
		
		System.out.println("Estrutura inicial: ");
		for (Entry<String, String> entry : dic.entrySet()) {
		    System.out.println("[" + entry.getKey() + " = " + entry.getValue() + "]");
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nIntroduza a opção pretendida: \n1 - adicionar \n2 - alterar \n3 - remover \n4 - nenhum");
		int opcao = input.nextInt();
		
		switch (opcao) {
		case 1:
			//adicionar
			System.out.println("Introduza o nome da key a adicionar: ");
			String key = input.next();
			
			System.out.println("Introduza o value correspondente a essa key: ");
			String value = input.next();
			
			
			dic.put(key, value);
			break;
		
		case 2:
			//alterar
			System.out.println("Introduza a key a alterar: ");
			String key2 = input.next();
			
			System.out.println("Introduza o value para a nova key: ");
			String newValue = input.next();
			
			dic.put(key2, newValue);
			break;
			
		case 3:
			//remove
			System.out.println("introduza a key a remover: ");
			String key3 = input.next();
			
			dic.remove(key3);
			break;
		case 4:
			break;
		}
		
		//print dos pares termo-significado com toString()
		for (String name: dic.keySet()) {
			String key4 = name.toString();
			String value2 = dic.get(key4).toString();
			System.out.println(key4 + ": " + value2);
		}
		
		System.out.println();
		
		//print dos termos termos com toString()
		for (String name: dic.keySet()) {
			String key4 = name.toString();
			System.out.println("key: " + key4);
		}
		
		System.out.println();
		
		//print dos significados com toString()
		for (String name: dic.keySet()) {
			String value2 = dic.get(name).toString();
			System.out.println("Significado:" + value2);
		}
		input.close();
	}

}

