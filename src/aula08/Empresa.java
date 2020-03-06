package aula08;
import java.util.*;

public class Empresa {
	String nome, codigoPostal, email;
	ArrayList<Veiculo> viaturas = new ArrayList<Veiculo>();
	
	public Empresa(String nome, String codigoPostal, String email) {
		this.nome = nome;
		this.codigoPostal = codigoPostal;
		this.email = email;
	}
	
	public void add(Veiculo x) {
		viaturas.add(x);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Veiculo> getViaturas() {
		return viaturas;
	}

	public void setViaturas(ArrayList<Veiculo> viaturas) {
		this.viaturas = viaturas;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", codigoPostal=" + codigoPostal + ", email="
				+ email;
	}
	
	
	
}
