package aula05;

public class Utilizador {
	private String nome;
	private int nmec;
	private String curso;
	
	public Utilizador(String nome, int nmec, String curso) {
		this.nome = nome;
		this.nmec = nmec;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNmec() {
		return nmec;
	}

	public void setNmec(int nmec) {
		this.nmec = nmec;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Utilizador [nome=" + nome + ", nmec=" + nmec + ", curso=" + curso + "]";
	}

	
	
	
}
