package chapter1_3;

public class sequential_search {
	int search(int[] data, int n, int target) {
		for(int i=0; i<n; i++) {
			if(data[i]==target)
				return i;
			
		}
		return -1;  // ã���ִ� ���� ����
		
		// 0�� �Ͻ���ǥ��, n-1�� �����ǥ��
	 }
}
