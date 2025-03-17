package String;
import java.util.Scanner;
public class LongestSubstring {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string:");
			String string=sc.next();
			substringProgram(string);
		}
		public static void substringProgram(String string) {
		int max=Integer.MIN_VALUE;
		String maxS="";
			for(int i=0;i<string.length();i++) {
				String res="";
				for(int j=i;j<string.length();j++) {
					res+=string.charAt(j);
					//System.out.println(string.substring(i,j));
					if(reverse(res).equalsIgnoreCase(res) && max<res.length() && res.length()!=0 ) {
					System.out.println( res +" is a palindrome");
					max=res.length();
					maxS=res;
					//System.out.println(res);
					}	
				}
			}
			System.out.println(maxS+" is the longest palindrome substring");
		}
		public static String reverse(String string) {
			String reverse="";
			for(int i=string.length()-1;i>=0;i--){
				reverse+=string.charAt(i);
			}
			return reverse;
		}
	
}
