package String;

import java.util.Scanner;

public class GetFrequence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		countOfEachDuplicateElements(string);
		countOfDuplicateElements(string);
	}
	public static void countOfEachDuplicateElements(String string) {
		char[] ch=string.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]!=Character.MIN_VALUE) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=Character.MIN_VALUE;
				}
			}
			if(count>1) 
				System.out.println(ch[i]+" appeared "+count+" times");
			}
			
		}
	}
	public static void countOfDuplicateElements(String string) {
		char[] ch=string.toCharArray();
		int max=0;
		char element=Character.MIN_VALUE;
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]!=Character.MIN_VALUE) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=Character.MIN_VALUE;
				}
			}
			if(count>1) { 
			max=count;
			element=ch[i];
			}
			}
		}
		System.out.println("Element "+element+" has appreard the most("+max+')');
	}
		
	}