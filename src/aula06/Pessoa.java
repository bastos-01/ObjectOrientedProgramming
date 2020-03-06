package aula06;

public class Pessoa {
	private String nome;
	private int cc;
	private Data dataNasc;
	
	//constructors
	public Pessoa(String nome, int cc, Data dataNasc) {
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
	}
	//getters & setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}
	//tostring
	@Override
	public String toString() {
		return nome + ", CC: " + cc + ", Data: " + dataNasc ;
	}
	
	
}
