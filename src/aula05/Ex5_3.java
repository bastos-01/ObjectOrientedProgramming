package aula05;

import java.util.Scanner;

public class Ex5_3 {
		
	
		
	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int resposta;
		do {
		System.out.println("1 - inscrever utilizador");
		System.out.println("2 - remover utilizador");
		System.out.println("3 - imprimir lista de utilizadores");
		System.out.println("4 - registar um novo livro");
		System.out.println("5 - imprimir lista de livros");
		System.out.println("8 - sair");
		resposta = input.nextInt();
		
		
		
		switch (resposta) {
		
		
			case 1 : System.out.println("Insira o nome: "); 
					 String nome = sc.nextLine();
					 System.out.println("Insira o nmec: "); 
					 int nmec = input.nextInt();
					 System.out.println("Insira o curso: "); 
					 String curso = input.next();
					 biblioteca.inscrever_utilizador(nome, nmec, curso);
					 
					 break;
			
			case 2 : System.out.println("Insira o nmec: "); 
					 nmec = input.nextInt();
					 if(biblioteca.remover_utilizador(nmec)) {
						 System.out.println("removido");
					 }
					 else {
						 System.out.println("nao removido");
					 }
					 break;
					 
			case 3 : biblioteca.imprimir_utilizadores();
					 break;
					 
			case 4 : System.out.println("Introduza o titulo: ");
					 String titulo = sc.nextLine();
					 System.out.println("Introduza o tipo de emprestimo: ");
					 String tipoEmprestimo = sc.nextLine();
					 biblioteca.registarLivro(titulo, tipoEmprestimo);
					 break;
					 
			case 5 : biblioteca.imprimirLivros();
					 break;
			
			case 8 : System.out.println("Saiu!");
					 break;
					
					
			
					 
		}	}while(resposta!=8);
		
		
		input.close();
		sc.close();
		
		
		
	}
	
	



}
