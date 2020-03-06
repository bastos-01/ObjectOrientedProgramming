package exames1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Cruzeiro{
	
	private String nomeNavio;
	private String[] cidadesVisitadas;
	private String data;
	private Set<Cabine> conjuntoCabines = new TreeSet<>();
	@SuppressWarnings("unused")
	private int duracao;
	
	public Cruzeiro(String nomeNavio, String[] cidadesVisitadas, String data) {
		super();
		this.nomeNavio = nomeNavio;
		this.cidadesVisitadas = cidadesVisitadas;
		this.data = data;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void add(CabineComJanela ccj) {
		conjuntoCabines.add(ccj);
	}
	
	public void add(Suite suite) {
		conjuntoCabines.add(suite);
	}
	
	public void add(CabineComVaranda ccv) {
		if(ccv.getMaxPessoas() > ccv.getListaOcupantes().length) {
			conjuntoCabines.add(ccv);
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public void add(Cabine cabine) {
		conjuntoCabines.add(cabine);
	}

	@Override
	public String toString() {
		return "Navio " + nomeNavio + ", partida em " + data + "\nItenerário: " + Arrays.toString(cidadesVisitadas) + "\n" + imprimir();
	}
	
	public String imprimir() {
		String x = "";
		for(Cabine c: conjuntoCabines) 
			x += c;
		return x;
	}
	
	public double percentagemCabines() {
		double disponiveis = 0;
		for(Cabine c: conjuntoCabines) {
			if(c.getListaOcupantes() == null) {
				disponiveis++;
			}
			
		}
		double percentagem = ((disponiveis/conjuntoCabines.size()) * 100);
		return percentagem;
	}
	public double mediaPessoas() {
		double nPessoas = 0;
		double nQuartos = 0;
		for(Cabine cab: conjuntoCabines) {
			if(cab instanceof Suite) {
				if(cab.getListaOcupantes() != null) {
					nPessoas += cab.getListaOcupantes().length;
					nQuartos += ((Suite) cab).getNumQuartos();
				}
			}
		}
		return nPessoas/nQuartos;
	}

	public Set<Cabine> getConjuntoCabines() {
		return conjuntoCabines;
	}
	
	
	
}
