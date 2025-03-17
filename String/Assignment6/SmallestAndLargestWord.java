package String.Assignment6;

import java.util.Scanner;

public class SmallestAndLargestWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		//smallestAndLargestWord(string);
		smallestAndLargestWordUsingSplit(string);
		
	}
	public static void smallestAndLargestWord(String string) {
		
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		String strMax="",strMin="";
		char ch[]=string.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++) {
			count=0;
			while(i<ch.length && ch[i]!=' ') {
				count++;
				i++;
			}
			if(count<min) {
				min=count;
				strMin=string.substring(i-count,i);
			}
			if(count>max) {
				max=count;
				strMax=string.substring(i-count,i);
			}
			
		
		}
		System.out.println("Min string="+strMin);
		System.out.println("Max string="+strMax);
	}

public static void smallestAndLargestWordUsingSplit(String string) {
	String[] str=string.split(" ");
	int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
	String maxString="",minString="";
	for(int i=0;i<str.length;i++) {
		if(str[i].length()>max) {
			max=str[i].length();
			maxString=str[i];
		}
		if(str[i].length()<min) {
			min=str[i].length();
			minString=str[i];
		}
	}
	System.out.println("Min string="+minString);
	System.out.println("Max string="+maxString);
	
}
}

//for(int j=nextCount;string.charAt(j)!=' ';j++) {
//	count++;
//	nextCount++;
//}
//
//System.out.println(count);
//if(count>max) {
//	max=count;
//	str=(String) string.subSequence(i, nextCount);
//}