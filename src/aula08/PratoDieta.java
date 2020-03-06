package aula08;

import java.util.Arrays;

public class PratoDieta extends Prato {
	
	private double maxCalorias;

	public PratoDieta(String nome, double maxCalorias) {
		super(nome);
		this.maxCalorias = maxCalorias;
	}

	public double getMaxCalorias() {
		return maxCalorias;
	}

	public void setMaxCalorias(double maxCalorias) {
		this.maxCalorias = maxCalorias;
	}

	@Override
	public String toString() {
		return "PratoDieta [maxCalorias=" + maxCalorias + ", getMaxCalorias()=" + getMaxCalorias() + ", getNome()="
				+ getNome() + ", getDiaSem()=" + getDiaSem() + ", getNIngredientes()=" + getNIngredientes()
				+ ", getCalorias()=" + getCalorias() + ", getProteinas()=" + getProteinas() + ", getPesoTotal()="
				+ getPesoTotal() + ", toString()=" + super.toString() + ", removeAll()=" + removeAll() + ", size()="
				+ size() + ", isEmpty()=" + isEmpty() + ", giveElements()=" + Arrays.toString(giveElements())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}
