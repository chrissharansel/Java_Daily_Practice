package String.Assignment6;

import java.util.Scanner;

public class FirstDuplicateAndFirstDistinct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		duplicateAndDistinctElements(string);
		
	}
	public static String duplicateAndDistinctElements(String string) {
		String res="";
		int count,fdcount=0,fccount=0;
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
			if(count==0 && fccount!=1) {
				System.out.println("The First Unique Element:"+ch[i]);
				fccount++;
				continue;
				
			}
			if(count>0 && fdcount!=1) {
				System.out.println("The First Duplicate Element:"+ch[i]);
				fdcount++;
				continue;
				
			}
			if(fdcount==1 && fccount==1)
				break;
			}
		}
		return res;
	}
}
