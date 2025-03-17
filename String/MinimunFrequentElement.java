package String;

import java.util.Scanner;

public class MinimunFrequentElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		System.out.println("The minimum frequent element: "+getFrequent(string));
	}
	public static char getFrequent(String string) {
		char[] ch1=string.toCharArray();
		int count=0,min=Integer.MAX_VALUE;
		char element=' ';
		for(int i=0;i<ch1.length;i++) {
			for(int j=i+1;j<ch1.length;j++) {
				if(ch1[i]==ch1[j]) {
					count++;
				}
			}	
			if(count<min) {
				min=count;
				element=ch1[i];
			}
			
		}
		return element;
	}
}
