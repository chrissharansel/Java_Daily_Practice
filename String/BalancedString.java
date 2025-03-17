package String;

import java.util.Scanner;

public class BalancedString {
	 public static void main(String[] args) {
		 	Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string:");
			String string=sc.next();
			System.out.println(checkBalanced(string)?"The string is balanced":"The string is not balanced");
			
	}
	public static boolean checkBalanced(String string) {
		boolean flag=false;
		char[] ch=string.toCharArray();
		for(int i=0;i<string.length();i++) {
			if(ch[i]!=Character.MIN_VALUE) {
			for(int j=i+1;j<string.length();j++) 
			{
				switch(ch[i]) {
				case '{':
					if(ch[j]=='}')
						flag=true;
					else flag=false;
					ch[i]=Character.MIN_VALUE;ch[j]=Character.MIN_VALUE;
					break;
				case '(':
					if(ch[j]==')')
						flag=true;
					else flag=false;
					ch[i]=Character.MIN_VALUE;ch[j]=Character.MIN_VALUE;
					break;
				case '[':
					if(ch[i]==']')
						flag=true;
					else flag=false;
					ch[i]=Character.MIN_VALUE;ch[j]=Character.MIN_VALUE;
					break;
				case '<':
					if(ch[j]=='>')
						flag=true;
					else flag=false;
					ch[i]=Character.MIN_VALUE;ch[j]=Character.MIN_VALUE;
					break;
				}
			}
			}
		}
		return flag;
	}
}
