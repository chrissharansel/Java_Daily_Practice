package StringBuffer.CheckMethods;

public class CheckMethods {
	public static void main(String[] args) {
		StringBuffer string=new StringBuffer(7);
		System.out.println(string.capacity());
		System.out.println(string.length());
		string.append("ABC");
		String str=new String();
		System.out.println(string);
		System.out.println(string.capacity());
		StringBuffer s=new StringBuffer("ABC");
		System.out.println(s.capacity());
		System.out.println(string.equals(s));
		System.out.println("ABC".contentEquals(s));
		
		s.insert(0, false);
		System.out.println(s);
		s.delete(0, 2);
		System.out.println(s);
		System.out.println(s.charAt(3));
		System.out.println(s.replace(1,3,"w"));
		s.setLength(10);
		System.out.println(s);
		System.out.println(s.length());
		s.trimToSize();
		System.out.println(s.capacity());
 }
}