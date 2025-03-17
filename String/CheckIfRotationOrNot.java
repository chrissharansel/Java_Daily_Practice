package String;*******

import java.util.Scanner;

public class CheckIfRotationOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string1=sc.next();
		System.out.print("Enter a string:");
		String string2=sc.next();
		System.out.println(checkRotationOrNot(string1,string2));
	}
	public static void checkRotationOrNot(String string1,String string2){
		char[] ch1=string1.toCharArray();
		char[] ch2=string1.toCharArray();
		boolean flag=false;
		
		
		
	}
	public static void rotation(char[] ch1,char[]ch2,int count) {
		int start=0,end=ch1.length-1;
		char temp=' ';
		while(count>0) {
		while(start<=end) {
			temp=ch1[start];
			ch1[start]=ch1[end];
			ch1[end]=temp;
			start++;
		}
		count--;
		}
	}
}