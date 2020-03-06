package aula07;

public class Jogo {
	private Equipa equipa1;
	private Equipa equipa2;
	private Bola bola;
	private Tempo tempoTotal;
	private Tempo tempoDecorrido;
	
	public Jogo(Equipa equipa1, Equipa equipa2, Bola bola, Tempo tempoTotal, Tempo tempoDecorrido) {
		super();
		this.equipa1 = equipa1;
		this.equipa2 = equipa2;
		this.bola = bola;
		this.tempoTotal = tempoTotal;
		this.tempoDecorrido = tempoDecorrido;
	}

	public Equipa getEquipa1() {
		return equipa1;
	}

	public void setEquipa1(Equipa equipa1) {
		this.equipa1 = equipa1;
	}

	public Equipa getEquipa2() {
		return equipa2;
	}

	public void setEquipa2(Equipa equipa2) {
		this.equipa2 = equipa2;
	}

	public Bola getBola() {
		return bola;
	}

	public void setBola(Bola bola) {
		this.bola = bola;
	}

	public Tempo getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(Tempo tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public Tempo getTempoDecorrido() {
		return tempoDecorrido;
	}

	public void setTempoDecorrido(Tempo tempoDecorrido) {
		this.tempoDecorrido = tempoDecorrido;
	}

	@Override
	public String toString() {
		return "Jogo [equipa1=" + equipa1 + ", equipa2=" + equipa2 + ", bola=" + bola + ", tempoTotal=" + tempoTotal
				+ ", tempoDecorrido=" + tempoDecorrido + "]";
	}
	
	
	
	
	
}
