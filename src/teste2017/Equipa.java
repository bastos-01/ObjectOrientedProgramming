package teste2017;
import java.util.*;

public class Equipa {
	
	private String nome;
	private String nomeResponsavel;
	private int golosMarcados;
	private int golosSofridos;
	private Set<Robo> robos = new TreeSet<>();
	
	public Equipa(String nome, String nomeResponsavel) {
		this.nome = nome;
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public int getGolosMarcados() {
		for(Robo r: robos) {
			golosMarcados += r.getGolos();
		}
		return golosMarcados;
	}

	public void setGolosMarcados(int totalGolosMarcados) {
		this.golosMarcados = totalGolosMarcados;
	}

	public int getGolosSofridos() {
		return golosSofridos;
	}

	public void setGolosSofridos(int totalGolosSofridos) {
		this.golosSofridos = totalGolosSofridos;
	}

	public void setRobos(TreeSet<Robo> robos) {
		this.robos = robos;
	}

	@Override
	public String toString() {
		return "Equipa " + nome + ", treinada por " + nomeResponsavel + " (" + robos.size() + " jogadores) \n" +
				 "robos=" + robos + "\n" + "golos marcados=" + golosMarcados +"\n" ;
	}
	
	public void add(Robo robo) {
		robos.add(robo);
	}
	
	public void remove(Robo robo) {
		robos.remove(robo);
	}
	
	public Robo[] getRobos() {
		Robo[] r = new Robo[robos.size()];
		int i = 0;
		for(Robo rob: robos) {
			r[i] = rob;
			i++;
		}
		return r;
	}
	
	
	
	
}
