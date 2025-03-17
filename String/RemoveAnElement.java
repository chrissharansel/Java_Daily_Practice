package String;

import java.util.Scanner;

public class RemoveAnElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		System.out.print("Enter a char to remove:");
		char element=sc.next().charAt(0);
		//System.out.println(removeElement(string,element)?"The string is found ":"The string is not found");
		System.out.println(removeElementWithSubstringMethod(string,element));
	}
	public static boolean removeElement(String string,char element) {
		char[] ch1=string.toCharArray();
		int count=0;
		boolean flag=false;
		
		for(int i=0;i<ch1.length;i++) {
				if(ch1[i]==element) {
					ch1[i]='0';
					count++;
					flag=true;	
				}	
		}
		char[] res=new char[ch1.length-count];
		int pos=0;
		for(char ele:ch1) {
			if(ele!='0')
				res[pos++]=ele;
		}
		 return flag;
		
	}
	public static String removeElementWithSubstringMethod(String string,char element) {
		boolean flag=false;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==element) {
				string=string.substring(0,i)+string.substring(i+1);
				flag=true;
				i--;
				
			}
		}
		
		if(flag)
			return string;
		else
			return "Not found";
	}
	}

