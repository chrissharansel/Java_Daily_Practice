package String;

import java.util.Scanner;

public class CheckPangram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str=sc.next();
		String string=sc.nextLine();
		//System.out.println(str+string);
		System.out.println(checkPanagram(str+string));
		}
	public static boolean checkPanagram(String string)
	{
		System.out.println(string);
		int[] arr=new int[26];
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)>='a' && string.charAt(i)<='z')
			arr[string.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]==0)
				return false;
	}
		return true;
}
}
