import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rojhe
 *
 */
public class DriverMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number: ");
		String accountNo = scan.nextLine();
		System.out.print("Enter initial balance: ");
		double balance = scan.nextDouble();
		SavingsAccount_RB savings1 = new SavingsAccount_RB(accountNo, balance);
		boolean exit = false;
		while (!exit) {
			System.out.println("Choose an option: \n1. Deposit \n2. Withdraw \n3. Check Balance \n4. Exit");
			int choice = scan.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter amount to deposit: ");
					double depositAmount = scan.nextDouble();
					savings1.deposit(depositAmount);
					break;
				case 2:
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmount = scan.nextDouble();
					savings1.withdraw(withdrawAmount);
					break;
				case 3:
					System.out.println("Current balance: " + savings1.getBalance());
					break;
				case 4:
					exit = true;
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid option. Please try again.");
			}
		}
		
			}

}
