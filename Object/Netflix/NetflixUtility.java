package Object.Netflix;
import java.util.Scanner;
public class NetflixUtility {
	public static void addUser(Scanner sc) {
		System.out.println("Enter Name of the user:");
		String name=sc.next();
		System.out.println("Enter Password of the user:");
		String pass=sc.next();
		System.out.println("Enter Phone number of the user:");
		long number=sc.nextLong();
		System.out.println("Enter EmailID of the user:");
		String emailID=sc.next();
		
		User u=new User(name,pass,number,emailID);
		System.out.printf("User name: %s\nUser password: %s\nUser phonenumber :%d\nUser email ID: %s\n",name,pass,number,emailID);
	}
	public static void addMovie(Scanner sc) {
		System.out.println("Enter Title of the movie:");
		String name=sc.next();
		System.out.println("Enter Director name of the movie:");
		String dirname=sc.next();
		System.out.println("Enter genre of the movie:");
		String genre=sc.next();
		System.out.println("Enter released year of the movie:");
		int year=sc.nextInt();
		
		Movie u=new Movie(name,dirname,genre,year);
		System.out.printf("Movie title: %s\nMovie Director name: %s\nMovie genre :%s\nMovie released year: %d\n",name,dirname,genre,year);
	}
}
