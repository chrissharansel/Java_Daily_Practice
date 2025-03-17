package String;

import java.util.Scanner;

public class SubstringProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		substringProgram(string);
	}
	public static void substringProgram(String string) {
	
		for(int i=0;i<string.length();i++) {
			String res="";
			for(int j=i;j<string.length();j++) {
				res+=string.charAt(j);
				//System.out.println(string.substring(i,j));
				
			}
			System.out.println();
		}
	}
}
