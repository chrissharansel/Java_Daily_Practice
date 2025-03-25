package Comparable.Student;

import java.util.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student("ABC",123,51);
		Student s2=new Student("AAC",124,51);
		//System.out.println(s1.compareTo(s2));
		Student s3=new Student("PQR",125,78);
		Student s4=new Student("PQR",126,90);
		Student s5=new Student("PQR",163,89);
		Student[] student= {s1,s2,s3,s4,s5};
		Arrays.sort(student);
		
		for(Student s:student){
			System.out.println(s);
		}
		
	}
}
 