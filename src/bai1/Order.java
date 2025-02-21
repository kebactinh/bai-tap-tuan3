package bai1;

public class Order {
	private final double DEFAULT_PRICE = 0;
	private final double DISCOUNT = 0.1;
	private final double MAX_PRICE = 100;

	/**
	 * calculate total price
	 * 
	 * @return the total price
	 */
	public double calculateTotalPrice() {
		double totalPrice = calculateTotalPriceBeforeDiscount();

		double priceDiscount = calculatePriceDiscount(totalPrice);

		return calculateTotalPriceAfterDiscount(totalPrice, priceDiscount);
	}

	/**
	 * calculate total price before discount
	 * 
	 * @return total price
	 */
	private double calculateTotalPriceBeforeDiscount() {
		double totalPrice = DEFAULT_PRICE;
		for (Item item : items) {
			totalPrice += item.getPrice() * item.getQuantity();
		}
		return totalPrice;
	}

	/**
	 * calculate price piscount
	 * 
	 * @param totalPrice the total price
	 * @return the price discount
	 */
	private double calculatePriceDiscount(double totalPrice) {
		double priceDiscount = DEFAULT_PRICE;
		// 10% discount for orders over 100
		if (totalPrice > MAX_PRICE) {
			priceDiscount = totalPrice * DISCOUNT;
		}
		return priceDiscount;
	}

	/**
	 * calculate total price after discount
	 * 
	 * @param totalPrice    the total price
	 * @param priceDiscount the price discount
	 * @return the total price after discount
	 */
	private double calculateTotalPriceAfterDiscount(double totalPrice, double priceDiscount) {
		return totalPrice - priceDiscount;
	}
}
