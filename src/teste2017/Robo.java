package teste2017;

public class Robo extends ObjetoMovel  implements Comparable<Robo>{
	
	private String id;
	private TipoJogador tipo;
	private int golos;
	private String equipa;
	private String tipoJogador;
	
	public Robo(String id, TipoJogador tipo, int x, int y) {
		super(x, y);
		this.id = id;
		this.tipo = tipo;
	}
	
	public Robo(String id,String equipa, String tipoJogador ) {
		super(0,0);
		this.id = id;
		this.equipa = equipa;
		this.tipoJogador = tipoJogador;
	}
	public String getTipoJogador() {
		return tipoJogador;
	}
	
	public String getEquipa() {
		return equipa;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoJogador getTipo() {
		return tipo;
	}

	public void setTipo(TipoJogador tipo) {
		this.tipo = tipo;
	}

	public int getGolos() {
		return golos;
	}

	public void setGolos(int numGolosMarcados) {
		this.golos = numGolosMarcados;
	}

	
	public void marcaGolo() {
		this.golos += 1;
		
	}
	
	

	@Override
	public int compareTo(Robo o) {
		return this.id.compareTo(o.id);
	}

	@Override
	public String toString() {
		return  "=Equipa " + ", treinada por Unknown (1 jogadores) " + "robos= id=" + id + ", tipo= " + tipoJogador +  "*;*\n" + "golosMarcados= " + golos ;
	}
	
	
	

}
