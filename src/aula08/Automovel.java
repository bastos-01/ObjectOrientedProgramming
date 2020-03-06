package aula08;

public class Automovel extends Veiculo{
	
		String numQuadro;

	public Automovel(String matricula, String marca, String modelo, int cilindrada, String numQuadro) {
		super(matricula, marca, modelo, cilindrada);
		this.numQuadro = numQuadro;
	}

	public String getNumQuadro() {
		return numQuadro;
	}

	public void setNumQuadro(String numQuadro) {
		this.numQuadro = numQuadro;
	}

	@Override
	public String toString() {
		return "Automovel [numQuadro=" + numQuadro + "]";
	}
	
	
	
}
