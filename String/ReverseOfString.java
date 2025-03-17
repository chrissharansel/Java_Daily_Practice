package String;

public class ReverseOfString {
	public static void main(String[] args) {
		String s=new String("Hello");
		System.out.println(reverse(s));
	}
	public static String reverse(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		return s1;
	}
}
