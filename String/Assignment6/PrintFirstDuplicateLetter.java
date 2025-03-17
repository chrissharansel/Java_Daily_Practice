package String.Assignment6;

import java.util.Scanner;

public class PrintFirstDuplicateLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		char ch[]=string.toCharArray();
		for(int i=0;i<string.length();i++) {
			int count=1;
			if(ch[i]!=Character.MIN_VALUE) {
			for(int j=i+1;j<string.length();j++) {
				if(ch[i]==ch[j]) {
					ch[j]=Character.MIN_VALUE;
					count++;
				}
			}
			if(count!=1) {
				System.out.println(ch[i]);
				break;
			}
			}	
		}
	}
	}
