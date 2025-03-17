package String;

import java.util.Scanner;

public class CombineWIthoutConcat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string1=sc.next();
		System.out.print("Enter a string:");
		String string2=sc.next();
		System.out.println("string 1: "+string1+"\nstring 2: "+string2);
		char[] Char= new char[string1.length()+string2.length()];
		for(int i=0;i<Char.length;i++) {
			if(i<string1.length())
				Char[i]=string1.charAt(i);
			else 
				Char[i]=string2.charAt(i-string1.length());
		}
		String s=new String(Char);
		System.out.println(s);
		
	}
}
