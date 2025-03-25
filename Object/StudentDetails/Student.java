package Object.StudentDetails;
import java.time.LocalDateTime;
public class Student {
	int id,age;
	String name,email;
	static String collegeName="Panimalar";
	long phoneNumber;
	static int studentCount;
	//double mark1,mark2,mark3,mark4,mark5;
	double[] marks=new double[5];
	
	
	public void addMark(double mark) {
		int pos=0;
		if(pos<marks.length)
			marks[pos++]=mark;
	}
	
	static
	{
		System.out.println("==========================\nStudent Management System\n==========================");
		System.out.println("\nTime created: "+LocalDateTime.now());
	}
	{
		System.out.println("\nStudent is created");
		System.out.println("\nStudent count:"+ ++studentCount+"\n\n------------------------------------------------------------");
	}
	Student(int id,int age,String name){
		this.id=id;
		this.age=age;
		this.name=name;
	
	}
	Student(int id,int age,String name,String email,long phoneNumber){
		this(id,age,name);
		this.email=email;
		this.phoneNumber=phoneNumber;
	}
	
	public void printDetails() {
		System.out.printf("Name of the student: %s\nStudent ID: %d\nAge of the Student: %d\nCollege Name: %s\n",this.name,this.id,this.age,collegeName);
	}
	public void printDetails(boolean bool) {
		System.out.printf("Name of the student: %s\nStudent ID: %d\nAge of the Student: %d\nEmail: %s\nPhone number: %d\nCollege Name: %s\n",this.name,this.id,this.age,this.email,this.phoneNumber,collegeName);
	}
	
	public static void getTotalAndAverage(double m1,double m2,double m3,double m4,double m5) {
		double total=m1+m2+m3+m4+m5;
		System.out.println("Total of given marks: "+total);
		System.out.println("Average of total: "+total/5+"\n------------------------------------------------------------\n");
	}
}
