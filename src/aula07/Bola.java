package aula07;

public class Bola extends ObjetoMovel {
	private String cor;

	public Bola(double x, double y, double velMax, double dist, String cor) {
		super(x, y, velMax, dist);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Bola [cor=" + cor + "]";
	}
	
	
	
	
	
}
