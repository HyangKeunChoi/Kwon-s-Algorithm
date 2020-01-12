package chapter1_2;

// 문자열을 뒤집어서 프린트

public class length3 {
	public static void printCharsReverse(String str) {
		if(str.length()==0)
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}
}
