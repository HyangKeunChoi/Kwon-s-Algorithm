package chapter1_3;
// 최대값 찾기 - recursion개념
public class findMax {
	
	// begin<=end라고 가정
	int findMaxfunc(int[] data, int begin, int end) {
		if(begin==end)
			return data[begin];
		else
			return Math.max(data[begin], findMaxfunc(data, begin+1, end));
	}
}
