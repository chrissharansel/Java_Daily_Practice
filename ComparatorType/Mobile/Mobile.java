package ComparatorType.Mobile;
public class Mobile {
	String brand;
	double price;
	int ram;
	

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}


	Mobile(String brand,double price, int ram){
		this.brand=brand;
		this.price=price;
		this.ram=ram;
	}
	
	
}
