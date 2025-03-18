package String.Assignment6;

import java.util.Scanner;

public class EqualSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next();
		System.out.println(getEqualSubstring012(string));
	}
	public static int getEqualSubstring(String string) {
		int length=string.length();
		int occ=0;
		for(int i=0;i<length-3;i++) {
			char[] ch=string.substring(i,3+i).toCharArray();
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[j]=='0' || ch[j]=='1'||ch[j]=='2')
					count++;
			}
			if(count%3==0) {
			occ++;	
			}
		
			
		}
		return occ;
	}
	public static int getEqualSubstring012(String string) {
		int occ=0;
		for(int i=0;i<string.length();i++) {
			String res="";
			for(int j=i;j<string.length();j++) {
				res+=string.charAt(j);
				if(res.length()%3==0) {
					char ch[]=res.toCharArray();
					//System.out.println(res);
					int count=0;
					for(int k=0;k<ch.length;k++) {
						if(ch[k]=='0' || ch[k]=='1' ||ch[k]=='2')
							count+=ch[k]-'0';
					}
					if(count%3==0) {
						occ++;	
						}
				}
			}
			
			
		}
		return occ;
	}
}

