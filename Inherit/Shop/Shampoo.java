package Inheritance.Shop;

public class Shampoo extends Product{
	int Qty;
	Shampoo(String name,int ID,int totalQty,int Qty){
		super(name,ID,totalQty);
		this.Qty=Qty;
	}
}
