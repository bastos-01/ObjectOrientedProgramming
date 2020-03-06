package aula08;

public class PesadoPassageiros extends AutoPesado {
	
	double maxPassageiros;

	public PesadoPassageiros(String matricula, String marca, String modelo, int cilindrada, String numQuadro, double peso, double maxPassageiros) {
		super(matricula, marca, modelo, cilindrada, numQuadro, peso);
		this.maxPassageiros = maxPassageiros;
	}

	public double getMaxPassageiros() {
		return maxPassageiros;
	}

	public void setMaxPassageiros(double maxPassageiros) {
		this.maxPassageiros = maxPassageiros;
	}

	@Override
	public String toString() {
		return "PesadoPassageiros [maxPassageiros=" + maxPassageiros + "]";
	}
	
	
	

}
