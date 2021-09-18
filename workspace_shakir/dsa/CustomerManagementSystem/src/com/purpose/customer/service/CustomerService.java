package com.purpose.customer.service;

import java.util.List;

import com.purpose.customer.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
	public void saveCustomerInCloud(Customer theCustomer);
	
}
