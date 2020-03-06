package aula08;



public class Motociclo extends Veiculo {
	
	String tipo;

	public Motociclo(String matricula, String marca, String modelo, int cilindrada, String tipo) {
		super(matricula, marca, modelo, cilindrada);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Motociclo [tipo=" + tipo + "]";
	}
	
	
}
