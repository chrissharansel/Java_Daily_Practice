package Object.EmployeeSalary;

import java.time.LocalDateTime;

public class Employee {
	String name,of;
	int id;
	double salary;
	int yearOfExperience;
	String emailID;
	long phoneNumber;
	static int a;
	{
		System.out.println("Employee Created\n");
		System.out.println(LocalDateTime.now()+"\n\n");
	}
	
	
	Employee(String name, int id,double salary,int yearOfExperience){
		this.yearOfExperience=yearOfExperience;
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	Employee(String name, int id,double salary,int yearOfExperience,String emailID,long phoneNumber){
		this(name,id,salary,yearOfExperience);
		this.emailID=emailID;
		this.phoneNumber=phoneNumber;
	}
	public static double bonusCalculation(double salary,int yearOfExperience) {
		if(salary>10000 && yearOfExperience==1) {
			return (1000+salary);
		}
		else if(salary>22000 && yearOfExperience==2) {
			return (2000+salary);
		}
//		else if(this.salary>32000 && yearOfExperience==3) {
//			return (3000+this.salary);
//		}
		else  {
			return (3000+salary);
		}
	}
	public void updateExperience(int exp) {
		this.yearOfExperience=exp;
	}
	public static void main(String[] args) {
		System.out.println(a);
	}
}
