package aula07;

import java.util.ArrayList;

public class AgenciaViagens {
	private String nome;
	private String endereco;
	private ArrayList<Alojamento> alojamentos = new ArrayList<>();
	private ArrayList<Carro> carros = new ArrayList<>();
	
	public AgenciaViagens(String nome, String endereco, ArrayList<Alojamento> alojamentos, ArrayList<Carro> carros) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.alojamentos = alojamentos;
		this.carros = carros;
	}
	public AgenciaViagens(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Alojamento> getAlojamentos() {
		return alojamentos;
	}

	public void setAlojamentos(ArrayList<Alojamento> alojamentos) {
		this.alojamentos = alojamentos;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Carro> viaturas) {
		this.carros = viaturas;
	}
	
	public void addAlojamento(Alojamento al) {
		alojamentos.add(al);
	}
	
	public void removeAlojamento(Alojamento al) {
		alojamentos.remove(al);
	}
	
	public Alojamento getAlojamento(String codigo) {
		for(Alojamento a : alojamentos)
			if(a.getCodigo() == codigo) {
				return a;
			}
		return null;
	}
	public void addCarro(Carro carro) {
		carros.add(carro);
	}
	public void removeCarro(Carro carro) {
		carros.add(carro);
	}
	

	@Override
	public String toString() {
		return "AgenciaViagens [nome=" + nome + ", endereco=" + endereco + ", alojamentos=" + alojamentos + ", viaturas=" + carros + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
