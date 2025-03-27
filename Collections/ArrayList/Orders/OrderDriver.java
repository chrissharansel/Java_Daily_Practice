package Collections.ArrayList.Orders;

import java.util.ArrayList;
import java.util.ListIterator;

public class OrderDriver {
	public static void main(String[] args) {
		ArrayList<Order> order=new ArrayList<Order>();
		order.add(new Order(1,"ABC",1000));
		order.add(new Order(2,"CEF",100));
		order.add(new Order(3,"BFR",10));
		order.add(new Order(4,"ABC",2000));
		order.add(new Order(5,"ERT",400));
		
		double removeAmt=500;
		
//		ArrayList <Order> remove=new ArrayList<Order>();
//		for(Order or:order) {
//			if(or.totalAmount<removeAmt) {
//				remove.add(or);
//			}
//		}
//		order.removeAll(remove);
//		for(Order o:order) {
//			System.out.println(o);
//		}
		
		ListIterator<Order> lit=order.listIterator();
		while(lit.hasNext()) {
			if(lit.next().totalAmount<removeAmt) 
				lit.remove();
		}
		for(Order o:order) {
			System.out.println(o);
		}
	}
}
