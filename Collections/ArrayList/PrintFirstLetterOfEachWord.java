package Collections.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrintFirstLetterOfEachWord {
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<>();
		str.add("Apple");
		str.add("Banana");
		str.add("Cherry");
		str.add("Date");
		str.add("Elderberry");
		
//		for(String s:s tr) {
//			System.out.println(s.charAt(0));
//		}
		ListIterator<String> list=str.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next().charAt(0));
		}
	}
}
