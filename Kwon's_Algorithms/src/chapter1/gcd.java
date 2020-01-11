package chapter1;

public class gcd {

	public static double gcd(int m, int n) {
		if(m<n) {
			int tmp=m; m=n; n=tmp; // swap m and n
		}
		
		if(m%m==0)
			return n;
		else
			return gcd(n, m%n);
	}
}
