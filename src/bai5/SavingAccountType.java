package bai5;

public class SavingAccountType implements AccountType {
	private final double SAVING_RATE = 0.1;

	@Override
	public double calculateInterest(Account account) {
		// Tính lãi suất tiết kiệm
		return SAVING_RATE;
	}
}
