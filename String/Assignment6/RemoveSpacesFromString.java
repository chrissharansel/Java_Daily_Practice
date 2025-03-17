package String.Assignment6;

import java.util.Scanner;

public class RemoveSpacesFromString {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string:");
			String str1=sc.next();
			String str2=sc.nextLine();
			
			System.out.println(removeSpaces(str1+str2));
		}
		public static String removeSpaces(String str) {
			return str.replace(" ","");
		}
}
