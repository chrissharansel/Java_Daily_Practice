package String;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		getDecimalUsingString();
	}
	public static int pow(int base,int pow) {
		int exp=1;
		if(pow==0)
			return 1;
		for(int i=0;i<pow;i++) {
			exp*=base;
		}
		return exp;
	}
	public static void getDecimal() {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String binary="";
		int i=0,dec=0;
		while(number>0) {
			dec+=(number%10*pow(2,i++));
			
			number/=10;
		}
		
		System.out.println(dec);
	}
	public static void getDecimalUsingString() {
		Scanner sc=new Scanner(System.in);
		String binary=sc.next();
		int dec=0,k=0;
		for(int i=binary.length()-1;i>=0;i--) {
			dec+=((int)binary.charAt(i)-'0')*pow(2,k++);
		}
		
		System.out.println(dec);
	}
}
