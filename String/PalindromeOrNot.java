package String;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter a string:");
//		String string=sc.next();
//		System.out.println(string.equalsIgnoreCase(string)?"The string is a palindrome":"The string is not a palindrome");
		palindromeArray(sc);
		
	}
	public static String reverse(String string) {
		String reverse="";
		for(int i=string.length()-1;i>=0;i--){
			reverse+=string.charAt(i);
		}
		return reverse;
	}
	public static void palindromeArray(Scanner sc) {
		String[] strArray=new String[5];
		for(int i=0;i<strArray.length;i++) 
		{
			System.out.print("Enter a string:");
			strArray[i]=sc.next();
		}
		for(int i=0;i<strArray.length;i++) {
			System.out.print(reverse(strArray[i]).equalsIgnoreCase(strArray[i])? strArray[i]+" is a palindrome\n":"");
		}
	}
}
