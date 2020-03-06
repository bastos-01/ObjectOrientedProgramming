package aula08;

public class Cereal extends Alimento {
	
	private String nome;

	public Cereal( String nome, double prota, double calorias, double peso) {
		super(prota, calorias, peso);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Cereal [nome=" + nome + ", getNome()=" + getNome() + ", getProta()=" + getProta() + ", getCalorias()="
				+ getCalorias() + ", getPeso()=" + getPeso() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
