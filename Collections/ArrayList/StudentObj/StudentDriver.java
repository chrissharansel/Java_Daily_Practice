package Collections.ArrayList.StudentObj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> student=new ArrayList<>();
		student.add(new Student("ABC",1));
		student.add(new Student("BCE",2));
		student.add(new Student("CEF",3));
		student.add(new Student("EFG",4));
		student.add(new Student("FGH",5));
		student.add(new Student("ABC",6));
		student.add(new Student("HIJ",7));
		
		int keyID=1;
		String keyName="ABC";
		Student keyObject=new Student("ABC",1);
		//REMOVE BASED ON OBJECT
		removeBasedOnObject(student,keyObject);
		
		//REMOVE BASED ON NAME
		removeBasedOnName(student,keyName);
		
		//REMOVE BASED ON ID
		removeBasedOnID(student,keyID);
		
		ListIterator <Student> lit=student.listIterator();
		
		//REMOVE BASED ON ID USING LIST ITERATOR
		removeBasedOnIDUsingListIterator(student,keyID,lit);
		
		
		Iterator <Student> it=student.iterator();
		
		//REMOVE BASED ON ID USING ITERATOR
		removeBasedOnIDUsingIterator(student,keyID,it);
		
		
		
		//SET VALUE USING SET METHOD IN LIST ITERATOR
		setBasedOnIDUsingListIterator(student,keyID,lit);
		
		}
	
	public static void removeBasedOnObject(ArrayList<Student> student,Student keyObject) {
	
		System.out.println("REMOVE BASED ON OBJECT:");
		System.out.println(	student.remove(keyObject)?"Removed":"Not present");
	}
	
	
	
	public static void removeBasedOnID(ArrayList<Student> student,int keyID) {
		System.out.println("REMOVE BASED ON ID:");
		Student storeID=null;
		for(Student s:student) {
			if(s.ID==keyID) {
				storeID=s;
				break;
			}
		}
		System.out.println(	student.remove(storeID)?"Removed":"Not present");
		for(Student s:student) {
			System.out.println(s);
		}
	}
	public static void removeBasedOnName(ArrayList<Student> student,String keyName) {
		
		System.out.println("REMOVE BASED ON NAME:");
		ArrayList <Student> storeName=new ArrayList<>();
		for(Student s:student) {
			if(s.name.equals(keyName)) {
				storeName.add(s);
			}
		}
		System.out.println(student.removeAll(storeName)?"Removed":"Not present");
		for(Student s:student) {
			System.out.println(s);
		}
	}
	public static void removeBasedOnIDUsingListIterator(ArrayList<Student> student, int keyID,ListIterator <Student> lit) {
		System.out.println("REMOVE BASED ON ID USING LIST ITERATOR:");
		while(lit.hasNext()) {
			if(lit.next().ID==keyID) {
				lit.remove();
			}
		}
		for(Student s:student) {
			System.out.println(s);
		}
	}
	public static void removeBasedOnIDUsingIterator(ArrayList<Student> student, int keyID,Iterator <Student> lit) {
		System.out.println("REMOVE BASED ON ID USING LIST ITERATOR:");
		while(lit.hasNext()) {
			if(lit.next().ID==keyID) {
				lit.remove();
			}
		}
		for(Student s:student) {
			System.out.println(s);
		}
	}
	
	public static void setBasedOnIDUsingListIterator(ArrayList<Student> student, int keyID,ListIterator <Student> lit) {
		System.out.println("SET VALUE USING SET METHOD IN LIST ITERATOR");
		while(lit.hasNext()) {
			if(lit.next().ID==keyID) {
				lit.set(new Student("HUY",3));
			}
	}
	for(Student s:student) {
		System.out.println(s);
	}

	System.out.println("MOVING THE POINTER TO DESIRED POSITION:");
	ListIterator <Student> liter=student.listIterator(1);
		System.out.println(liter.next());
	}
	
	
}
