package chapter1_3;

public class sequential_search_recursion {
	int search(int[] data, int begin, int end, int target) {
		
	
		
		// begin과 end사이에 데이터가존재한다고 가정
		// 검색구간의 시작점을 명시적으로 지정한 경우
		
		
		if(begin>end) // 데이터가 없다
			
			return -1;
		
		else if(target==data[begin]) 
			return begin;
		else
			return search(data, begin+1, end, target);
	}
	
	
	// 다른버전  - 반으로나누기
	int searchOtherVersion(int[] data, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}
		else {
			int middle = (begin+end) /2; // 절반
			
			if(data[middle]==target)
				return middle;
			
			int index = search(data, begin, middle-1, target); // 절반의 전까지 탐색
			
			if( index!=-1) 
				return index;
			else // 절반의 전까지 찾지 못했다면
				return search(data, middle+1, end, target);
		}
	}
}
