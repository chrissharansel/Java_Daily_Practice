package ComparatorType.Mobile;
import java.util.Arrays;
import java.util.Comparator;
public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung",15000.9,64);
		Mobile m2=new Mobile("Oppe",150000.9,128);
		Mobile m3=new Mobile("Redme",45000.9,256);
		Mobile m4=new Mobile("Apple",20000.9,24);
		Mobile m5=new Mobile("Bottle",19000.9,46);
		Mobile[] mobile= {m1,m2,m3,m4,m5};
		Comparator c=new RamComparator();
		Arrays.sort(mobile,c);
		for(Mobile m:mobile) {
			System.out.println(m);
		}
	}
	
}
