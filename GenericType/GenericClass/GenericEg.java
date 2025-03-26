package GenericType.GenericClass;

public class GenericEg {
	public static void main(String[] args) {
		Generic<Integer> g1=new Generic<Integer>(10);
		Generic<String> g2=new Generic<String>("hello");
		Generic<Integer> g3=new Generic<Integer>(10);
		System.out.println(g1.equals(g3));
		//System.out.println(g1==g2);//CTE
	}
}
