package exames1;


public class Cabine implements Comparable<Cabine> {
	
	private int numero;
	private int maxPessoas;
	private String[] listaOcupantes;
	
	public Cabine(int numero, int maxPessoas) {
		this.numero = numero;
		this.maxPessoas = maxPessoas;
	}
	
	public Cabine(int numero, int maxPessoas, String[] listaOcupantes) {
		super();
		this.numero = numero;
		this.maxPessoas = maxPessoas;
		this.listaOcupantes = listaOcupantes;
	}

	public String[] getListaOcupantes() {
		return listaOcupantes;
	}

	public void setPassageiros(String[] listaOcupantes) {
		this.listaOcupantes = listaOcupantes;
	}

	public void setMaxOcupantes(int maxPessoas) {
		this.maxPessoas = maxPessoas;
	}

	@Override
	public int compareTo(Cabine o) {
		
		if(this.numero>o.numero) {
			return 1;
		}
		else if(this.numero<o.numero) {
			return -1;
		}
		else{
			return 0;
		}
	}

	public int getNumero() {
		return numero;
	}

	public int getMaxPessoas() {
		return maxPessoas;
	}
	
	

	
	
	
	
	
	
	
	
	
	

}
