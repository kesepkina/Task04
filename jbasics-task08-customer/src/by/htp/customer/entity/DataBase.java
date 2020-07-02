package by.htp.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	private List<Customer> customerList;
	
	public DataBase() {
		customerList = new ArrayList<Customer>();
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerList == null) ? 0 : customerList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataBase other = (DataBase) obj;
		if (customerList == null) {
			if (other.customerList != null)
				return false;
		} else if (!customerList.equals(other.customerList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DataBase [customerList=" + customerList + "]";
	}
	
	

}
