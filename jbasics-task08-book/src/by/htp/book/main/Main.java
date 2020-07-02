package by.htp.book.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.book.entity.Book;
import by.htp.book.entity.DataBase;
import by.htp.book.logic.BookLogic;
import by.htp.book.view.BookView;

public class Main {

	/*
	 * Создать класс Book, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Book, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Book: id,
	 * название, автор(ы), издательство, год издания, количество страниц, цена, тип
	 * переплета. Найти и вывести: a) список книг заданного автора; b) список книг,
	 * выпущенных заданным издательством; c) список книг, выпущенных после заданного
	 * года.
	 */

	public static void main(String[] args) {

		DataBase database1 = new DataBase();
		BookLogic logic = new BookLogic();
		BookView view = new BookView();

		database1.addBook(new Book(1, "Прислуга", "Кэттрин Стокетт", "Фантом Пресс", 2016, 512, 20, "твёрдый"));
		database1.addBook(
				new Book(2, "Бегущий за ветром", "Халед Хоссейни", "Фантом Пресс", 2011, 330, 25.50, "твёрдый"));
		database1.addBook(
				new Book(3, "Тысяча сияющих солнц", "Халед Хоссейни", "Фантом Пресс", 2013, 310, 10.35, "мягкий"));
		database1.addBook(
				new Book(4, "Унесённые ветром. Том 1", "Маргарет Митчелл", "Эксмо", 2013, 790, 8.30, "мягкий"));
		database1.addBook(
				new Book(5, "Унесённые ветром. Том 2", "Маргарет Митчелл", "Эксмо", 2013, 770, 8.20, "мягкий"));

		List<Book> listByAuthor = new ArrayList<Book>();
		String author = "Хоссейни";
		listByAuthor = logic.FindByAuthor(database1.getBookList(), author);
		view.print("Книги автора " + author, listByAuthor);

		List<Book> listByPublisher = new ArrayList<Book>();
		String publisher = "Фантом Пресс";
		listByPublisher = logic.FindByPublisher(database1.getBookList(), publisher);
		view.print("Книги издательства " + publisher, listByPublisher);

		List<Book> listByYear = new ArrayList<Book>();
		int year = 2014;
		listByYear = logic.FindByYear(database1.getBookList(), year);
		view.print("Книги, выпущенные после " + year + " года", listByYear);
	}

}
