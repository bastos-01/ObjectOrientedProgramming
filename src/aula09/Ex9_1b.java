package aula09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex9_1b {
	public static void main(String args[]) {
		
		Set<Pessoa> c3 = new HashSet<>();
		
		Pessoa[] pessoas = {new Pessoa("Rui", 93154, new Data(12,11,2000)), new Pessoa("Paulo", 86540, new Data(23,10,1990)), 
				new Pessoa("Pedro", 95430, new Data(30,1,1995)), new Pessoa("Antonio", 79456, new Data(12,4,2002)), new Pessoa("Gil", 97605, new Data(14,2,1980)),
				new Pessoa("Rui", 93154, new Data(12,11,2000)), new Pessoa("Antonio", 79456, new Data(12,4,2002)) };
		
		for (Pessoa i: pessoas) {
			if (!c3.add(i)) {
				System.out.println("Nome duplicado: " + i);}
		}
		
		System.out.println(c3.size() + " nomes distintos");
		
		Iterator<Pessoa> itr = c3.iterator(); 
		while (itr.hasNext())
			System.out.println(itr.next());



		}
}
