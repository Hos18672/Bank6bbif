package domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class Bank {
	
		private List<BankAccount> bankAccounts;
	
		public Bank(List<BankAccount> bankAccounts) {
			bankAccounts = new ArrayList<BankAccount>();
		}
	private void add(BankAccount a) {
		bankAccounts.add(a);
	}
	public void add(BankAccount... acc)
	{
		for(BankAccount a : acc)
		{
			add(a);
		}
	}
	public void addAll(List<BankAccount> accountLIst)
	{
		bankAccounts.addAll(accountLIst);
	}
	public void clear()
	{
		bankAccounts.clear();
	}
	public void remove(BankAccount a)
	{
		bankAccounts.remove(a);
	}
	
	public List<BankAccount> getBankAccounts()
	{
		return Collections.unmodifiableList(bankAccounts); 	
	}
	@Override
	public String toString() {
		return "Bank [bankAccounts=" + bankAccounts + "]";
	}
	

	
}
