package String.Assignment6;

import java.util.Scanner;

public class PrintDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		System.out.println(duplicateElements(string));
		
	}
	public static String duplicateElements(String string) {
		String res="";
		int count;
		char ch[]=string.toCharArray();
		for(int i=0;i<ch.length;i++) {
			count=0;
			if(ch[i]!=Character.MIN_VALUE) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=Character.MIN_VALUE;
				}
			}
			if(count>0) 
				res+=ch[i];
			}
		}
		return res;
	}
}
