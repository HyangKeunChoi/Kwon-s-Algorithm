package chapter1_2;

public class length {

	// 문자열의 길이구하기
	public static int len(String str) {
		
		if(str.equals("") ) { // 문자열의 길이가 0이면 0
			return 0;
		} else {
			return 1+len(str.substring(1)); //원래문자열에서 맨앞의 문자열을 제거한 나머지문자열
		}
		
	}
}
