package String.StringMethods;

import java.util.Arrays;

public class StringEquals {
	public static void main(String[] args) {
		String s1=new String("  hihello  ");
		String s2=new String("HI");
		System.out.println(s1.equals(s2));
		System.out.println("Hi".equalsIgnoreCase("hi"));
		System.out.println("hi".compareTo("Hi"));
		System.out.println(s1.toString());
		System.out.println(new String("Hello"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.lastIndexOf('i'));
		System.out.println(s1.toCharArray());
		System.out.println(s1.length());
		//System.out.println(s1.getBytes());
		System.out.println(Arrays.toString(s1.split(" ")));
		System.out.println(s1.substring(2));
		System.out.println(s1.trim());
		System.out.println();
	}
}
