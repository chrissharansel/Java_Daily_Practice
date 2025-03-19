package Downcasting;

public class Student extends Person{
	Student(int age, String name,int ID) {
		super(age, name);
		this.ID=ID;
		}

	int ID;
	
	public static void main(String[] args) {
		Student s1=new Student(1,"ABC",2);
		Person p1=new Person(1,"ABC");
		Person p2=s1;
		Person p3=new Student(1,"ABC",5);
		Person p4=new Person(2,"BCD");
		Student s2=(Student)p2;
		Person p5=(Person)s1;
		
	}
}