package aula08;

public class Taxi extends AutoLigeiro {
	
	double numLicenca;

	public Taxi(String matricula, String marca, String modelo, int cilindrada, String numQuadro, double capacidade, double numLicenca) {
		super(matricula, marca, modelo, cilindrada, numQuadro, capacidade);
		this.numLicenca = numLicenca;
	}

	public double getNumLicenca() {
		return numLicenca;
	}

	public void setNumLicenca(double numLicenca) {
		this.numLicenca = numLicenca;
	}

	@Override
	public String toString() {
		return "Taxi [numLicenca=" + numLicenca + "]";
	}
	
	
	
}
