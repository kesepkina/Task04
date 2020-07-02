package by.htp.book.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.book.entity.Book;

public class BookLogic {

	public List<Book> FindByAuthor(List<Book> bookList, String searchedAuthor) {
		List<Book> filteredList = new ArrayList<Book>();

		for (Book book : bookList) {
			if (book.getAuthors().contains(searchedAuthor)) {
				filteredList.add(book);
			}
		}

		return filteredList;
	}

	public List<Book> FindByPublisher(List<Book> bookList, String searchedPublisher) {
		List<Book> filteredList = new ArrayList<Book>();

		for (Book book : bookList) {
			if (book.getPublisher().equals(searchedPublisher)) {
				filteredList.add(book);
			}
		}

		return filteredList;
	}

	public List<Book> FindByYear(List<Book> bookList, int minyear) {
		List<Book> filteredList = new ArrayList<Book>();

		for (Book book : bookList) {
			if (book.getYear() > minyear) {
				filteredList.add(book);
			}
		}

		return filteredList;
	}

}
