package Area;

public class MaxOf3 {
public int max(int a,int b) {
	return a>b?a:b;
}
public int max(int a,int b,int c) {
	return a>b &&a>c?a:b>c?b:c;
}

public int max(int a,int b,int c,int d) {
	return a>b &&a>c&&a>d?a:b>c?b:c>d?c:d;
}
}
