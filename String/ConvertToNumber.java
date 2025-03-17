package String;

import java.util.Scanner;

public class ConvertToNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		convertToNumber(string);
		//System.out.println(string);
		
	}
	public static void convertToNumber(String string) {
		int sum=0;
		if(string.charAt(0)=='-')
		{	int i=0;
			for(int j=1;j<string.length();j++) 
			sum+=((int)(string.charAt(j)-48))*pow(10,string.length()-1-i++);
			sum/=10;
			System.out.println(-sum);
		}
		else {
			int i=0;
			for(int j=0;j<string.length();j++) 
				sum+=((int)(string.charAt(j)-48))*pow(10,string.length()-1-i++);
			System.out.println(sum);
			}
		
	}
	
	public static int pow(int base,int pow) {
		int exp=1;
		for(int i=0;i<pow;i++) {
			exp*=base;
		}
		return exp;
	}
}
