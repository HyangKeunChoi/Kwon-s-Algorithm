package chapter1_3;
// �ִ밪 ã�� - recursion����
public class findMax {
	
	// begin<=end��� ����
	int findMaxfunc(int[] data, int begin, int end) {
		if(begin==end)
			return data[begin];
		else
			return Math.max(data[begin], findMaxfunc(data, begin+1, end));
	}
}
