package aula07;

public class Robo extends ObjetoMovel{
	private String id;
	private String tipoJog;
	private int golos = 0;
	
	public Robo(double x, double y, double velMax, double dist, String id, String tipoJog, int golos) {
		super(x, y, velMax, dist);
		this.id = id;
		this.tipoJog = tipoJog;
		this.golos = golos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipoJog() {
		return tipoJog;
	}

	public void setTipoJog(String tipoJog) {
		this.tipoJog = tipoJog;
	}

	public int getGolosMarcados() {
		return golos;
	}

	public void setGolosMarcados(int golosMarcados) {
		this.golos = golosMarcados;
	}
	
	public void marcarGolo() {
		this.golos++;
	}

	@Override
	public String toString() {
		return "Robo [id=" + id + ", tipoJog=" + tipoJog + "]";
	}
	
	
	
	
	
}
