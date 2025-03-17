package String.Assignment6;

import java.util.Scanner;

public class ReverseWordInAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		leastFrequent(string);
		
	}
	public static  void leastFrequent(String string) {
		String[] str=string.split(" ");
		String res="";
		for(int i=0;i<str.length;i++) {
			res+=reverse(str[i])+" ";
		}
		System.out.println(res);
	}
			
	public static String reverse(String string) {
		String res="";
		for(int i=string.length()-1;i>=0;i--) {
			res+=string.charAt(i);
		}
		return res;
	}
}

