package Comparable.Mobile;

public class Mobile implements Comparable {
	String brand;
	double price;
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + "]";
	}

	Mobile(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	
	public int compareTo(Object o) {
		Mobile m=(Mobile)o;
//		if(this.price==m.price) 
				return this.brand.compareTo(m.brand);
//		else return	(int) (m.price-this.price);
	}
}
