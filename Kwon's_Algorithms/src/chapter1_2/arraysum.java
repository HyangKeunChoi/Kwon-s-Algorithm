package chapter1_2;
// �迭�� �� ���ϱ�
public class arraysum {
	public static int sum(int n, int[] data) { // n�� �����Ͱ���
		if(n<=0)
			return 0;
		else
			return sum(n-1, data) + data[n-1];
	}
}
