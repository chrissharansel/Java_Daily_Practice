package String.Assignment6;

import java.util.Scanner;

public class CountNumberOfUpperCaseAndLowerCaseAndNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		char ch[]=string.toCharArray();
		countUpperAndLowerCase(ch);
		countUpper1LowerCase$Number(ch);
		
		
	}
	public static void countUpperAndLowerCase(char[] ch) {
		int Ucount=0,Lcount=0;
		for(char c:ch) {
			if(c>=65 && c<=91) 
				Ucount++;
			else if(c>=97 && c<=122)
				Lcount++;
		}
		System.out.println("Upper Case letters Count "+Ucount+" Lower Case Letters Count "+Lcount);
	}
	public static void countUpper1LowerCase$Number(char[] ch) {
		int Ucount=0,Lcount=0,Ncount=0;
		for(char c:ch) {
			if(c>='a' && c<='z') 
				Ucount++;
			else if(c>='A' && c<='Z')
				Lcount++;
			else if(c>='0' && c<='9')
				Ncount++;
		}
		System.out.println("Upper Case letters Count "+Ucount+"\nLower Case Letters Count "+Lcount+"\nNumber Letters Count "+Ncount);
	}
}
