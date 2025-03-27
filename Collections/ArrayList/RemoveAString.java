package Collections.ArrayList;

import java.util.ArrayList;

public class RemoveAString {
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<>();
		str.add("ABC");
		str.add("DEF");
		str.add("GHI");
		str.add("ABDC");
		String key="ABC";
		System.out.println(str.remove(key)?"Removed":"Not present");
		for(String s:str) {
			System.out.println(s);
		}
	}
}
