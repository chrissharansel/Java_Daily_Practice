package Inheritance.TypeCasting.Upcasting;

public class Pen extends Product{
	 public static void main(String[] args) {
		Pen p1=new Pen();
		Product p2=new Product();
		Product p3=p1;
		Pen p4=(Pen)p2;
	}
}
