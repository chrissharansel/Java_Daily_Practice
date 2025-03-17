package String;

import java.util.Scanner;

public class GetTheFirstUniqueElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		System.out.println("The first unique element:"+getUniqueElementOpt(string));
		//System.out.println("The first unique element:"+getUniqueElementUsingSubstringMethod(string));
	}
	public static char getUniqueElementUsingSubstringMethod(String string) {
		for(int i=0;i<string.length();i++) {
			for(int j=i+1;j<string.length();j++) {
			if(string.charAt(i)==string.charAt(j)) {
				string=string.substring(0,i)+string.substring(i+1);
				i--;
			}
			}
		}
		return (string.charAt(0));
	}
		public static char getUniqueElementOpt1(String string) {
			char[] ch1=string.toCharArray();
			
			for(int i=0;i<ch1.length;i++) 
			{
				int count=1;
				if(ch1[i]!='0')
				{
					for(int j=i+1;j<ch1.length;j++) 
					{
					if(ch1[i]==ch1[j])
					{
						ch1[j]='0';
						count++;
					}
					}
					
					if(count==1) 
						return (ch1[i]);
			
				}
			}
				
			
			return 0;
			
			
			
		}
		public static char getUniqueElementOpt(String string) {
			char[] ch1=string.toCharArray();
			
			for(int i=0;i<ch1.length;i++) 
			{
				int count=1;
				if(ch1[i]!='0')
				{
					for(int j=i+1;j<ch1.length;j++) 
					{
					if(ch1[i]==ch1[j])
					{
						ch1[j]='0';
						count++;
					}
					}
					
					if(count==1) 
						return (ch1[i]);
			
				}
			}
				
			
			return 0;
			
			
			
		}

}
