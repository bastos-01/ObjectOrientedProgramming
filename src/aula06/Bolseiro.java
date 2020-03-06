package aula06;

public class Bolseiro extends Aluno{
	private double montante;
	
	//constructors
	public Bolseiro(String nome, int cc, Data dataNasc, Data dataIns) {
		super(nome, cc, dataNasc, dataIns);//atributos de aluno
	}

	public Bolseiro(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);//atributos de aluno
	}
	
	public Bolseiro(String nome, int cc, Data dataNasc, Data dataIns, double montante) {
		super(nome, cc, dataNasc, dataIns);//atributos de aluno
		this.montante = montante;
	}
	
	//getters & setters
	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}
	//tostring
	@Override
	public String toString() {
		return "Bolseiro montante: " + montante ;
	}
	
	
	
	

}
