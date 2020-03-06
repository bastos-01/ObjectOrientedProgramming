package aula09;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex9_2 {
	public static void main(String[] args) {   
	int[] DIM = {1000, 5000, 10000, 20000, 40000, 100000};
	String[] palavras = {"add", "search", "remove"};
	
	ArrayList<Collection<Integer>> col = new ArrayList<>();
	Collection<Integer> col0 = new ArrayList<>();
	Collection<Integer> col1 = new LinkedList<>();
	Collection<Integer> col2 = new HashSet<>();
	Collection<Integer> col3 = new TreeSet<>();
	col.add(col0); col.add(col1); col.add(col2); col.add(col3);
	
	
	System.out.printf("%-5s\t%d\t%d\t%d\t%d\t%d\t%d\n", "Collection", DIM[0], DIM[1], DIM[2], DIM[3], DIM[4], DIM[5]); 

	for(Collection<Integer> c : col) {
		System.out.printf(" %-10s\n", c.getClass().getSimpleName());
		for(int i=0; i<3; i++) {
			System.out.printf("%8s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n", palavras[i], checkPerformance(c, 1000, i), checkPerformance(c, 5000, i), checkPerformance(c, 10000, i), checkPerformance(c, 20000, i), checkPerformance(c, 40000, i), checkPerformance(c, 100000, i));
	}
	}
	}
	

	private static double checkPerformance(Collection<Integer> col, int DIM, int type) { 
		double[] resultados = new double[3]; 
		double start, stop, delta;  
		 
		// Add 
		if(type == 0) {
		 start = System.nanoTime(); // clock snapshot before  
		 for(int i=0; i<DIM; i++ )  
		 col.add( i );  
		 stop = System.nanoTime();  // clock snapshot after  
		 delta = (stop-start)/1e6; // convert to milliseconds 
		 resultados[0] = delta;
		 
		 //System.out.println(col.size()+ ": Add to " +  
		 //col.getClass().getSimpleName() +" took " + delta + "ms");  
		}
	
		// Search 
		if(type == 1) {
		start = System.nanoTime(); // clock snapshot before 
		for(int i=0; i<DIM; i++ ) { 
		int n = (int) (Math.random()*DIM);  
		if (!col.contains(n))    
		System.out.println("Not found???"+n);  
		}  
		stop = System.nanoTime();  // clock snapshot after  
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds  
		resultados[1] = delta;
		 
		 //System.out.println(col.size()+ ": Search to " +  
		 //col.getClass().getSimpleName() +" took " + delta + "ms"); 
		}
		
		
		// Remove  
		if(type ==3) {
		start = System.nanoTime(); // clock snapshot before 
		Iterator<Integer> iterator = col.iterator(); 
		while (iterator.hasNext()) {    
			iterator.next();    
			iterator.remove(); 
		}  
		stop = System.nanoTime();  // clock snapshot after  
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds 
		resultados[2] = delta;
		 
		 //System.out.println(col.size() + ": Remove from "+     col.getClass().getSimpleName() +" took " + delta + "ms");  }
		}
		
		 
		 return resultados[type];
	 }
}