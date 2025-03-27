package Collections.ArrayList;

import java.util.ArrayList;

public class SearchingAString {
	public static void main(String[] args) {
		ArrayList<String>str=new ArrayList<String>();
		str.add("Hello");
		str.add("ABC");
		str.add("park");
		str.add("ard");
		System.out.println(str.contains("park"));
	}
}
