package chapter1_2;

public class length {

	// ���ڿ��� ���̱��ϱ�
	public static int len(String str) {
		
		if(str.equals("") ) { // ���ڿ��� ���̰� 0�̸� 0
			return 0;
		} else {
			return 1+len(str.substring(1)); //�������ڿ����� �Ǿ��� ���ڿ��� ������ ���������ڿ�
		}
		
	}
}
