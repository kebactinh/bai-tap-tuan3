package bai1;

public class Order {
	private final double DEFAULT_PRICE = 0;
	private final double DISCOUNT = 0.9;
	private final double MAX_PRICE = 100;

	public double calculateTotalPrice() {
		double totalPrice = DEFAULT_PRICE;
		for (Item item : items) {
			totalPrice += item.getPrice() * item.getQuantity();
		}
		if (totalPrice > 100) {
			totalPrice *= 0.9; // Giảm giá 10% cho đơn hàng trên 100
		}
		return totalPrice;
	}

	/**
	 * get total price before discount
	 * 
	 * @return total price
	 */
	private double getTotalPriceBeforeDiscount() {
		double totalPrice = DEFAULT_PRICE;
		for (Item item : items) {
			totalPrice += item.getPrice() * item.getQuantity();
		}
		return totalPrice;
	}

	private double getPriceDiscount() {

	}
}
