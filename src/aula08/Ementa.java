package aula08;

import java.util.*;

public class Ementa extends Conjunto<Prato> {
	
	private String nome, local;
	private ArrayList<Prato> pratos;
	
	public Ementa(String nome, String local) {
		super();
		this.nome = nome;
		this.local = local;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public ArrayList<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}

	@Override
	public String toString() {
		return "Ementa [nome=" + nome + ", local=" + local + ", pratos=" + pratos + "]";
	}
	
	public void addPrato(Prato prato, DiaSemana dia) {
		prato.setDiaSem(dia);
		this.addIngrediente(prato);
	}
	
	
	
	
}
