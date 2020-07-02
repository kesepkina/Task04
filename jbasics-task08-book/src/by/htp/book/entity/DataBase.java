package by.htp.book.entity;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	private List<Book> BookList;

	public DataBase() {
		BookList = new ArrayList<Book>();
	}

	public List<Book> getBookList() {
		return BookList;
	}

	public void addBook(Book book) {
		BookList.add(book);
	}

}
