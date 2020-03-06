package aula08;

public abstract class Alimento {

	private double prota, calorias, peso;

	public Alimento(double prota, double calorias, double peso) {
		this.prota = prota;
		this.calorias = calorias;
		this.peso = peso;
	}
	
	public double getProta() {
		return prota;
	}

	public void setProta(double prota) {
		this.prota = prota;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Alimento [prota=" + prota + ", calorias=" + calorias + ", peso=" + peso + "]";
	}
	
	
	
	
}
