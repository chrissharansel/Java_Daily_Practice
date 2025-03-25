package Object;

public class NonStaticVariable {
	int a;
	String s;
public static void main(String[] args) {
	NonStaticVariable nonStaticVariable=new NonStaticVariable();
	System.out.println(nonStaticVariable.a);
	System.out.println(nonStaticVariable.s);
}
}
