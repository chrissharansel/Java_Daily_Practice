package Object.StudentDetails;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Create Student profile(without email and phone number)\n2.Create Student profile(With email and phone number)\n3.Get Total and averge\n4.Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter student name:");
				String name=sc.next();
				System.out.println("Enter student ID:");
				int ID=sc.nextInt();
				System.out.println("Enter student age:");
				int age=sc.nextInt();
				Student s=new Student(ID,age,name);
				
				System.out.println("Enter marks of 5 subjects");
				for(int i=0;i<s.marks.length;i++) {
					System.out.printf("Enter mark%d:",i+1);
					s.addMark(sc.nextDouble());
				}
//				System.out.println("Enter Mark1:");
//				int m1=sc.nextInt();
//				System.out.println("Enter Mark2:");
//				int m2=sc.nextInt();
//				System.out.println("Enter Mark3:");
//				int m3=sc.nextInt();
//				System.out.println("Enter Mark4:");
//				int m4=sc.nextInt();
//				System.out.println("Enter Mark5:");
//				int m5=sc.nextInt();
//				Student.getTotalAndAverage(m1, m2, m3, m4, m5);
				System.out.println("Do you want to print details of the students: y/n");
				char ch=sc.next().toLowerCase().charAt(0);
				if(ch=='y')
					s.printDetails();
				break;
			case 2:
				System.out.println("Enter student name:");
				name=sc.next();
				System.out.println("Enter student ID:");
				ID=sc.nextInt();
				System.out.println("Enter student age:");
				age=sc.nextInt();
				System.out.println("Enter student email:");
				String email=sc.next();
				System.out.println("Enter student phone number:");
				long number=sc.nextInt();
				s=new Student(ID,age,name,email,number);
				System.out.println("Enter marks of 5 subjects");
				for(int i=0;i<s.marks.length;i++) {
					s.addMark(sc.nextDouble());
				}
//				System.out.println("Enter Mark1:");
//				m1=sc.nextInt();
//				System.out.println("Enter Mark2:");
//				m2=sc.nextInt();
//				System.out.println("Enter Mark3:");
//				m3=sc.nextInt();
//				System.out.println("Enter Mark4:");
//				m4=sc.nextInt();
//				System.out.println("Enter Mark5:");
//				m5=sc.nextInt();
//				Student.getTotalAndAverage(m1, m2, m3, m4, m5);
				System.out.println("Do you want to print details of the students: y/n");
				ch=sc.next().toLowerCase().charAt(0);
				if(ch=='y')
					s.printDetails(true);
				break;
			case 3:
				System.exit(0);
			}
				
	}
	}
}
