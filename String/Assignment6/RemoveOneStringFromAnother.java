package String.Assignment6;

import java.util.Scanner;

public class RemoveOneStringFromAnother {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string1=sc.next();
		System.out.print("Enter a string:");
		String string2=sc.next();
		System.out.println(removeOccurenceOfOneCharacterFromTheString(string1,string2));
		
	}
	public static String removeOccurenceOfOneCharacterFromTheString(String string1,String string2){
		int i=0;
		int j=i+1;
		char ch1[]=string1.toCharArray();
		char ch2[]=string2.toCharArray();
		for(;i<ch1.length;i++) {
			if(ch2[j]!=Character.MIN_VALUE) {
			for(;j<ch2.length;j++) {
				if(ch1[i]==ch2[j])
					ch1[j]=Character.MIN_VALUE;
			}
		}
	}
		String res="";
		for(int k=0;k<ch2.length;k++) {
			if(ch2[k]!=Character.MIN_VALUE)
				res+=ch2[k];
		}
		return res;
	}
	
	
}
