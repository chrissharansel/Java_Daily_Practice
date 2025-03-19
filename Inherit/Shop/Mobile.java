package Inheritance.Shop;

public class Mobile extends Product {
	int ram;
	int rom;
	Mobile(String name,int ID,int totalQty,int ram,int rom){
		super(name,ID,totalQty);
		this.ram=ram;
		this.rom=rom;
	}
}
