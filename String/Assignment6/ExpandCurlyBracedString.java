package String.Assignment6;

import java.util.Scanner;

public class ExpandCurlyBracedString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		System.out.println("Expanded String: \n"+expandString(string));
		
	}
	public static String expandString(String string) {
		char ch[]=string.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='{' && ch[i]!='}') {
			int num=ch[i]-'0';
				for(int j=0;num<=9&&j<num;j++) {
					res+=string.substring(i+2,i+5)+" ";
				}
				if(num<=9)
					res+="\n";
		}
		}
		return res;
	}
}
