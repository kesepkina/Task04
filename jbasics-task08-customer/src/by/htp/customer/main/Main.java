package by.htp.customer.main;

import java.util.List;

import by.htp.customer.entity.Customer;
import by.htp.customer.entity.DataBase;
import by.htp.customer.logic.CustomerLogic;
import by.htp.customer.view.CustomersView;

public class Main {

	/*
	 * Создать класс Customer, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Класс
	 * Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер
	 * банковского счета. Найти и вывести: a) список покупателей в алфавитном
	 * порядке; b) список покупателей, у которых номер кредитной карточки находится
	 * в заданном интервале.
	 */

	public static void main(String[] args) {

		DataBase database1 = new DataBase();
		CustomerLogic logic = new CustomerLogic();
		CustomersView view = new CustomersView();

		database1.addCustomer(new Customer(1, "Петров", "Алексей", "Иванович", "г. Брест, ул.Ленина 23-12",
				1234_5432_3456_7654l, "BY06 BDHS 2341 0000 0010 0000 0000"));
		database1.addCustomer(new Customer(2, "Мищенко", "Виталий", "Фёдорович", "г. Минск, ул.Ленина 25-30",
				1234_5432_9854_7654l, "BY07 BDHS 6347 0010 000 0000 0000"));
		database1.addCustomer(new Customer(3, "Антонов", "Владислав", "Алексеевич", "г. Брест, ул.Ленина 23-13",
				1234_5432_2349_7654l, "BY11 BDHS 4561 0000 0000 2500 0000"));
		database1.addCustomer(new Customer(4, "Гурченко", "Оксана", "Викторовна", "г. Брест, ул.Ленина 23-14",
				1234_9999_3456_7654l, "BY56 BDHS 3458 0000 0011 0000 0000"));
		database1.addCustomer(new Customer(5, "Троекуров", "Авксентий", "Трифонович", "г. Брест, ул.Ленина 23-15",
				1234_0001_3456_7654l, "BY02 BDHS 8774 9999 9999 9999 9999"));

		List<Customer> sortedList1;
		sortedList1 = logic.SortBySurname(database1.getCustomerList());
		view.print("By Surname:", sortedList1);

		List<Customer> filtredList1;
		long min = 1234_5432_0000_0000l;
		long max = 1234_5432_9999_9999l;
		filtredList1 = logic.FilterByBankCardNumber(database1.getCustomerList(), min, max);
		view.print("With account numbers from " + min + " to " + max, filtredList1);
	}

}
