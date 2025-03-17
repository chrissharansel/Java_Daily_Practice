package String;

import java.util.Scanner;

public class AnagramOfAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string1=sc.next();
		System.out.print("Enter a string:");
		String string2=sc.next();
		//System.out.println(checkAnagram(string1,string2)?"String is an anagram":"String is not an anagram");
		System.out.println(isAnagram(string1,string2)?"String is an anagram":"String is not an anagram");
	}
	public static boolean checkAnagram(String string1,String string2) {
		if(string1.length()!=string2.length()) 
			return false;
		char[] ch1=string1.toCharArray();
		char[] ch2=string2.toCharArray();
		
		int count=0;
		for(int i=0;i<string1.length();i++) {
			
			for(int j=0;j<string2.length();j++) {
				if(ch1[i]==ch2[j] && ch1[i]!=Character.MIN_VALUE &&ch2[j]!=Character.MIN_VALUE)
					{
					count++;
					ch1[i]=Character.MIN_VALUE;
					ch2[j]=Character.MIN_VALUE;
					}
			}
		}
		System.out.println(count);
		if(count==string1.length())
			return true;
		else return false;
	}
	
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		int[] arr=new int[26];
		int i=0;
		while(i<s1.length()) {
			arr[s1.charAt(i)-'a']++;
			i++;
		}
		i=0;
		while(i<s2.length()) {
			arr[s2.charAt(i)-'a']--;
			if(arr[s2.charAt(i)-'a']<0)
					return false;
				i++;
			}
		return true;
			}
}
