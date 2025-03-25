package Object.Bank;

import java.util.Scanner;

public class BankDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter initial balance to create account:");
		double balance = sc.nextDouble();
		BankUtility bankUtil = new BankUtility(balance);
		AccountUtility a=new AccountUtility();
		while (true) {
			System.out.println("1.Withdraw amount\n2.Deposit amount\n3.Check Balance\n4.Check Simple Interest\n5.Exit");
			System.out.println("Enter choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter amount to withdraw:");
				double amount = sc.nextDouble();
				bankUtil.withdraw(amount);
				break;
			case 2:
				System.out.print("Enter amount to depost:");
				amount = sc.nextDouble();
				bankUtil.deposit(amount);
				break;
			case 3:
				bankUtil.checkBalance();
				break;
			case 4:
				a.simpleInterest(1000, 2, 0.5);
				break;
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid");
			
			}
		}

	}
}
