package String;

import java.util.Scanner;

public class BinaryToHexadecimal {
	public static void main(String[] args) {
		getHexadecimal();
	}
	public static void getHexadecimal() {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String res="";
		int dec=0;
		while(number>0) {
			dec=number%16;
			if(dec>9) 
				res=(char)(dec+55)+res;
			
			else 
				res=dec+res;
			
			number/=16;
		}
		System.out.println(res);
		
		
	}
	
	
}
