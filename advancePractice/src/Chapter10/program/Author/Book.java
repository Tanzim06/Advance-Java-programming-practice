package Chapter10.program.Author;

import java.util.List;

public class Book {
	
	private String name;
	private int price;
	private Author author;
	private boolean fiction;
	private BookGenres bookGenres;
	private int rating;
	
	public Book(String name, int price, Author author, boolean fiction, BookGenres bookGenres, int rating) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.fiction = fiction;
		this.bookGenres = bookGenres;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public Book setName(String name) {
		this.name = name;
		return this;
	}

	public int getPrice() {
		return price;
	}

	public Book setPrice(int price) {
		this.price = price;
		return this;
	}

	public Author getAuthor() {
		return author;
	}

	public Book setAuthor(Author author) {
		this.author = author;
		return this;
	}

	public boolean isFiction() {
		return fiction;
	}

	public Book setFiction(boolean fiction) {
		this.fiction = fiction;
		return this;
	}

	public BookGenres getBookGenres() {
		return bookGenres;
	}

	public Book setBookGenres(BookGenres bookGenres) {
		this.bookGenres = bookGenres;
		return this;
	}

	public int getRating() {
		return rating;
	}

	public Book setRating(int rating) {
		this.rating = rating;
		return this;
	}
	

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", fiction=" + fiction
				+ ", bookGenres=" + bookGenres + ", rating=" + rating + "]";
	}
	
	private List<Book> createBooks(){
		Author hAhmed= new Author("Humayun", "Ahmed");
		Author zIqbal= new Author("Zafor", "Iqbal");
		
		return List.of(
				new Book("Nondito Noroke", 90, hAhmed, true, BookGenres.REALSITIS_FICTION, 5),
				new Book("Deyal", 323, hAhmed, true, BookGenres.HISTORICAL_FICTION, 10),
				new Book("Hijibiji", 213, hAhmed, true, BookGenres.HUMOR, 8),
				new Book("Misir Ali Unsolved", 90, hAhmed, true, BookGenres.MYSTERY, 7),
				new Book("Nat Baltu", 132, zIqbal, true, BookGenres.YOUNG_ADULT_FICTION, 6),
				new Book("Ami Topu", 132, zIqbal, true, BookGenres.YOUNG_ADULT_FICTION, 9),
				new Book("Amar Bondhu Rashed", 141, zIqbal, true, BookGenres.HISTORICAL_FICTION, 7),
				new Book("Theory of Relativity", 154, zIqbal, false, BookGenres.REFERANCE_BOOK, 4),
				new Book("Quantam Machanics", 141, zIqbal, false, BookGenres.REFERANCE_BOOK, 2)
				);
	}
}
