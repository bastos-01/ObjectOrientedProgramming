package aula08;

public class Peixe extends Alimento {
	
	private TipoPeixe tipo;
	
	public Peixe(TipoPeixe tipo, double prota, double calorias, double peso ) {
		super(prota, calorias, peso);
		this.tipo = tipo;
	}

	public TipoPeixe getTipo() {
		return tipo;
	}

	public void setTipo(TipoPeixe tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Peixe [tipo=" + tipo + ", getTipo()=" + getTipo() + ", getProta()=" + getProta() + ", getCalorias()="
				+ getCalorias() + ", getPeso()=" + getPeso() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
