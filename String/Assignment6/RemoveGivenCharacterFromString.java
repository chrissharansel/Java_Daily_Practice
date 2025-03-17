package String.Assignment6;

import java.util.Scanner;

public class RemoveGivenCharacterFromString {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string:");
			String string=sc.next();
			char ch[]=string.toCharArray();
			System.out.println("Enter a character:");
			char c=sc.next().charAt(0);
			System.out.println(removeCharacter(ch, c));
			
	}
	public static String removeCharacter(char[] chArr,char ch) {
		String res="";
		for(char c:chArr) {
			if(ch!=c)
				res+=c;
		}
		return res;
	}
}
