package aula08;

public class AutoLigeiro extends Automovel {
	
	double capacidade;

	public AutoLigeiro(String matricula, String marca, String modelo, int cilindrada, String numQuadro, double capacidade) {
		super(matricula, marca, modelo, cilindrada, numQuadro);
		this.capacidade = capacidade;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "AutoLigeiro [capacidade=" + capacidade + "]";
	}
	
	
	
}
