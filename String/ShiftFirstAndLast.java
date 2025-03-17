package String;

import java.util.Scanner;

public class ShiftFirstAndLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next(),Stringnew="";
		char temp=string.charAt(0);
		Stringnew+=string.charAt(string.length()-1);
		for(int i=1;i<string.length()-1;i++) {
			Stringnew+=string.charAt(i);
		}
		Stringnew+=temp;
		System.out.println(Stringnew);
	}
}
