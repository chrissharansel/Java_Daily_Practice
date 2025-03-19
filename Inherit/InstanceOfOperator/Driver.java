package Inheritance.InstanceOfOperator;

public class Driver {
	public static void main(String[] args) {
		Child3 c1=new Child3();
		Parent p1=new Parent();
		System.out.println(c1 instanceof Child2);
		System.out.println(p1 instanceof Child1);
		Parent p2=c1;
		System.out.println(p2 instanceof Child1);
		Child1 c2=(Child1) p2;
		System.out.println(p2 instanceof Parent );
		System.out.println(c2 instanceof Parent);
		
	}
}
