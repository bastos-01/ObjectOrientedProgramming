package exames1;

public class CabineComVaranda extends Cabine {
	
	private TipoDeVaranda tipoVaranda;
	private Extra extra;

	public CabineComVaranda(int numero, int maxPessoas, TipoDeVaranda tipoVaranda) {
		super(numero, maxPessoas);
		this.tipoVaranda = tipoVaranda;
	}
	
	

	public void setTipoVaranda(TipoDeVaranda tipoVaranda) {
		this.tipoVaranda = tipoVaranda;
	}
	
	public void pacoteExtra(Extra extra) {
		this.extra = extra;
	}



	@Override
	public String toString() {
		return "CabineComVaranda [tipoVaranda=" + tipoVaranda + ", extra=" + extra + "]";
	}
	
	
	
	
	

}
