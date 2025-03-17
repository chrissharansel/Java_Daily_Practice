package String;
import java.util.Scanner;
public class LongestPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] strArray=new String[5];
		for(int i=0;i<strArray.length;i++) 
		{
			System.out.print("Enter a string:");
			strArray[i]=sc.next();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<strArray.length;i++) 
		{
			if(strArray[i].length()>max)
			max=strArray[i].length();
		}
		for(int i=0;i<strArray.length;i++) 
		{
			if(strArray[i].length()==max)
				System.out.println(strArray[i]);
		}
		
	}
}
