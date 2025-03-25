 package Object.Employee;

public class Employee {
	int id=101;
	String name;
	{
		System.out.println("Object is created");
	}
	Employee(String name){
		this.name=name;
	}
	public void displayDetails() {
		System.out.println(id);
		System.out.println(name);
	}
}
