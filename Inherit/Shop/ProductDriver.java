package Inheritance.Shop;

import java.util.Scanner;

public class ProductDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Mobile\n2.Tshirt\n3.Shampoo\nEnter your choice:");
		int option=sc.nextInt();
		Product p= null; 
		switch(option) {	
		case 1:
			
			p=new Mobile("mobile",12,3,64,128);
			break;
		case 2:
			
			p=new Tshirt("tshirt",23,5,40,"blue");
			break;
		case 3:
			
			p=new Shampoo("hamam",45,3,500);
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


