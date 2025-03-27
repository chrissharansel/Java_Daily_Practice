package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class TraverseingWithoutIterator {
	public static void main(String[] args) {
		ArrayList<Student> d=new ArrayList<Student>();
		
		d.add(new Student("ABC",12));
		d.add(new Student("DEF",13));
		d.add(new Student("GHI",14));
		d.add(new Student("AAC",15));
//		Object[] o=d.toArray();
//		Student[] s=(Student[])o;
		for(int i=0;i<d.size();i++) {
			System.out.println(d.get(i));
		}
		Comparator c=new StudentComparator();
		ArrayList a=new ArrayList(10);
		a.add(10);//Collection methods
		a.add(20);
		a.add(30);
		a.add(40);
		a.sort(c);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
}
