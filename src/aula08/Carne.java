package aula08;

public class Carne extends Alimento {
	
	private VariedadeCarne variedade;

	public Carne(VariedadeCarne variedade, double prota, double calorias, double peso) {
		super(prota, calorias, peso);
		this.variedade = variedade;
		
	}
	
	public VariedadeCarne getVariedade() {
		return variedade;
	}

	public void setVariedade(VariedadeCarne variedade) {
		this.variedade = variedade;
	}

	@Override
	public String toString() {
		return "Carne [variedade=" + variedade + ", getVariedade()=" + getVariedade() + ", getProta()=" + getProta()
				+ ", getCalorias()=" + getCalorias() + ", getPeso()=" + getPeso() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	
	
}
