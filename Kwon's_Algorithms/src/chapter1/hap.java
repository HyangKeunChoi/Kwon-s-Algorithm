package chapter1;

public class hap {
	
	public static void main(String[] args) {
		int result = func(4);
	}
	
	public static int func(int n) {
		if(n==0)
			return 0;
		else
			return n + func(n-1);
	}
}
