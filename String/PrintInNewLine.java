package String;

import java.util.Scanner;

public class PrintInNewLine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		for(int i=0;i<string.length();i++) {
			System.out.println(string.charAt(i));
		}
	}
}
