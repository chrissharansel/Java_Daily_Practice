package Inheritance.OverRidding;

public class ChildSampleStatic extends Sample{
	static int b=15;
	public static void main(String[] args) {
		ChildSampleStatic c=new ChildSampleStatic();
		System.out.println(b);
	}
}
