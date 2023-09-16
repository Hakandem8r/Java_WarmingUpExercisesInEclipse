package project_BankAccountBalance;

public class InsufficentFundException extends Exception{
	
	private String message;
	
	//Constructor
	public InsufficentFundException (String message) {
		this.message = message;
	}

	//getter method of message
	public String getMessage() {
		return message;
	}
	
	
}
