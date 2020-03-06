package Estudo;

public class Book {
	
		private String title;
		private int pubYear;
		private String isbn;
		
		public Book(String title, int pubYear, String isbn){
			this.title = title;
			this.pubYear = pubYear;
			this.isbn = isbn;
		}
		public Book(String title, int pubYear){
			this.title = title;
			this.pubYear = pubYear;
		}
		public Book(String title){
			this.title = title;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getPubYear() {
			return pubYear;
		}

		public void setPubYear(int pubYear) {
			this.pubYear = pubYear;
		}

		public String getISBN() {
			return isbn;
		}

		public void setISBN(String isbn) {
			this.isbn = isbn;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", pubYear=" + pubYear + ", isbn=" + isbn + "]";
		}
		
	
}
