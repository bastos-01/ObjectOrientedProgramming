package aula07;

public abstract class Alojamento {
	private String codigo;
	private String nome;
	private String local;
	private double precoPorNoite;
	private boolean disponibilidade = true;
	private double avaliacao;
	
	public Alojamento(String codigo, String nome, String local, double precoPorNoite, boolean disponibilidade, double avaliacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.local = local;
		this.precoPorNoite = precoPorNoite;
		this.disponibilidade = disponibilidade;
		this.avaliacao = avaliacao;
	}
	public Alojamento(String codigo, String nome, String local, double precoPorNoite, double avaliacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.local = local;
		this.precoPorNoite = precoPorNoite;
		this.avaliacao = avaliacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public double getPrecoPorNoite() {
		return precoPorNoite;
	}

	public void setPrecoPorNoite(double precoPorNoite) {
		this.precoPorNoite = precoPorNoite;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		return "Alojamento [codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", precoPorNoite=" + precoPorNoite + ", disponibilidade=" + disponibilidade + ", avaliacao=" + avaliacao + "]";
	}
	
	public void checkIn() {
		this.disponibilidade = false;
	}
	
	public void checkOut() {
		this.disponibilidade = true;
	}
	
	
}
