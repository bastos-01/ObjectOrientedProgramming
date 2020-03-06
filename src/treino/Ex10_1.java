package treino;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Ex10_1 {

	public static void main(String[] args) {
		
		String in = "Hello World";
		Map<Character, ArrayList<Integer>> mapa = new TreeMap<>();
		String input = in.replaceAll(" ", "");
		for(int i = 0; i<input.length(); i++) {
			ArrayList<Integer> array = new ArrayList<>();
			for(int k = 0; k<input.length(); k++) {
				if(input.charAt(i) == input.charAt(k)) {
					array.add(k);
				}
			}
			mapa.put(input.charAt(i), array);
		}
		
		for(Character c: mapa.keySet()) {
			System.out.println(c + " " + mapa.get(c));
		}

	}

}
