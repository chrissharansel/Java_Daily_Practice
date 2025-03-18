package String.Assignment6;

import java.util.Scanner;

public class DivideStringIntoNEqualParts {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		System.out.println("Enter number to divide:");
		int n=sc.nextInt();
		divideStringN(string, n);
	}
	public static void divideStringN(String string,int n) {
		int div=string.length()/n;
		for(int i=0;i<string.length();i+=div) {
			System.out.println(string.substring(i, i+div));
		}
	}
}
