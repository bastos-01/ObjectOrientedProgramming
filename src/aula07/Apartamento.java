package aula07;

public class Apartamento extends Alojamento {
	private int numeroQuartos;

	public Apartamento(String codigo, String nome, String local, double precoPorNoite, boolean disponibilidade, double avaliacao, int numeroQuartos) {
		super(codigo, nome, local, precoPorNoite, disponibilidade, avaliacao);
		this.numeroQuartos = numeroQuartos;
	}
	public Apartamento(String codigo, String nome, String local, double precoPorNoite, double avaliacao, int numeroQuartos) {
		super(codigo, nome, local, precoPorNoite, avaliacao);
		this.numeroQuartos = numeroQuartos;
	}

	public int getNumeroQuartos() {
		return numeroQuartos;
	}

	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}

	@Override
	public String toString() {
		return "Apartamento - código: " + getCodigo() + ", nome: " + getNome() + ", local: " + getLocal() + ", preço por noite: " + getPrecoPorNoite() + ", disponibilidade: " + isDisponibilidade() + ", avaliação: " + getAvaliacao() + ", número de quartos: " + numeroQuartos;
	}
	
	
		
}
