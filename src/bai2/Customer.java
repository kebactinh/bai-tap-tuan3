package bai2;
import java.util.List;

import bai1.Order;

public class Customer {
	private String name;
	private Address address;
	private List<Order> orders;

	public boolean isVipCustomer() {
		return orders.stream().mapToDouble(Order::getTotalPrice).sum() > 1000;
	}
}
