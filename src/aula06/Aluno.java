package aula06;

public class Aluno extends Pessoa {
	private int nmec;
	private Data dataIns;
	private static int contador = 100;
	
	//constructors
	public Aluno(String nome, int cc, Data dataNasc, Data dataIns) {
		super(nome, cc, dataNasc); //atributos da Pessoa
		this.dataIns = dataIns;
		this.nmec = contador;
		contador ++;
		
	}
	
	public Aluno(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc); //atributos da Pessoa
		this.nmec = contador;
		contador ++;
	}
	
	//getters & setters
	public int getNmec() {
		return nmec;
	}

	public void setNmec(int nmec) {
		this.nmec = nmec;
	}

	public Data getDataIns() {
		return dataIns;
	}

	public void setDataIns(Data dataIns) {
		this.dataIns = dataIns;
	}
	//tostring

	@Override
	public String toString() {
		return "Aluno=" + getNome() + ", nmec=" + nmec + ", Data de inscrição=" + dataIns + ", CC=" + getCc()
				+ ", Data de nascimento=" + getDataNasc();
	}
	
	
	
}
