package aula07;

public class QuartoHotel extends Alojamento {
	private String tipoQuarto;
	
	public QuartoHotel(String codigo, String nome, String local, double precoPorNoite, boolean disponibilidade, double avaliacao, String tipoQuarto) {
		super(codigo, nome, local, precoPorNoite, disponibilidade, avaliacao);
		this.tipoQuarto = tipoQuarto;
	}
	public QuartoHotel(String codigo, String nome, String local, double precoPorNoite, double avaliacao, String tipoQuarto) {
		super(codigo, nome, local, precoPorNoite, avaliacao);
		this.tipoQuarto = tipoQuarto;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	@Override
	public String toString() {
		return "Quarto de hotel - código: " + getCodigo() + ", nome: " + getNome() + ", local: " + getLocal() + ", preço por noite: " + getPrecoPorNoite() + ", disponibilidade: " + isDisponibilidade() + ", avaliação: " + getAvaliacao() + ", tipo de quarto: " + tipoQuarto;
	}
	
	
	
	
	
}
