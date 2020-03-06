package teste2017;

public class Jogo {

	private Equipa e1;
	private Equipa e2;
	private Bola bola;
	private int tempoTotal;
	private int tempoDecorrido;
	
	public Jogo(Equipa e1, Equipa e2, Bola bola, int tempoTotal) {
		this.e1 = e1;
		this.e2 = e2;
		this.bola = bola;
		this.tempoTotal = tempoTotal;
	}
	

	@Override
	public String toString() {
		return "Jogo entre " + e1.getNome() + " e " + e2.getNome();
	}


	public Equipa getE1() {
		return e1;
	}


	public void setE1(Equipa e1) {
		this.e1 = e1;
	}


	public Equipa getE2() {
		return e2;
	}


	public void setE2(Equipa e2) {
		this.e2 = e2;
	}


	public Bola getBola() {
		return bola;
	}


	public void setBola(Bola bola) {
		this.bola = bola;
	}


	public int getTempoTotal() {
		return tempoTotal;
	}


	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}


	public int getTempoDecorrido() {
		return tempoDecorrido;
	}


	public void setTempoDecorrido(int tempoDecorrido) {
		this.tempoDecorrido = tempoDecorrido;
	}
	
	
	
	
	
	
	
}
