package aula07;

import java.util.Arrays;

public class Equipa {
	private String nome;
	private String nomeResponsavel;
	private int golosMarcados;
	private int golosSofridos;
	private Robo[] equipa = new Robo[11];
	
	public Equipa(String nome, String nomeResponsavel, int golosMarcados, int golosSofridos, Robo[] equipa) {
		this.nome = nome;
		this.nomeResponsavel = nomeResponsavel;
		this.golosMarcados = golosMarcados;
		this.golosSofridos = golosSofridos;
		this.equipa = equipa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public int getGolosMarcados() {
		return golosMarcados;
	}

	public void setGolosMarcados(int golosMarcados) {
		this.golosMarcados = golosMarcados;
	}

	public int getGolosSofridos() {
		return golosSofridos;
	}

	public void setGolosSofridos(int golosSofridos) {
		this.golosSofridos = golosSofridos;
	}

	public Robo[] getEquipa() {
		return equipa;
	}

	public void setEquipa(Robo[] equipa) {
		this.equipa = equipa;
	}

	@Override
	public String toString() {
		return "Equipa [nome=" + nome + ", nomeResponsavel=" + nomeResponsavel + ", golosMarcados=" + golosMarcados
				+ ", golosSofridos=" + golosSofridos + ", equipa=" + Arrays.toString(equipa) + "]";
	}
	
	
	
	
}
