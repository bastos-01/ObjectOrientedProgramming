package aula07;

public class Carro {
	private String classe;
	private String combustivel;
	private String codigo;
	private boolean disponivel = true;
	
	public Carro(String classe, String combustivel, boolean disponivel) {
		this.classe = classe;
		this.combustivel = combustivel;
		this.disponivel = disponivel;
	}
	public Carro(String codigo, String classe, String combustivel) {
		this.codigo = codigo;
		this.classe = classe;
		this.combustivel = combustivel;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public boolean getAlugado() {
		return disponivel;
	}
	public void setAlugado(boolean disponivel) {
		this.disponivel = disponivel;
	}
	@Override
	public String toString() {
		return "Carro - código: " + codigo + ", classe: " + classe + ", combustível: " + combustivel;
	}
	public void levantar() {
		this.disponivel = false;
	}
	public void entregar() {
		this.disponivel = true;
	}
	
	
	
}
