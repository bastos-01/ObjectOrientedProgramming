package aula10;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ex10_1 {

	public static void main(String[] args) {
		
		String frase = "Hello Word";
		HashMap<Character, Set<Integer>> palavras = new HashMap<Character, Set<Integer>>();
        for(int i=0; i < frase.length(); i++) {
        	if(frase.charAt(i) != ' ') {
        		Set<Integer> x = new HashSet<Integer>();
        		if(palavras.containsKey(frase.charAt(i))) {
        			x = palavras.get(frase.charAt(i));
        		}
        		x.add(frase.indexOf(frase.charAt(i), i));
        		palavras.put(frase.charAt(i), x);
        	}
        }
        System.out.println(palavras);

	}

}
