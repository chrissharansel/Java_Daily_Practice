package Collections.ArrayList;

public class Student {
	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + "]";
	}
	Student(String name,int ID){
		this.ID=ID;
		this.name=name;
	}
	
	String name;
	int ID;
	
}
