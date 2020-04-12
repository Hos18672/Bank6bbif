package domain;

import java.time.LocalDateTime;

public class BankAccount {

	Long accountNumber;
	LocalDateTime openingTime;
	String firstName;
	Double amount;
	Double creditLimit;
	
	public BankAccount(Long accountNumber, LocalDateTime openingTime, String firstName, Double amount,
			Double creditLimit) {
		super();
		this.accountNumber = accountNumber;
		this.openingTime = openingTime;
		this.firstName = firstName;
		this.amount = amount;
		this.creditLimit = creditLimit;
	}
	
	
	public BankAccount(String firstName, Double amount) {
		this(null, null, firstName, amount, null);
	}


	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public LocalDateTime getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(LocalDateTime openingTime) {
		this.openingTime = openingTime;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}


	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", openingTime=" + openingTime + ", firstName="
				+ firstName + ", amount=" + amount + ", creditLimit=" + creditLimit + "]\n";
	}
	
	
}
