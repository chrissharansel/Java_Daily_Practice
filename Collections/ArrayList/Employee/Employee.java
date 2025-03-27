package Collections.ArrayList.Employee;

public class Employee {
	String name;
	int ID;
	double Salary;
	Employee(String name,int ID){
		this.name=name;
		this.ID=ID;
	}
@Override
	public boolean equals(Object o) {
		Employee e=(Employee)o;
		if(this.name.equals(e.name) && this.ID==e.ID) return true;
		return false;
		
	}
@Override
public String toString() {
	return "Employee [name=" + name + ", ID=" + ID + ", Salary=" + Salary + "]";
}
	

	

}
