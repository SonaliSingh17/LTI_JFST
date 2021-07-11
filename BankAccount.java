

public class BankAccount {


	public static void main(String[] args) {
		
		System.out.println("WELCOME TO MY BANK!");
		
		Account acc = new Account();
		
		acc.setAccountNo(12340);
		acc.setAccountBalance(50000);
		acc.setAccountPassword("3960*&#sona@");
		acc.bankName("State bank of India");
		System.out.println("DISPLAYING ACCOUNT INFO...");
		
		acc.displayAccount();
		
		SavingsAccount sa = new SavingsAccount();
		sa.minimumBalance= 3000;
		sa.displayAccount();
		//sa.displayAccount();
		
		CurrentAccount ca = new CurrentAccount();
		ca.overdraftLimitAmount = 1000000;
		ca.displayAccount();
		//ca.displayAccount();
		
	}

}

class Account{
	
	private int accountNo;
	private float accountBalance;
	private String accountPassword;
	static String bankName;
	
	Account() {
		// TODO Auto-generated constructor stub
		//System.out.println("This is the default constructor...");
	}
	
	Account(int accountNo, float accountBalance, String accountPassword, String bankName ){
		
		
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
		Account.bankName = bankName;
		
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	public void bankName(String bankName) {
		
		Account.bankName = bankName;
	}
	
	public void displayAccount() {
		
		System.out.println("The bank account no. is: "+ accountNo);
		System.out.println("The bank account balance is: "+ accountBalance);
		System.out.println("The bank account password is: "+ accountPassword);
		System.out.println("The bank name is: "+ bankName);
		
	}
	
}


class SavingsAccount extends Account{
	
	double minimumBalance;
	
	public void displayAccount() {
		
		System.out.println("The minimumBalance is: "+ minimumBalance);
	}
}

class CurrentAccount extends Account{
	
	double overdraftLimitAmount;
	
	public void displayAccount() {
		
		System.out.println("The over-draft limit amount is: "+ overdraftLimitAmount);
	}
	
}
