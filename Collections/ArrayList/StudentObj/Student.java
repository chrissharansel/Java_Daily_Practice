package Collections.ArrayList.StudentObj;

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
	
	public boolean equals(Object o) {
		Student s=(Student)o;
		if(this.name.equals(s.name)&& this.ID==s.ID)
			return true;
		return false;
	}
	
}
