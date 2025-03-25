package Object.EmployeeSalary;

import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("1.Create Employee profile(without email and phone)\n2.Create Employee profile(with email and phone)\nCheck Bonus\nUpdate year of experience\n3.Exit\nEnter your choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter employee name:");
				String name=sc.next();
				System.out.print("Enter employee ID:");
				int id=sc.nextInt();
				System.out.print("Enter employee salary");
				double salary=sc.nextLong();
				System.out.print("Enter employee years of experience:");
				int year=sc.nextInt();
				Employee emp=new Employee(name,id,salary,year);
				System.out.println("1.Check bonus salary\n2.Update year of experience");
				int ch=sc.nextInt();
				if(ch ==1) {
					System.out.println("Salary+bonus="+Employee.bonusCalculation(emp.salary,emp.yearOfExperience));
				}
				else
				{
					System.err.println("Enter updation of year:");
					emp.updateExperience(sc.nextInt());
				}
				break;
			case 2:
				System.out.print("Enter employee name:");
				name=sc.next();
				System.out.print("Enter employee ID:");
				id=sc.nextInt();
				System.out.print("Enter employee salary");
				salary=sc.nextLong();
				System.out.print("Enter employee years of experience:");
				year=sc.nextInt();
				System.out.print("Enter employee emailID:");
				String email=sc.next();
				System.out.print("Enter employee phone number");
				long number=sc.nextLong();
				emp=new Employee(name,id,salary,year,email,number);
				System.out.println("Do u want to check bonus salary:\n 1 for yes 2 for no");
				ch=sc.nextInt();
				if(ch ==1) {
					System.out.println("Salary+bonus="+Employee.bonusCalculation(emp.salary,emp.yearOfExperience));
				}
				else
				{
					System.out.println("Enter updation of year:");
					emp.updateExperience(sc.nextInt());
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice"); 
			}
			
			
			
		}
		
	}
}
