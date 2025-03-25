package Object.Amazon;
import java.util.Scanner;
public class AmazonUtility {
public static void addCustomer(Scanner sc) {
	Customers c=new Customers();
	System.out.print("Enter customer id:");
	c.id=sc.nextInt();
	System.out.print("Enter customer name");
	c.name=sc.next();
	System.out.print("Enter customer mobile number:");
	c.MobileNo=sc.nextInt();
	System.out.print("Enter customer email id:");
	c.email=sc.next();
	
	System.out.printf("The customer id %d\nThe customer name %s\nThe customer mobile number %d\nThe customer email %s\n",c.id,c.name,c.MobileNo,c.email);
}
public static void addProduct(Scanner sc) {
	Product p=new Product();
	System.out.print("Enter product id:");
	p.id=sc.nextInt();
	System.out.print("Enter product brand name:");
	p.brand=sc.next();
	System.out.print("Enter product price:");
	p.price=sc.nextDouble();
	System.out.print("Enter product quantity:");
	p.quantity=sc.nextInt();
	
	System.out.printf("The product id %d\nThe product brand name %s\nThe product price %f\nThe product quantity %d\n",p.id,p.brand,p.price,p.quantity);
}
public static void addSeller(Scanner sc) {
	Seller s=new Seller();
	System.out.print("Enter seller id:");
	s.id=sc.nextInt();
	System.out.print("Enter seller name");
	s.name=sc.next();
	System.out.print("Enter seller mobile number:");
	s.MobileNo=sc.nextInt();
	System.out.print("Enter seller email id:");
	s.email=sc.next();
	
	System.out.printf("The seller id %d\nThe seller name %s\nThe seller mobile number %d\nThe seller email %s\n",s.id,s.name,s.MobileNo,s.email);
}
public static void addInvester(Scanner sc) {
	Invester i=new Invester();
	System.out.print("Enter invester id:");
	i.id=sc.nextInt();
	System.out.print("Enter invester name");
	i.name=sc.next();
	System.out.print("Enter invester mobile number:");
	i.MobileNo=sc.nextInt();
	System.out.print("Enter invester email id:");
	i.email=sc.next();
	
	System.out.printf("The invester id %d\nThe invester name %s\nThe invester mobile number %d\nThe invester email %s\n",i.id,i.name,i.MobileNo,i.email);
}

}
