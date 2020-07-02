package by.htp.book.view;

import java.util.List;

import by.htp.book.entity.Book;

public class BookView {

	public void print(String message, List<Book> list) {
		System.out.println(message);

		for (Book book : list) {
			if (book == null) {
				System.out.println("null");
			} else {
				System.out.println(book.toString());
			}
		}
		System.out.println();
	}

}
