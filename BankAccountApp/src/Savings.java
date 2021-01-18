import java.util.*;

public class Savings extends Account{
	// List properties specific to a savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize savings account properties 
	public Savings(String name, String ssn, double deposit) {
		super(name, ssn, deposit);
		accountNumber = "2" + accountNumber;
		setSafetyDepositBox();
	}
	
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
		
	// List any methods specific to the savings account
	public void information() {
		super.information();
		System.out.println(" Your Savings Account Features: "
				+ "\n Safety Deposit Box ID: " + safetyDepositBoxID
				+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
	}
}
