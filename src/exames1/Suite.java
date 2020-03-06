package exames1;

import java.util.Arrays;

public class Suite extends Cabine {
	
	private int numQuartos;

	public Suite(int numero, int maxPessoas, int numQuartos) {
		super(numero, maxPessoas);
		this.numQuartos = numQuartos;
	}
	
	public Suite(int numero, int maxPessoas) {
		super(numero, maxPessoas);
	}

	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}

	@Override
	public String toString() {
		if(getListaOcupantes() != null) {
			return "Suite c/" + numQuartos + " quartos [ Nº" + getNumero() + "( max " + getMaxPessoas() + " pessoas ) : " + Arrays.toString(getListaOcupantes()) + "]\n";
			}
		else {
			return "Suite c/" + numQuartos + " quartos [ Nº" + getNumero() + "( max " + getMaxPessoas() + " pessoas ) : " + "Disponível para venda! " + "]\n";
		}
		
	}

	public int getNumQuartos() {
		return numQuartos;
	}
	
	
	
	
	
	

}
