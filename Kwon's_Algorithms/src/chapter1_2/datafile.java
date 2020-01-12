package chapter1_2;

import java.util.Scanner;

// 데이터파일로부터 n개의 정수 읽어오기 - 잘안쓰는 경우
public class datafile {

	public void readForm(int n, int[] data, Scanner in) { // n개의파일을읽어서  data배열에 저장
		
		if(n==0)
			return;
		else
			readForm(n-1, data, in);
			data[n-1] = in.nextInt();
	}
}
