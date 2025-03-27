package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddList {
	public static void main(String[] args) {
		ArrayList a=new ArrayList(10);
		a.add(10);
		a.add(20);
		a.add(10.5);
		a.add("Hello");
		int[] arr={1,2,3,4};
		a.add(arr);//Passing the object reference
		a.add(Arrays.toString(arr));//Passing it as string
		System.out.println(a);
	}
}
