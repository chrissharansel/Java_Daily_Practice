package String.Assignment6;

import java.util.Scanner;

public class LeastFrequentDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		leastFrequent(string);
		
	}
	public static  void leastFrequent(String string) {
		char element=' ';
		int count,min=Integer.MAX_VALUE;
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
			
			if(count<min && count>0) {
				min=count;
				element=ch[i];
			}
			
		}
		}
		System.out.println(element+" is the least frequent element");
	}
			
	
}

