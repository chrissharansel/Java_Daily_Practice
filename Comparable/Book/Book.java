package Comparable.Book;

public class Book implements Comparable{
	String name;
	double price;
	Book(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	public int compareTo(Object o) {
		Book b=(Book)o;
		if(this.price==b.price)
			return 0;
		else if(this.price<b.price)
			return 1;
		else return -1;
	}
	
}
