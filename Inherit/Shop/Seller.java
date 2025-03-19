package Inheritance.Shop;

import java.util.Scanner;
public class Seller {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Mobile\n2.Tshirt\n3.Shampoo\nEnter your choice:");
		int option=sc.nextInt();
		Product p= null; 
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter ID:");
		int ID=sc.nextInt();
		System.out.println("Enter Qty:");
		int totalQty=sc.nextInt();
		switch(option) {	
		case 1:
			System.out.println("Enter ram:");
			int ram=sc.nextInt();
			System.out.println("Enter rom:");
			int rom=sc.nextInt();
			p=new Mobile(name,ID,totalQty,ram,rom);
			break;
		case 2:
			System.out.println("Enter size:");
			int size=sc.nextInt();
			System.out.println("Enter color:");
			String color=sc.next();
			p=new Tshirt(name,ID,totalQty,size,color);
			break;
		case 3:
			System.out.println("Enter ml:");
			int Qty=sc.nextInt();
			p=new Shampoo(name,ID,totalQty,Qty);
			break;
			
			
		}
		if(p instanceof Mobile)
			System.out.printf("Product Name:%s\nProduct ID:%d\nProduct Qty:%d\nRam:%d\nRom:%d\n",p.name,p.ID,p.totalQty,((Mobile)p).ram,((Mobile)p).rom);
		else if(p instanceof Tshirt)
			System.out.printf("Product Name:%s\nProduct ID:%d\nProduct Qty:%d\nSize:%d\nColor:%d\n",p.name,p.ID,p.totalQty,((Tshirt)p).size,((Tshirt)p).color);
		else
			System.out.printf("Product Name:%s\nProduct ID:%d\nProduct Qty:%d\nQty:%d\n",p.name,p.ID,p.totalQty,((Shampoo)p).Qty);
		
	}
}
