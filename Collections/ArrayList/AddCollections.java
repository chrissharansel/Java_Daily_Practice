package Collections.ArrayList;

import java.util.ArrayList;

public class AddCollections {
	public static void main(String[] args) {
		ArrayList a=new ArrayList(10);
		a.add(10);//Collection methods
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		a.add(1,100);
		System.out.println(a);
		ArrayList a1=new ArrayList(10);
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a.addAll(2,a1);
		System.out.println(a);
		a.add(a1);
		System.out.println(a);
		
	}
}
