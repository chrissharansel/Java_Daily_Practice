package String.Assignment6;

import java.util.Scanner;

public class ExpandString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		System.out.println("Expanded String: "+expandString(string));
		
	}
	public static String expandString(String string) {
		char ch[]=string.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			int num=ch[i]-'0';
				for(int j=0;num<=9&&j<num;j++) {
					res+=ch[i+1];
				}
		}
		return res;
	}
}
