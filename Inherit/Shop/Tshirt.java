package Inheritance.Shop;

public class Tshirt extends Product {
	int size;
	String color;
	Tshirt(String name,int ID,int totalQty,int size,String color){
		super(name,ID,totalQty);
		this.size=size;
		this.color=color;
	}
}
