package aula08;

public class AutoPesado extends Automovel{
	
	double peso;

	public AutoPesado(String matricula, String marca, String modelo, int cilindrada, String numQuadro, double peso) {
		super(matricula, marca, modelo, cilindrada, numQuadro);
		this.peso = peso;
		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "AutoPesado [peso=" + peso + "]";
	}
	
	
	
	

}
