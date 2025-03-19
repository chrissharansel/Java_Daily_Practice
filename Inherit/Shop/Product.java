package Inheritance.Shop;

public class Product {
	String name;
	int ID;
	int totalQty;
	Product(String name,int ID,int totalQty){
		this.name=name;
		this.ID=ID;
		this.totalQty=totalQty;
	}
	void printProductPlaced() {
		System.out.println("Product is Placed");
	}
}
