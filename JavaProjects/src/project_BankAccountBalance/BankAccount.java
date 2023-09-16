package project_BankAccountBalance;

public class BankAccount {
	
	private double balance;
	
	//Constructor
	public BankAccount () {
		balance = 0.0;
	}

	//deposit method
	public void deposit (double amount) {
		balance = balance + amount;
	}
	
	//withdraw method
	public void withdraw (double amount) throws InsufficentFundException {
		if (amount > balance) {
			throw new InsufficentFundException("Insufficent Balance. "
					+ "Withdraw process couldn't be completed.");
		}
		balance = balance - amount;
	}

	//getter method of balance
	public double getBalance() {
		return balance;
	}
	
	
}
