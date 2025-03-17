package String;

import java.util.Scanner;

public class CheckNumberString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		System.out.println(checkString(string)?"String is a number string":"String is not a number string");
		
	}
	public static boolean checkString(String string) {
		for(char ch:string.toCharArray()){
			if(!(ch>=48 && ch<=57))
				return false;
		}
		return true;
	}
}
