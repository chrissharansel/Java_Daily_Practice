package Collections.ArrayList.Employee;

import java.util.ArrayList;

public class EmployeeDriver {
	 public static void main(String[] args) {
		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(new Employee("ABC",1));
		e.add(new Employee("EFG",2));
		e.add(new Employee("DEF",3));
		e.add(new Employee("GHI",4));
		e.add(new Employee("IJK",5));
		e.add(new Employee("ABC",6));
		
		//Employee key=new Employee("IJK",5);
		//System.out.println(e.contains("ABC"));
		
//		Employee e1=null;
		ArrayList <Employee> employee=new ArrayList<Employee>();
		String keyName="ABC";
		for(Employee emp:e) {
			if(emp.name.equals(keyName)) {
				//System.out.println(emp);
				employee.add(emp);
			}
		}
		System.out.println("Employee object");
		for(Employee emp:employee) {
			System.out.println(emp);
		}
		e.removeAll(employee);
		System.out.println("E object");
		for(Employee emp:e) {
			System.out.println(emp);
		}
//		if(e1!=null) 
//			System.out.println(e);
//		
//		else
//			System.out.println("Not Found");
		
		
	}
}
