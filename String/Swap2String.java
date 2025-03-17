package String;

import java.util.Scanner;

public class Swap2String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string1=sc.next();
		System.out.print("Enter a string:");
		String string2=sc.next();
		System.out.println("Before swap:string 1: "+string1+"\nstring 2: "+string2);
		int length1=string1.length(),length2=string2.length();
		string1+=string2;
		
		string2=string1.substring(0,length1);
		
		string1=string1.substring(length1,(length1+length2));
		System.out.println("After swap:string 1: "+string1+"\nstring 2: "+string2);
		
	}
	
}
