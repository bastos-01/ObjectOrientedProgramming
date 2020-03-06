package aula09;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex9_1c {
	
	public static void main(String args[]) {
		
			Set<Data> c4 = new TreeSet<>();
			Data[] datas = {new Data(12,11,2000), new Data(23,10,1990), new Data(30,1,1995), new Data(12,4,2002), new Data(14,2,1980)};
			
			for (Data x: datas) {
				if (!c4.add(x)) {
					System.out.println("Nome duplicado: " + x);}
			}
			
			Iterator<Data> itr = c4.iterator(); 
			while (itr.hasNext())
				System.out.println(itr.next());


		}
	
	

}
