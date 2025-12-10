

/**
 * 
 */

/**
 * @author Rojhe
 *
 */
public class SavingsAccount_RB extends BankAccount_RB{

//Create child class – SavingsAccount [ using extends keyword]
//create a constructor – that calls parent call attributes using super for balance and
//accountNo
public  SavingsAccount_RB(String accountNo, double balance) {
    super(accountNo, balance); // Call the parent class constructor to initialize accountNo and balance

}

//Override withdraw method that checks if the balance after withdrawal is not less than 50$
@Override
public void withdraw(double amount) {
    if ((getBalance() - amount) < 50 ) {
        System.out.println("Insufficient funds for withdrawal.");
    } else {
        super.withdraw(amount); // Call the parent class withdraw method 
    }

}
}
