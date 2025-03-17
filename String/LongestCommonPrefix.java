package String;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int length=sc.nextInt();
		String[] stringArr=new String[length];
		for(int i=0;i<length;i++)
		{
			System.out.print("Enter a string:");
			stringArr[i]=sc.next();
		}
		System.out.println(getLongestPrefix(stringArr));
	
	}
	public static String getLongestPrefix(String string[]) {
		String res="";
		int k=2;
		res=string[0].substring(0,1);
		boolean flag=false;
		for(int i=1;i<string.length;i++) {
				
			for(int j=1;j<string[i].length();j++) {
				
				if(string[i].substring(0, j).equals(res)) {
				 flag=true;	
				}
				else {
					break;
				}
			}
				if(flag)
				res=string[0].substring(0, k++);
			
		}
		return res;
	}
	public static String getCommonPrefix(String string[]) {
		String res="";
		int j=1;
		for(int i=0;i<string[0].length();i++) {
				char c=string[0].charAt(i);
				int count=0;
			for(;j<string.length;j++) {
				
				if(c==string[j].charAt(i)) 
					count++;
				
				
			}
			if(count==string.length-1 && i<string[j].length()+1) {
				res=string[0].substring(0,i);
				break;
			}
			
		}
		return res;
	}
}
