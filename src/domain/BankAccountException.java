package domain;

public class BankAccountException extends Exception {

	private static final Long serialVersionUID = 1l; 
	public BankAccountException(String massege)
	{
		super(massege);
	}
}
