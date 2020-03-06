package aula12;
import java.util.*;
import java.io.*;

public class Ex12_2 {

	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(new FileReader("movies.txt"));
			TreeSet<Movie> set = new TreeSet<>(( a, b)-> {return a.getName().compareToIgnoreCase(b.getName());});
			TreeSet<Movie> set2 = new TreeSet<>(( a, b)-> {return b.getScore().compareTo(a.getScore());});
			TreeSet<Movie> set3 = new TreeSet<>(( a, b)-> {return a.getTime().compareTo(b.getTime());});
			input.nextLine();
			while(input.hasNextLine()) {
				String linha = input.nextLine();
				String[] palavrasLinha = linha.split("\t");
				Double index1 = Double.parseDouble(palavrasLinha[1]);
				Double index4 = Double.parseDouble(palavrasLinha[4]);
				set.add(new Movie(palavrasLinha[0],index1,palavrasLinha[2],palavrasLinha[3],index4));
				set2.add(new Movie(palavrasLinha[0],index1,palavrasLinha[2],palavrasLinha[3],index4));
				set3.add(new Movie(palavrasLinha[0],index1,palavrasLinha[2],palavrasLinha[3],index4));
				
			}
			System.out.println("Ordenado por nomes: \n");
			System.out.println( String.format("%-40s%15s%15s%15s%15s", "Name","Score","Rate","Genre","Time") + "\n");
			for(Movie m: set) {
				System.out.println(m);
			}
			
			System.out.println("\n");
			System.out.println("Ordenado por ordem decrescente de score: \n");
			System.out.println( String.format("%-40s%15s%15s%15s%15s", "Name","Score","Rate","Genre","Time") + "\n");
			
			for(Movie k: set2) {
				System.out.println(k);
			}
			
			System.out.println("\n");
			System.out.println("Ordenado por ordem crescente de tempo: \n");
			System.out.println( String.format("%-40s%15s%15s%15s%15s", "Name","Score","Rate","Genre","Time") + "\n");
			
			for(Movie l: set3) {
				System.out.println(l);
			}
			System.out.println("\nGéneros de filmes existentes: \n");
			
			Set<String> genres = new HashSet<>();
			for(Movie mov: set) {
				genres.add(mov.getGenre());
			}
			for(String g: genres) {
				System.out.println(g);
			}
			
			PrintWriter output = new PrintWriter(new File("mySelection.txt"));
			for(Movie movie: set) {
				if(movie.getScore() > 60 && movie.getGenre().equals("comedy")) {
					output.println(movie);
				}
			}
			
			output.close();
			
			input.close();
		} 
		catch (FileNotFoundException e) {
			System.err.println("Ficheiro não encontrado! ");
		}

	}

}
