package chapter1_2;
// 2������ ��ȯ�Ͽ� ���
public class binary {
	public void printInBinary(int n) {
		if(n<2)
			System.out.println(n);
		else {
			printInBinary(n/2);
			System.out.println(n%2);
		}
	}
}
