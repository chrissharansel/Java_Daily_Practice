package String.Assignment6;

import java.util.Scanner;

public class RightRotate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		//rightRotate(string,1);
		leftRotate(string,1);
	}
	public static void rightRotate(String string,int count) {
		int start=0,end=string.length();
		String res="";
		
			res+=string.substring(end-count, end);
			res+=string.substring(start,end-count);
		
		System.out.println(res);
	}
	public static void leftRotate(String string,int count) {
		int start=0,end=string.length();
		String res="";
		
			res+=string.substring(start+count,end);
			res+=string.substring(start,start+count );
			
		
		System.out.println(res);
	}
	
	
}
