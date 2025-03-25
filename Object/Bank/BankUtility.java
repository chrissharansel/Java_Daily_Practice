package Object.Bank;

public class BankUtility {
	double balance;
	public BankUtility(double balance) {
		this.balance=balance;
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			System.out.printf("Amount %f withdrawn\n",balance);
		}
		else System.out.println("Invalid");
	}
	public void deposit(double amount) {
		if(amount>0) {
		balance+=amount;
		System.out.printf("Amount %f deposit\n",balance);
		}
	}
	public void checkBalance() {
		System.out.printf("Amount balance in the account:%f\n",balance);
	}
	
}
