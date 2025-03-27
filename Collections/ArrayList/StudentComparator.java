package Collections.ArrayList;

import java.util.Comparator;

import ComparatorType.Mobile.Mobile;

public class StudentComparator implements Comparator {
	public int compare(Object o1,Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2; 
		return	(s2.name.compareTo(s2.name));
	}
}
