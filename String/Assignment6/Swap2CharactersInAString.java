package String.Assignment6;

import java.util.Scanner;

public class Swap2CharactersInAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.nextLine();
		System.out.println(swap2Characters(string));
		
	}
	public static String swap2Characters(String string) {
		String res="";
		char[] ch=string.toCharArray();
		for(int i=0;i<ch.length-1;i+=2) {
			res+=ch[i+1]+""+ch[i];
			
		}
		return res;
	}
}

//java = ajav