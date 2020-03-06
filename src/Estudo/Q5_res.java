package Estudo;

public class Q5_res {

	public static void main(String[] args) {
		Book books[] = new Book[10];
		books[0] = new Book("Turismo em Aveiro", 1980); 
		books[1] = new Book("Javaland", 2019, "1234-756"); 
		books[2] = new Book("Mau tempo na ria");
		books[3] = books[0];
		for (int i = 0; i < 4; i++) 
			System.out.println(books[i]); // Resultado 1
		
		System.out.println(books[0].getTitle().toUpperCase()); // Resultado 2
		books[0].setISBN("9876-1234");
		System.out.println(books[0].getISBN());
		books[2] = null;
		for (int i = 0; i < books.length; i++) // Resultado 3 
			System.out.println(i + ": " + (books[i] != null ? books[i].getTitle() : "--- Posição vazia"));
	} 
		
}


