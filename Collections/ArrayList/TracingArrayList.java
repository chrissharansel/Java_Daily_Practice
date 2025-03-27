package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TracingArrayList {
	public static void main(String[] args) {
		ArrayList a=new ArrayList(10);
		a.add(10);//Collection methods
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		
		Iterator <Integer> it=a.iterator();
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
//		System.out.println(it.next());
		System.out.println(it.hasNext());
		
	}
}
