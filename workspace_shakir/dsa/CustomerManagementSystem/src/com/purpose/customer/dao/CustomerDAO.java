package com.purpose.customer.dao;

import java.util.List;

import com.purpose.customer.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
	public void saveCustomerInCloud(Customer theCustomer);
	
}
