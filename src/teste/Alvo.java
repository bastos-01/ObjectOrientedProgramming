package teste;

public class Alvo extends Circulo {
	private String cor;
	public Alvo(int x, int y, String cor ) {
		super(x, y);
		this.cor = cor;
		// TODO Auto-generated constructor stub
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Alvo [cor=" + cor + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	

}
