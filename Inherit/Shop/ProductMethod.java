package Inheritance.Shop;

import java.util.Scanner;

public class ProductMethod {

	

	public static Mobile getMobileType(Scanner sc) {
		Mobile m1=new Mobile("Samsung",01,3,8,64);
		Mobile m2=new Mobile("Apple",02,5,16,64);
		Mobile m3=new Mobile("Oppo",03,3,8,128);
		Mobile m4=new Mobile("Redme",04,6,4,256);
		Mobile m5=new Mobile("Vivo",05,2,8,128);
		
		Mobile[] mobile= {m1,m2,m3,m4,m5};
			for(int i=0;i<mobile.length;i++) {
				System.out.println(i+1+'.'+mobile[i].name);
			}
			
			Mobile m=null;
			int option=sc.nextInt();
			switch(option) {
			case 1:
				m=m1;
				break;
			case 2:
				m=m2;
				break;
			case 3:
				m=m3;
				break;
			case 4:
				m=m4;
				break;
			case 5:
				m=m5;
				break;	
			}
			return m;
	}
	public static Mobile getShampooType(Scanner sc) {
		
			
			Shampoo s1=new Shampoo("A",01,3,4);
			Shampoo s2=new Shampoo("B",02,5,4);
			Shampoo s3=new Shampoo("C",03,3,5);
			Shampoo s4=new Shampoo("D",04,6,6);
			Shampoo s5=new Shampoo("E",05,2,5);
			
			Shampoo[] shampoo= {s1,s2,s3,s4,s5};
				for(int i=0;i<shampoo.length;i++) {
					System.out.println(i+1+'.'+shampoo[i].name);
				}
				Shampoo s=null;
			int option=sc.nextInt();
			switch(option) {
			case 1:
				s=s1;
				break;
			case 2:
				s=s2;
				break;
			case 3:
				s=s3;
				break;
			case 4:
				s=s4;
				break;
			case 5:
				s=s5;
				break;	
			}
			return s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Mobile\n2.Tshirt\n3.Shampoo\nEnter your choice:");
		int option=sc.nextInt();
		Product p= null; 
		switch(option) {	
		case 1:
		
			p=getMobileType(sc);
			break;
		case 2:
			
			p=new Tshirt("tshirt",23,5,40,"blue");
			break;
		case 3:
			
			p=getShampooType(sc);
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



}
