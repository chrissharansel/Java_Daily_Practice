package Collections.ArrayList;

import java.util.ArrayList;

public class AddSameType {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>(10);
		a.add(null);
		a.add(10);
		a.add(30);
		a.add(90);
		System.out.println(a);
	}
}
