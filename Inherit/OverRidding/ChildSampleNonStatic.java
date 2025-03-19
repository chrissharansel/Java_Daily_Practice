package Inheritance.OverRidding;

public class ChildSampleNonStatic extends Sample{
	int a=15;
	public static void main(String[] args) {
		ChildSampleNonStatic c=new ChildSampleNonStatic();
		System.out.println(c.a);
	}
}
