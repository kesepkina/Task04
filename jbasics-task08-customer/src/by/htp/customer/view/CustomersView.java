package by.htp.customer.view;

import java.util.List;

import by.htp.customer.entity.Customer;

public class CustomersView {

	public void print(String message, List<Customer> customers) {
		System.out.println(message);

		for (Customer customer : customers) {
			if (customer == null) {
				System.out.println("null");
			} else {
				print(customer);
			}
		}
		System.out.println();
	}

	public void print(Customer customer) {
		System.out.printf(
				"Customer [id = %05d, surname = %s, name = %s, patronymic = %s, address = %s,\n \t bankCardNumber = %d, bankAccountNumber = %s]\n",
				customer.getId(), customer.getSurname(), customer.getName(), customer.getPatronymic(),
				customer.getAddress(), customer.getBankCardNumber(), customer.getBankAccountNumber());
	}
}
