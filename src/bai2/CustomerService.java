package bai2;

import bai1.Order;

public class CustomerService {
	private final double VIP_THRESHOLD = 1000;

	/**
	 * check is vip customer
	 * 
	 * @param customer the customer
	 * @return true if is total price more vip threshold
	 */
	public boolean isVipCustomer(Customer customer) {
		return calculateTotalPrice(customer) > VIP_THRESHOLD;
	}

	/**
	 * calculate total price
	 * 
	 * @param customer the customer
	 * @return the toal price
	 */
	private double calculateTotalPrice(Customer customer) {
		return customer.getOrders().stream().mapToDouble(Order::getTotalPrice).sum();
	}
}
