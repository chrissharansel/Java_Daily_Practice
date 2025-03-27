package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TracingStudentList {
	public static void main(String[] args) {
		ArrayList<Student> d=new ArrayList<Student>();
		
		d.add(new Student("ABC",12));
		d.add(new Student("DEF",13));
		d.add(new Student("GHI",14));
		Iterator <Student> it=d.iterator();
			
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		System.out.println(it.hasNext());
		while(it.hasNext()) {
			// d.add(new Student("GHI",14)); will cause ConcurrentModificationException 
			System.out.println(it.next().toString());
		}
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		
	}
}
