package chapter1_3;

public class sequential_search {
	int search(int[] data, int n, int target) {
		for(int i=0; i<n; i++) {
			if(data[i]==target)
				return i;
			
		}
		return -1;  // 찾고있는 값이 없다
		
		// 0은 암시적표현, n-1은 명시적표현
	 }
}
