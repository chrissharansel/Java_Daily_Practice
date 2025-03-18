package String.Assignment6;

import java.util.Scanner;

public class PrintEvenLengthWordInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		printEvenWordString(string);
		
		
	}
	public static void printEvenWordString(String string) {
		String[] str=string.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i].length()%2==0?str[i]+"\n":"");
		}
	}
}
