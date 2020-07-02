package by.htp.book.entity;

public class Book {

	private int id;
	private String name;
	private String authors;
	private String publisher;
	private int year;
	private int numberOfPages;
	private double price;
	private String cover;

	public Book(int id, String name, String authors, String publisher, int year, int numberOfPages, double price,
			String cover) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.cover = cover;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors=" + authors + ", publisher=" + publisher + ", year="
				+ year + ", numberOfPages=" + numberOfPages + ", price=" + price + ", cover=" + cover + "]";
	}

}
