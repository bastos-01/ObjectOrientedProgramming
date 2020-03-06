package aula05;

public class Livro {
	private int id;
	private String titulo;
	private String tipoEmprestimo = "NORMAL";
	private static int currentId = 100;
	
	
	
	public Livro(String titulo, String tipoEmprestimo) {
		this.titulo = titulo;
		this.tipoEmprestimo = tipoEmprestimo;
		id = currentId;
		currentId += 1;
	}
	public Livro(String titulo) {
		this.titulo = titulo;
		id = currentId;
		currentId += 1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipoEmprestimo() {
		return tipoEmprestimo;
	}
	public void setTipoEmprestimo(String tipoEmprestimo) {
		this.tipoEmprestimo = tipoEmprestimo;
	}
	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", tipoEmprestimo=" + tipoEmprestimo + "]";
	}
	
	
	
}
