package by.htp.customer.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.customer.entity.Customer;

public class CustomerLogic {

	public List<Customer> SortBySurname(List<Customer> customers) {
		List<Customer> sortedCustomerList = new ArrayList<Customer>();
		sortedCustomerList.addAll(customers);

		Customer customer1;
		Customer customer2;
		String minSurname;
		String surname;
		int imin;

		// сортировка выбором
		for (int i = 0; i < sortedCustomerList.size() - 1; i++) {
			customer1 = sortedCustomerList.get(i);
			minSurname = customer1.getSurname();
			imin = i;
			for (int j = i + 1; j < sortedCustomerList.size(); j++) {
				customer2 = sortedCustomerList.get(j);
				surname = customer2.getSurname();
				if (minSurname.compareTo(surname) > 0) {
					minSurname = surname;
					imin = j;
				}
			}
			if (i != imin) {
				sortedCustomerList.set(i, sortedCustomerList.get(imin));
				sortedCustomerList.set(imin, customer1);
			}
		}

		return sortedCustomerList;
	}

	public List<Customer> FilterByBankCardNumber(List<Customer> customers, long min, long max) {
		List<Customer> filtredCustomerList = new ArrayList<Customer>();

		long number;

		for (Customer customer : customers) {
			number = customer.getBankCardNumber();
			if (number >= min && number <= max) {
				filtredCustomerList.add(customer);
			}
		}

		return filtredCustomerList;
	}

}
