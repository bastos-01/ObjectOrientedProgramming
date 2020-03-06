package teste2017;

import java.io.*;
import java.util.*;

public class Ex_2 {

	public static void main(String[] args) {
		
			ArrayList<Robo> array = new ArrayList<>();
		
			try {
				Scanner input = new Scanner(new File("robos.txt"));
				input.nextLine();
				while(input.hasNextLine()) {
					String linha = input.nextLine();
					String lista[] = linha.split("\t");
					array.add(new Robo(lista[0], lista[1], lista[2]));
				}
				
			//for(Robo i: array) {
			//	System.out.println(i);
			//}
				
				
			PrintWriter output = new PrintWriter(new File("parte2.txt"));
			ArrayList<String> equipas = contarEquipas(array);
			output.println("Lista de equipas ( " + equipas.size() + " equipas)" );
			for(int i=0; i<equipas.size(); i++) {
				output.println(equipas.get(i) +  array.get(i).toString());
			}
			output.close();
			
			
			input.close();
				
			} 
			catch (FileNotFoundException e) {
				System.err.println("Ficheiro não encontrado!");
			}
			
	}
	
	public static ArrayList<String> contarEquipas(ArrayList<Robo> array) {
		ArrayList<String> equipas = new ArrayList<>();
		for(Robo k: array) {
			if(!equipas.contains(k.getEquipa())) {
				equipas.add(k.getEquipa());
			}
		
		}
		return equipas;
	}

}
