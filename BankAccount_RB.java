/**
 * 
 */

/**
 * @author Rojhe
 *
 */
public class BankAccount_RB {
// create class BankAccount
// Attributes – accountNumber, balance
// (make sure you set accountNumber as final type)
// Constructor that does validation of parametrised inputs.
private final String accountNo;
private double balance;
public BankAccount_RB(String accountNo, double balance) {
	
	this.accountNo = accountNo;
	this.balance = balance;
	
	
}

public String getAccountNo() { 
	return this.accountNo;
}

public void deposit(double amount) { 
	this.balance += amount;
}
public void withdraw(double amount) {
	if (amount > balance) {
		System.out.println("Insufficient funds for withdrawal.");
	} else {
		this.balance -= amount;
	}
}
public double getBalance() { 
	return this.balance;
 }
}



// Methods – deposit, withdraw, getBalance
// Create Driver class – that creates 2 objects of BankAccount class
