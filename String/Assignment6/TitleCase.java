package String.Assignment6;

import java.util.Scanner;

public class TitleCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		convertTitleCase(string);
		
	}
	

public static void convertTitleCase(String string) {
	String[] str=string.split(" ");
	String res="";
	for(int i=0;i<str.length;i++) {
		res+=str[i].substring(0,1).toUpperCase()+str[i].substring(1,str[i].length())+" ";
	}
	System.out.println(res);
	
}
}
