package chapter1_2;

public class length2 {
	
	public static void printChars(String str) {
		
		if(str.length()==0) // ���ڿ��� ���̰� 0�ϰ��
			return;
		else {
			System.out.println(str.charAt(0)); //ù���� ���
			printChars(str.substring(1)); // ù���ڸ� ������ ���� ��� // ���⸦ recursion���� ���
		}
	}
}
