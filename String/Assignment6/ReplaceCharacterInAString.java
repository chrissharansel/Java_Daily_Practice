package String.Assignment6;

import java.util.Scanner;

public class ReplaceCharacterInAString {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string:");
			String string=sc.next();
			System.out.print("Enter the character to replace");
			char repChar=sc.next().charAt(0);
			System.out.print("Enter the character to be replaced");
			char remChar=sc.next().charAt(0);
			System.out.println("The string after replacing the character "+replaceCharacter(string, remChar, repChar));
			
	}
	public static String replaceCharacter(String string,char remChar,char repChar) {
		char ch[]=string.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==remChar) {
				ch[i]=repChar;
			}
		}
		String res=new String(ch);
		return res;
	}
}
