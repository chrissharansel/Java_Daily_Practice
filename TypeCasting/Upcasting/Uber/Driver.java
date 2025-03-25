package Inheritance.TypeCasting.Upcasting.Uber;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Mini\n2.Sedan\n3.Luxury\nEnter your choice:");
		int option=sc.nextInt();
		Cab c= null; 
		switch(option) {
		case 1:
			c=new Mini();
			c.display();
			break;
		case 2:
			c=new Sedan();
			c.display();
			break;
		case 3:
			c=new Luxury();
			c.display();
			break;
		}
		if(c instanceof Mini)
			System.out.println(((Mini)c).price);
		else if(c instanceof Sedan)
			System.out.println(((Sedan)c).price);
		else
			System.out.println(((Luxury)c).price);
		
	}
}
