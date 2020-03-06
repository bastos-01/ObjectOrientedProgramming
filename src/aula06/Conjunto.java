package aula06;

import java.util.Arrays;

public class Conjunto {

	private int[] conjunto = new int[0];
	private int[] antigo;
	
	public int[] getConjunto() {
		return conjunto;
	}

	public void insert(int n) {
		if(!contains(n)) {
			antigo = conjunto;
			conjunto = new int[conjunto.length+1];
			 for(int i=0;i<antigo.length;i++) {
				 conjunto[i]= antigo[i];
			 }
			 conjunto[antigo.length]=n; 
		}
	}
	
	public boolean contains(int n) {
		boolean verif = false;
		for(int i=0; i<conjunto.length; i++) {
			if(n==conjunto[i]) {
				verif = true;
			}
		}
		return verif;
	}
	
	public void remove(int n) {
		if(contains(n)) {
			antigo = conjunto;
			conjunto = new int[conjunto.length-1];
			int b=0;
			 for(int i=0;i<antigo.length;i++) {
				if(!(antigo[i]==n)) {
					conjunto[b]=antigo[i];
					b++;
				}	
			 }
		}
	}
	
	public void empty() {
		conjunto = new int[0];
	}
	
	public int size() {
		return conjunto.length;
	}
	
	public Conjunto unir (Conjunto add) {
		int conjunto2[] = add.getConjunto();
		Conjunto conjuntoUnido = new Conjunto();
		boolean exists;
		for(int i=0; i<conjunto.length;i++) {
			conjuntoUnido.insert(conjunto[i]); //copiar o primeiro array para o conjunto final
		}
		for(int c=0; c<conjunto2.length; c++) {
			exists = false;
			for(int k=0; k<conjunto.length; k++) {
				if(conjunto2[c]==conjunto[k]) {
					exists = true;
				}	
			}
			if(!exists) { //se nao é comum, adiciona-se o valor ao conjunto final
				conjuntoUnido.insert(conjunto2[c]);
			}
		}
		return conjuntoUnido;
	}
	
	public Conjunto subtrair(Conjunto dif) {
		int conjunto2[] = dif.getConjunto();
		Conjunto conjuntoMenor = new Conjunto();
		boolean exists;
		for(int i=0; i<conjunto.length;i++) {
			conjuntoMenor.insert(conjunto[i]);//copiar o primeiro array para o conjunto final
		}
		for(int c=0; c<conjunto2.length; c++) {
			exists = false;
			for(int k=0; k<conjunto.length; k++) {
				if(conjunto2[c]==conjunto[k]) {
					exists = true;
				}	
			}
			if(exists) { //se existe no primeiro array e existe no segundo, remove-se o valor do conjunto final
				conjuntoMenor.remove(conjunto2[c]);
			}
		}
		return conjuntoMenor;
	}
	
	public Conjunto interset(Conjunto inter) {
		int conjunto2[] = inter.getConjunto();
		Conjunto conjuntoInterset = new Conjunto();
		boolean exists;
		for(int c=0; c<conjunto2.length; c++) {
			exists = false;
			for(int k=0; k<conjunto.length; k++) {
				if(conjunto2[c]==conjunto[k]) {
					exists = true;
				}	
			}
			if(exists) { //se é comum, adiciona-se ao conjunto final
				conjuntoInterset.insert(conjunto2[c]);
			}
		}
		return conjuntoInterset;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(conjunto);
	}
	
}


