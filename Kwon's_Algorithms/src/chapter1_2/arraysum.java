package chapter1_2;
// 배열의 합 구하기
public class arraysum {
	public static int sum(int n, int[] data) { // n은 데이터개수
		if(n<=0)
			return 0;
		else
			return sum(n-1, data) + data[n-1];
	}
}
