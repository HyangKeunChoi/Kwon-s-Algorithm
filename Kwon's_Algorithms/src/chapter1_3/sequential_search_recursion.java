package chapter1_3;

public class sequential_search_recursion {
	int search(int[] data, int begin, int end, int target) {
		
	
		
		// begin�� end���̿� �����Ͱ������Ѵٰ� ����
		// �˻������� �������� ��������� ������ ���
		
		
		if(begin>end) // �����Ͱ� ����
			
			return -1;
		
		else if(target==data[begin]) 
			return begin;
		else
			return search(data, begin+1, end, target);
	}
	
	
	// �ٸ�����  - �����γ�����
	int searchOtherVersion(int[] data, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}
		else {
			int middle = (begin+end) /2; // ����
			
			if(data[middle]==target)
				return middle;
			
			int index = search(data, begin, middle-1, target); // ������ ������ Ž��
			
			if( index!=-1) 
				return index;
			else // ������ ������ ã�� ���ߴٸ�
				return search(data, middle+1, end, target);
		}
	}
}
