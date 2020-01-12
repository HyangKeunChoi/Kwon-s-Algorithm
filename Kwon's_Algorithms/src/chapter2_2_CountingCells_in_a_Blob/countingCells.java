package chapter2_2_CountingCells_in_a_Blob;

public class countingCells {
	
	private static int N = 7;
	private static int[][] grid;
	
	private static int BACKGROUND_COLOR =0;
	private static int IMAGE_COLOR =1;
	private static int ALREADY_COUNTED =2;
	
	public int countCells(int x, int y) {
		int result;
		if(x<0 || x>=N || y<0 || y>=N) // N���� N�̴ϱ�
			return 0;
		else if (grid[x][y] != IMAGE_COLOR) // backgroundĮ�� �ų� �̹� ��ĥ�� Į��
			return 0;
		else {
			grid[x][y] = ALREADY_COUNTED;
			return 1 + countCells(x-1, y+1) +countCells(x,y+1)
			+ countCells(x+1, y+1) + countCells(x-1, y)
			+ countCells(x+1, y) + countCells(x-1, y-1)
			+ countCells(x, y-1) + countCells(x+1, y-1);
		}
	}
	
	
	
	
	
	
	
}
