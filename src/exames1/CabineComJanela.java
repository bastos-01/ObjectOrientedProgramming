package exames1;

import java.util.Arrays;

public class CabineComJanela extends Cabine {
	
	private TipoDeJanela tipoJanela;
	@SuppressWarnings("unused")
	private Extra extra;

	public CabineComJanela(int numero, int maxPessoas, TipoDeJanela tipoJanela) {
		super(numero, maxPessoas);
		this.tipoJanela = tipoJanela;
		
	}
	
	public CabineComJanela(int numero, int maxPessoas, TipoDeJanela tipoJanela, String[] listaOcupantes) {
		super(numero, maxPessoas, listaOcupantes);
		this.tipoJanela = tipoJanela;
		
	}



	public void setPassageiros(String[] lista) {
		super.setPassageiros(lista);
	}
	
	public void pacoteExtra(Extra extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		if(getListaOcupantes() != null) {
			return "Cabine com janela " + tipoJanela + "[ Nº" + getNumero() +"( max " + getMaxPessoas() + " pessoas ) : " + Arrays.toString(getListaOcupantes()) + "]\n";
		}
		else {
			return "Cabine com janela " + tipoJanela + "[ Nº" + getNumero() +"( max " + getMaxPessoas() + " pessoas ) : " + "Disponível para venda! " + "]\n";
		}
	}
	
	
	
	

}
