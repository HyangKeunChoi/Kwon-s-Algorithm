package chapter1_2;

import java.util.Scanner;

// ���������Ϸκ��� n���� ���� �о���� - �߾Ⱦ��� ���
public class datafile {

	public void readForm(int n, int[] data, Scanner in) { // n�����������о  data�迭�� ����
		
		if(n==0)
			return;
		else
			readForm(n-1, data, in);
			data[n-1] = in.nextInt();
	}
}
