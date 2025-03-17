package String;

import java.util.Scanner;

public class VowelsAndConsonents {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string=sc.next().toLowerCase();
		int Vcount=0,Ccount=0;
		for(char c:string.toCharArray()) {
			switch(c) {
			case 'a','e','i','o','u':
				Vcount++;
				break;
			default:
				if((c>=97 && c<122) || (c>=65 && c<=91))
				Ccount++;
			}
		}
		System.out.println("Consonent count= "+Ccount+" Vowel count= "+Vcount);
	}
}
