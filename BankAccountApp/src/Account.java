import java.util.*;

public abstract class Account implements BaseRate{
	// List common properties for checking and savings accounts 
	private String name;
	private String ssn;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double deposit) {
		this.name = name;
		this.ssn = ssn;
		balance = deposit;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double interest = balance * (rate / 100);
		balance = balance + interest;
		System.out.println("Interest: $" + interest);
		printBalance();
	}
	
	// List common methods 
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Tranferring $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
	public void information() {
		System.out.println("Name: " + name
				+ "\nAccount Number: " + accountNumber
				+ "\nBalance: " + balance
				+ "\nRate: " + rate + "%");
	}
}
