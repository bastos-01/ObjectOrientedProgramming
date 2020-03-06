package aula08;

public class PesadoMerc extends AutoPesado {
	
	double cargaMax;

	public PesadoMerc(String matricula, String marca, String modelo, int cilindrada, String numQuadro, double peso, double cargaMax) {
		super(matricula, marca, modelo, cilindrada, numQuadro, peso);
		this.cargaMax = cargaMax;
		
	}

	public double getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}

	@Override
	public String toString() {
		return "PesadoMerc [cargaMax=" + cargaMax + "]";
	}
	
	
		
	
}
