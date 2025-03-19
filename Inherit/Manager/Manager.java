package Inheritance.Manager;

public class Manager extends Employee {
	int manages;
	public static void main(String[] args) {
		Manager m=new Manager("ABC",23,"TESTER",8);
//		Manager m=new Manager();
		System.out.println(m.empID);
	}
	public Manager(String name, int empID, String dept, int manages) {
		super(name, empID, dept);
		this.manages = manages;
	}
	
}
