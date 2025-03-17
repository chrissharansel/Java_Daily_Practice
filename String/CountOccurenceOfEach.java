package String;

import java.util.Scanner;

public class CountOccurenceOfEach {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		char[] ch=string.toCharArray();
		
		String res="";
		for(int i=0;i<string.length();i++) {
			int count=1;
			if(ch[i]!='0') {
			for(int j=i+1;j<string.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
					
				else break;
				
			}
			res+=ch[i]+""+count;
			}
			
		}
		
		System.out.println(res);
	}
	
}
