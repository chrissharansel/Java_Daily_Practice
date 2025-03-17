package String.Assignment6;

import java.util.Scanner;

public class AbbreviationOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		System.out.println(getAbbreviation(string));
	}
	public static String getAbbreviation(String string) {
		String res="";
		res+=string.charAt(0);
		for(int i=1;i<string.length();i++) {
			if(string.charAt(i-1)==' ') {
				res+=string.charAt(i);
			}
		}
		return res;
	}
}
