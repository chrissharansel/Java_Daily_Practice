package Object.Netflix;
import java.util.Scanner;
public class NetflixDriver {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("1.Add user\n2.Add Movie \nEnter choice");
	int choice=sc.nextInt();
	
			switch(choice) {
			case 1:
				NetflixUtility.addUser(sc);
				break;
			case 2:
				NetflixUtility.addMovie(sc);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid");
		}
	}
	
}
}
