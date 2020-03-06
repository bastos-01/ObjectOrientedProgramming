package aula05;



public class Biblioteca {
	private Utilizador[] utilizadores = new Utilizador[100];
	private Livro[] livros = new Livro[100];
	int contador1 = 0;
	int contador2 = 0;



	public void inscrever_utilizador(String nome, int nmec, String curso) {
		
		Utilizador utilizador = new Utilizador(nome, nmec, curso);
		utilizadores[contador1] = utilizador;
		contador1+=1;
		
	}	
	
	public boolean remover_utilizador(int nmec) {
	
		boolean check = false;
		
		for (int i = 0; i < 100; i++) {
		
			if (utilizadores[i] != null) {
				
				if (utilizadores[i].getNmec() == nmec) {
					
					utilizadores[i] = null;
					check = true;
					contador1 -=1;
					
				}
			
			}
			
		}
		
		return check;
	
	}
	
	
	public void imprimir_utilizadores() {
		for( int i = 0; i<100; i++) {
			if(utilizadores[i] != null) {
			System.out.println(utilizadores[i]);
			}
		}
	}
	
	public void registarLivro(String titulo, String tipoEmprestimo) {
		
		Livro livro = new Livro(titulo, tipoEmprestimo);
		livros[contador2] = livro;
		contador2+=1;
		
	}
	
	public void imprimirLivros() {
		for(int i=0; i<100; i++) {
			if(livros[i] != null) {
			System.out.println(livros[i]);
			}
		}
	}
	
	
         
	
	
}