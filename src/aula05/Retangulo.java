package aula05;

public class Retangulo {
	
	private double comprimento;
	private double altura;
	
	public Retangulo(double comprimento, double altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", altura=" + altura + "]";
	}
	public double getArea() {
		return this.comprimento * this.altura;
	}
	public double getPerimetro() {
		return this.comprimento*2 + this.altura*2;
	}
	
	
}
