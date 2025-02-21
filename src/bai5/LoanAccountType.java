package bai5;

public class LoanAccountType implements AccountType {
	private final double LOAN_RATE = 0.2;

	@Override
	public double calculateInterest(Account account) {
		// Tính lãi suất vay
		return LOAN_RATE;
	}
}
