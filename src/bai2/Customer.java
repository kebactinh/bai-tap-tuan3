package bai2;

import java.util.List;

import bai1.Order;

public class Customer {
	private String name;
	private Address address;
	private List<Order> orders;
	private CustomerService customerService;

	/**
	 * @return true if is vip customer
	 */
	public boolean isVipCustomer() {
		return customerService.isVipCustomer(this);
	}
}
