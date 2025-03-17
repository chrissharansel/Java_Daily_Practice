package String;

import java.util.Scanner;

public class CompressString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		compressArray(string);
	}
	public static void compressArray(String string) {
		char[] arr=string.toCharArray();
		String res="";
		for(int i=0;i<arr.length;i++) {
			int count=0;
			boolean flag=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i>j) 
					flag=true;
				else if(arr[i]==arr[j])
					count++;
			}
			if(!flag)
			res+=count+""+arr[i];
		}
		System.out.println(res);
	}
	
}
