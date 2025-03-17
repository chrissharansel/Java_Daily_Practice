package String;

import java.util.Scanner;

public class HexadecimalToDecimal {
	public static void main(String[] args) {
		getHexadecimal();
	}
	public static void getHexadecimal() {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int res=0,k=0;
		char[] ch=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			if(ch[i]>='0' && ch[i]<='9')
				res+=(ch[i]-'0')*pow(16,k++);
			else 
				res+=(ch[i]-55)*pow(16,k++);
			
				
	}
		System.out.println(res);
}
	public static int pow(int base,int pow) {
		int exp=1;
		if(pow==0)
			return 1;
		for(int i=0;i<pow;i++) {
			exp*=base;
		}
		return exp;
	}
}
