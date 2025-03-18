package String.Assignment6;

import java.util.Scanner;

public class ReverseWordsInAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		leastFrequent(string);
		
	}
	public static  void leastFrequent(String string) {
		String[] str=string.split(" ");
		String res="";
		for(int i=str.length-1;i>=0;i--) {
			res+=str[i]+" ";
		}
		System.out.println(res);
	}
			

}

