package day4;

public class BankingSystem {

	public static void main(String[] args) {
		SavingsAccount no1 = new SavingsAccount(17 , "Ram" , 1000);
	
		
	}

}


class Account
{
	int accountNo;
	String name;
	private double balance;
	
	Account(int ac , String name , double bal)
	{
		this.accountNo = ac;
		this.name = name;
		this.balance = bal;
	}
	
	double getBalance() { //getter method
		return this.balance;
	}
	
	double setBalance(double newBal) {
		this.balance = newBal;
		return this.balance;
	}
	
	double deposit(int amount) {
		this.balance += amount;
		return balance;
	}
}


class SavingsAccount extends Account
{
	
	SavingsAccount(int ac, String name, double bal) {
		super(ac, name, bal);
	}

	double withdraw(int amount) {
		this.setBalance(this.getBalance() - amount);
		return this.getBalance();
	}
}
