import java.util.*;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> account = new LinkedList<Account>();
		
		// Read a csv file and create new accounts based on it 
		String file = "C:\\Users\\AndyJ\\Downloads\\NewBankAccounts.csv";
		
		List<String[]> newAccounts = CSV.read(file);
		
		for (String[] holders : newAccounts) {
			String name = holders[0];
			String ssn = holders[1];
			String accountType = holders[2];
			double deposit = Double.parseDouble(holders[3]);
			
			if (accountType.equals("Savings")) {
				account.add(new Savings(name, ssn, deposit));
			} else if (accountType.equals("Checking")) {
				account.add(new Checking(name, ssn, deposit));
			} else {
				System.out.println("Could not read the account type.");
			}
		}
		
		for (Account accounts : account) {
			System.out.println("\n----------------------------------------");
			accounts.information();
		}
	}
}
