package String;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		getBinaryUsingNumber();
	}
	public static void getBinary() {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String binary="";
		while(number>0) {
			binary= number%2+binary;
			number/=2;
		}
		
		System.out.println(binary);
	}
	public static void getBinaryUsingNumber() {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int binary=0;
		while(number>0) {
			binary= number%2+binary*10;
			number/=2;
		}
		
		System.out.println(binary);
	}
	
}
