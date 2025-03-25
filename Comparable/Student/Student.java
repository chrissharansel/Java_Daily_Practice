package Comparable.Student;

public class Student implements Comparable{
	String name;
	int ID;
	int Mark;
	Student(String name, int ID, int Mark){
		this.name=name;
		this.ID=ID;
		this.Mark=Mark;
	}
	
	public int compareTo(Object o) {
		Student s=(Student)o;
		if(this.Mark==s.Mark) 
				return this.name.compareTo(s.name);
		
			
		else return s.Mark-this.Mark;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", Mark=" + Mark + "]";
	}
	
}
