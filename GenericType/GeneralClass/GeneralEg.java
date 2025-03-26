package GenericType.GeneralClass;
import java.util.Collections;

public class GeneralEg {
	public static void main(String[] args) {
		General g1=new General(10);
		General g2=new General("String");
		Object [] arr=new Object[10];
		arr[0]=10;
		arr[1]="String";
		System.out.println(arr[0]);
		}
}
