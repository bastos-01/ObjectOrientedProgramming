package aula11;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Ex11_2 {
	static HashMap<String, String> companhias = new HashMap<>();
	static ArrayList<Voo> voos = new ArrayList<>();
	static HashMap<String, ArrayList<String>> atrasos = new HashMap<>();
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(new File("voos.txt"));
			@SuppressWarnings("resource")
			Scanner input2 = new Scanner(new File("companhias.txt"));
			
			while(input2.hasNextLine()) { //guardar num HashMap as siglas(keys) e as companhias (values)
				String linha2 = input2.nextLine();
				String[] companhiastemp = linha2.split("\t");
				companhias.put(companhiastemp[0], companhiastemp[1]);
			}
			if(input.hasNextLine()) { //ignorar a primeira linha 
				input.nextLine();
			}
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String[] voostemp = line.split("\t"); // separar os varios parâmetros
				if(voostemp.length == 4) { // se tem atraso
					Voo x = new Voo(voostemp[0], voostemp[1],companhias.get(voostemp[1].substring(0,2)), voostemp[2], voostemp[3],"Previsto: " + calcHoras(voostemp[0], voostemp[3]) );
					voos.add(x);
				}
				if(voostemp.length == 3) { //se nao tem atraso
					Voo x = new Voo(voostemp[0], voostemp[1],companhias.get(voostemp[1].substring(0,2)), voostemp[2]);
					voos.add(x);
				}
			}
			PrintWriter output = new PrintWriter(new File("Infopublico.txt")); //escrever no ficheiro (alinea b)
			output.println("Hora\tVoo\tCompanhia\tOrigem\tAtraso\tObs");
			for(Voo k: voos)
				output.println(k.toString());
			output.close();

			for(int i = 0; i<voos.size(); i++) {
				if(voos.get(i).getAtraso() != "") {
					if(!atrasos.containsKey(voos.get(i).getCompanhia())) {
						ArrayList<String> atraso = new ArrayList<>();
						atraso.add(voos.get(i).getAtraso());
						atrasos.put(voos.get(i).getCompanhia(), atraso);
					}
					else {
						atrasos.get(voos.get(i).getCompanhia()).add(voos.get(i).getAtraso());
					}
					
				}
			}
			HashMap<String, Float> finale = new HashMap<>();
			
			for(String str: atrasos.keySet()) {
				int soma = 0;
				int contador = 0;
				float media;
				for(String t: atrasos.get(str)) {
					int x = converterHora(t);
					soma += x;
					contador++;
				}
				media = soma/contador;
				finale.put(str, media);
			}
			System.out.println(String.format("%-20s", "Companhia") + "\t" + String.format("%10s", "Atraso médio"));
			for (Entry<String, Float> entry : finale.entrySet()) {
			    System.out.println(String.format("%-20s", entry.getKey())  + "\t" + String.format("%10s", floatToString(entry.getValue())));
			}
			System.out.println("\n\n\n\n\n");
			
			HashMap<String, Integer> cidades = new HashMap<>();
			for(int i=0; i<voos.size(); i ++) {
				if(!cidades.containsKey(voos.get(i).getOrigem())) {
					cidades.put(voos.get(i).getOrigem(), 1);
				}
				else {
					int temp = cidades.get(voos.get(i).getOrigem());
					cidades.put(voos.get(i).getOrigem(), temp+1);
				}
			}
			
			Map<String, Integer> sortedMap = sortByComparator(cidades);
	        
	        PrintWriter output2 = new PrintWriter(new File("cidades.txt"));
			output2.println(String.format("%-40s", "Origem" )  + "\t" + String.format("%20s", "Voos") + "\n");
			for (Entry<String, Integer> entry : sortedMap.entrySet())
	        {
	        	output2.println(String.format("%-40s", entry.getKey())  + "\t" + String.format("%20s", entry.getValue()));
	        }
			output2.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Ficheiro não encontrado!");
		}
	}
	
	public static String calcHoras(String hora, String atraso ) {
		
		String[] inicial = hora.split(":") ;
		String[] atrasos = atraso.split(":");
		
		int tempoInicial = Integer.parseInt(inicial[0])*60 + Integer.parseInt(inicial[1]);
		int tempoAtraso = Integer.parseInt(atrasos[0])*60 + Integer.parseInt(atrasos[1]);
		int tempoTotal = tempoInicial + tempoAtraso;
		int horasFinal = tempoTotal/60;
		int minutosFinal = tempoTotal%60;
		String total = horasFinal + ":" + minutosFinal;
		return total;
	}
	public static int converterHora(String hora) {
		String[] horaSeparada = hora.split(":");
		
		int horaConvertida = Integer.parseInt(horaSeparada[0]) * 60 + Integer.parseInt(horaSeparada[1]);
		return horaConvertida;
	}
	public static String floatToString(float valor) {
		int horas = (int) (valor/60);
		int minutos = (int) (valor%60);
		return horas + ":" + minutos;
		
	}
	
	 private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap){ //função para ordenar pelos values

	        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());
	        // ordernar pelos valores
	        Collections.sort(list, new Comparator<Entry<String, Integer>>()
	        {
	            public int compare(Entry<String, Integer> o1,
	                    Entry<String, Integer> o2)
	            {
	              
	                    return o2.getValue().compareTo(o1.getValue());
	            }
	        });

	        // Maintaining insertion order with the help of LinkedList
	        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
	        for (Entry<String, Integer> entry : list)
	        {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        return sortedMap;
	    }
	 
	

	

}
