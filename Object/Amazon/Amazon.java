package Object.Amazon;
import java.util.Scanner;

public class Amazon {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("1.Add customer\n2.Add product\n3.Add seller\n4.Add invester\n5.Exit operation");
		int choice=sc.nextInt();
	
		switch(choice) {
		case 1:
			AmazonUtility.addCustomer(sc);
			break;
		case 2:
			AmazonUtility.addProduct(sc);
			break;
		case 3:
			AmazonUtility.addSeller(sc);
			break;
		case 4:
			AmazonUtility.addInvester(sc);
			break;
		case 5:
			return;
		default:
			System.out.println("Invalid number");
		}
	}
}
}
