package Collections.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class UsingListInteratorInterfaceOfIteratorInterface {
	public static void main(String[] args) {
		ArrayList<Student> d=new ArrayList<Student>();
		
		d.add(new Student("ABC",12));
		d.add(new Student("DEF",13));
		d.add(new Student("GHI",14));
		ListIterator <Student> it=d.listIterator();
	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(it.nextIndex());
		System.out.println("-------------------------   \nReverse:");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println(it.previousIndex());
		
		
		
		ListIterator<Student> li=d.listIterator(1);
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
}
