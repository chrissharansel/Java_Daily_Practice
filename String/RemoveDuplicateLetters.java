package String;

import java.util.Scanner;

public class RemoveDuplicateLetters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next(),res=new String();
		usingCharArray(string);
		//usingOpt(string,res);
		
	}
	public static void usingCharArray(String string) {
		char[] ch1=string.toCharArray();
		int count=0,length=0;
		for(int i=0;i<ch1.length;i++) {
			for(int j=i+1;j<ch1.length;j++) {
				if(ch1[i]==ch1[j]) {
					ch1[j]='0';
					count++;
				}
			}	
			if(count==1)
				length++;
		}
		char[] ch2=new char[ch1.length-length];
		int pos=0;
		for(char ch:ch1) {
			if(ch!='0')
				ch2[pos++]=ch;
		}
		String st=new String(ch2);
		System.out.println(st);
	}
	
}
