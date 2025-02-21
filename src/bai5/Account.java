package bai5;

public class Account {
	private AccountType accountType;

	/**
	 * constructor
	 * 
	 * @param accountType the account type
	 */
	public Account(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * calculate interest
	 * 
	 * @return the interest
	 */
	public double calculateInterest() {
		return accountType.calculateInterest(this);
	}
}
