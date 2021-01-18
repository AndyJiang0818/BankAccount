import java.util.*;

public class Checking extends Account{
	// List properties specific to a checking account
	private int cardNumber;
	private int cardPIN;
	
	// Constructor to initialize checking account properties 
	public Checking(String name, String ssn, double deposit) {
		super(name, ssn, deposit);
		accountNumber = "1" + accountNumber;
		setCard();
	}
	
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	private void setCard() {
		cardNumber = (int) (Math.random() * Math.pow(10, 12));
		cardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	// List any methods specific to the checking account
	public void information() {
		super.information();
		System.out.println(" Your Checking Account Features: "
				+ "\n Card Number: " + cardNumber
				+ "\n Card PIN: " + cardPIN);
	}
}
