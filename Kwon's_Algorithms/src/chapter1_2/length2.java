package chapter1_2;

public class length2 {
	
	public static void printChars(String str) {
		
		if(str.length()==0) // 문자열의 길이가 0일경우
			return;
		else {
			System.out.println(str.charAt(0)); //첫글자 출력
			printChars(str.substring(1)); // 첫글자를 제외한 글자 출력 // 여기를 recursion으로 출력
		}
	}
}
