package chapter2_0_RecursionApplication;

public class Maze {
	
	private static int N=8;
	private static int[][] maze = {
			{0, 0, 0, 0, 0 ,0 ,0 ,1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	private static final int PATHWAY_COLOUR =0; // white // �����ٴҼ��ִ� ���
	private static final int WALL_COLOUR =1; //blue // ��
	private static final int BLOCKED_COLOUR =2; //red // �̹� �湮�� ���(������ ���ʿ����)
	private static final int PATH_COLOUR =3; // green // �̹� �湮�� ���(������ ���ɵ��� �𸣴� ���)



	public static boolean findmazePath(int x, int y) {
		if(x<0 || y<0 || x>=N || y>=N)
			return false;
		else if(maze[x][y] != PATHWAY_COLOUR)
			return false;
		else if( x==N-1 && y==N-1) {
			maze[x][y] = PATH_COLOUR;
			return true;			
		} else {
			maze[x][y] = PATH_COLOUR;
			if(findmazePath(x-1,y) || findmazePath(x,y+1)
				|| findmazePath(x+1, y) || findmazePath(x,y-1)){
					return true;
				}
			maze[x][y] = BLOCKED_COLOUR; // dead end �� �ڸ��� ���̴�
			return false;
		}
				
	}

	
	public static void main(String[] args) {
		// printMaze();
		findmazePath(0, 0); // 00���� ����
		// printMaze();
	}

}
